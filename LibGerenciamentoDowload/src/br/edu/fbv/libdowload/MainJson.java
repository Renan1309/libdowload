package br.edu.fbv.libdowload;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import br.edu.fbv.Factory.ClassFactoryJson;
import br.edu.fbv.listagem.RetornaMusicaJson;
import br.edu.fbv.model.Musica;
import br.edu.fbv.model.Video;
import br.edu.fbv.observer.DowloadRealizado;
import br.edu.fbv.observer.NotificarDowload;
import br.edu.fbv.templatemethod.RetornaJsonTemplate;
import br.edu.fbvCodAntigo.RetornaJsonMusica;
import br.edu.fbvCodAntigo.RetornaJsonVideo;

public class MainJson {
	
	//Padrão Strategy
	
	 ExecutorService ex79 = Executors.newCachedThreadPool();
	 
	 ClassFactoryJson factoryJson = new ClassFactoryJson();
	
	public List responseJson(String metodo , String url) throws InterruptedException, ExecutionException {
		
		
		
		
		if(metodo.equals("jmusica")) {
			
			
			RetornaJsonMusica retjson = new RetornaJsonMusica(url);
			
			
			 Future<List> submit =  ex79.submit(retjson);
			 
			Future<List> future = submit;
			
			 
			return future.get() ;
			
			
			
			//String urlx = "https://libprogavancada.herokuapp.com/musica";
			//RetornaTeste retjson = new RetornaTeste(urlx);
		/*
			RetornaJsonTemplate jsonmusica =  factoryJson.getJson(metodo, url);
			 Future<List> submit =  ex79.submit(jsonmusica);
			 
			Future<List> future = submit;
			
			
			List<Musica> listvideo = future.get();
			
			
				
		
			
			
			return listvideo;
			*/
			
		}
		if(metodo.equals("jvideo")) {
			
			RetornaJsonVideo jsonvideo = new RetornaJsonVideo(url);
			
			 Future<List> submit =  ex79.submit(jsonvideo);
			 
				Future<List> future = submit;
				
				return future.get();
			
			//String urlx = "https://libprogavancada.herokuapp.com/musica";
			//RetornaTeste retjson = new RetornaTeste(urlx);
		/*
			RetornaJsonTemplate jsonmusica =  factoryJson.getJson(metodo, url);
			 Future<List> submit =  ex79.submit(jsonmusica);
			 
			Future<List> future = submit;
			
			List<Video> listvideo = future.get();
			
			return listvideo;
			
			
			*/
		}
		return null;
		
		
		
		
	}

}
