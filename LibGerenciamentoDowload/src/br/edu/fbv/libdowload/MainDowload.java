package br.edu.fbv.libdowload;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import br.edu.fbv.Factory.ClassFactoryDowloads;
import br.edu.fbv.dowloadarquivos.DowloadComObservable;
import br.edu.fbv.dowloadarquivos.DowloadImg;
import br.edu.fbv.observer.DowloadRealizado;
import br.edu.fbv.observer.NotificarDowload;
import br.edu.fbv.templatemethod.DowloadComObserver;


public class MainDowload {
	
	 public static MainDowload instancia;
	 
	    protected MainDowload() {
	    }
	 
	    public static MainDowload getInstancia() {
	        if (instancia == null)
	            instancia = new MainDowload();
	        return instancia;
	    }
	
	 ExecutorService ex7 = Executors.newCachedThreadPool();
	 
	
	 

	//Padrão Strategy
	 
	 public String  MetodoDowload(String urldowload , String name, String caminho , String metodo ) throws InterruptedException, ExecutionException {
		// TODO Auto-generated constructor stub
		 
		 ClassFactoryDowloads factoryDowloads = new ClassFactoryDowloads();

		 if (metodo.equals("dmusica")) {
			 
			 
			DowloadComObserver dowloadmusica = factoryDowloads.getDowloads(urldowload, name, caminho, metodo);

			Future<String> response = ex7.submit(dowloadmusica);

			String finalresposta = response.get();

			DowloadRealizado realizado = new DowloadRealizado();
			NotificarDowload not = new NotificarDowload();

			realizado.addObserver(not);

			if (finalresposta.length() != 0) {
				realizado.mudarEstado();
			}

			return finalresposta;
			
			
		}
		 else if(metodo.equals("dvideo")) {
			 
			// DowloadVideo dowloadvideo = new DowloadVideo(urldowload, name, caminho);
			 
			DowloadComObserver dowloadvideo = factoryDowloads.getDowloads(urldowload, name, caminho, metodo);

			Future<String> response = ex7.submit(dowloadvideo);

			String finalresposta = response.get();

			DowloadRealizado realizado = new DowloadRealizado();
			NotificarDowload not = new NotificarDowload();

			realizado.addObserver(not);

			if (finalresposta.length() != 0) {
				realizado.mudarEstado();
			}

			return finalresposta;
				
			
		 }
		 else if (metodo.equals("d")) {
			 
		 DowloadComObservable dowloadComObservable = new DowloadComObservable(urldowload , name, caminho);
		 
		 Future<String> response = ex7.submit(dowloadComObservable);
			 
		 String finalresposta = response.get();
			 
		  DowloadRealizado realizado = new  DowloadRealizado();
			NotificarDowload not = new  NotificarDowload();

			realizado.addObserver(not);
			
			if(finalresposta.length() !=0) {
				realizado.mudarEstado();
			}
			
			
			 return finalresposta ;
			
		}
		 else if(metodo.equals("dimagem")) {
			 DowloadComObservable dowloadimagem = new DowloadImg(urldowload , name, caminho);
			 Future<String> response = ex7.submit(dowloadimagem);
			 
			 String finalresposta = response.get();
				 
			  DowloadRealizado realizado = new  DowloadRealizado();
				NotificarDowload not = new  NotificarDowload();

				realizado.addObserver(not);
				
				if(finalresposta.length() !=0) {
					realizado.mudarEstado();
				}
				
				
				 return finalresposta ;
				
			 
		 }
		return null;
		 
		 
		 
		 
	}
	 
}

/*
String ff = "https://libprogavancada.herokuapp.com/musica/";
RetornaJsonMusica json = new RetornaJsonMusica(ff);
DowloadRealizado realizado = new  DowloadRealizado();
NotificarDowload not = new  NotificarDowload();

realizado.addObserver(not);
*/
