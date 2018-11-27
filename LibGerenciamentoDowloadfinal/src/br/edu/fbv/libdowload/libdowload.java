package br.edu.fbv.libdowload;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import br.edu.fbv.dowloadarquivos.DowloadImg;
import br.edu.fbv.dowloadarquivos.RetornaJson;
import br.edu.fbv.model.Video;

public class libdowload {
	
	public List dowloadjson () throws IOException, InterruptedException, ExecutionException {
		 ExecutorService execx = Executors.newCachedThreadPool();
		
		String url = "https://libprogavancada.herokuapp.com/musica";
		RetornaJson retjson = new RetornaJson(url);
	
		
		 Future<List> submit =  execx.submit(retjson);
		 
		Future<List> future = submit;
		
		 System.out.println("thread json");
		return future.get() ;
	}
	
	
	
 	public String dowloadImg (String url , String name  ) throws IOException {
 		
 		
 		String caminho = "C:\\Users\\renan\\"+name+".jpg";
 		
		
		DowloadImg obj = new DowloadImg(url , name, caminho);
		
		poolthread(obj);
		
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
