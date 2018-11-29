package br.edu.fbvCodAntigo;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import br.edu.fbv.dowloadarquivos.DowloadImg;
import br.edu.fbv.dowloadarquivos.DowloadMusica;
import br.edu.fbv.dowloadarquivos.DowloadVideo;
import br.edu.fbv.model.Video;

public class libdowload {
	
	 ExecutorService ex = Executors.newCachedThreadPool();
	
	public List dowloadjson () throws IOException, InterruptedException, ExecutionException {
		 ExecutorService execx = Executors.newCachedThreadPool();
		
		String url = "https://libprogavancada.herokuapp.com/musica";
		RetornaJsonMusica retjson = new RetornaJsonMusica(url);
	
		
		 Future<List> submit =  ex.submit(retjson);
		 
		Future<List> future = submit;
		
		 System.out.println("thread json");
		return future.get() ;
	}
	
	public void dowloadVideo(String url , String name , String caminho ) {
		
		 DowloadVideo dowloadvideo = new DowloadVideo(url, name, caminho);
		
		//Dowloadteste teste = new Dowloadteste(url, name, caminho);
		 System.out.println("execultando thread Vídeo");
		
		//ex.execute(dowloadvideo);
		
		
	}
	
	public void dowloadMusica (String url , String name , String caminho ){
		// TODO Auto-generated method stub
		
		DowloadMusica dowloadMusica = new DowloadMusica(url, name, caminho);
		
		 System.out.println("execultando thread Musica");
		ex.execute(dowloadMusica);

	}
	
 	public String dowloadImg (String url , String name , String caminho   ) throws IOException {
 		
 		
 		//String caminho = "C:\\Users\\renan\\"+name+".jpg";
 		
		
		DowloadImg obj = new DowloadImg(url , name, caminho);
		 System.out.println("execultando thread Imagem");
		ex.execute(obj);
		
		//poolthread(obj);
		
		String mensagem = null ;
		
	
		
		
		
		return mensagem;
	}
 	
 	public void poolthread (Runnable name) {
 		
 		int nut = 1;
 		 //ExecutorService exec = Executors.newFixedThreadPool(nut);
 		 ExecutorService exec = Executors.newCachedThreadPool();
		 exec.execute(name);
		 
		 System.out.println("execultando thread");
 		
 	}
	
 	
	public List<Video> poolthreadjson (Callable<List> name) {
 		
 		int nut = 1;
 		// ExecutorService exec = Executors.newFixedThreadPool(nut);
 		 ExecutorService exec = Executors.newCachedThreadPool();
		
 		 
 		
		 
		 System.out.println("execultando thread");
		return null;
 		
 	}

}
