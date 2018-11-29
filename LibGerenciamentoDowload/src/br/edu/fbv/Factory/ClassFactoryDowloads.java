package br.edu.fbv.Factory;

import br.edu.fbv.dowloadarquivos.DowloadImg;
import br.edu.fbv.dowloadarquivos.DowloadMusica;
import br.edu.fbv.dowloadarquivos.DowloadVideo;
import br.edu.fbv.templatemethod.DowloadComObserver;
import br.edu.fbv.templatemethod.DowloadTemplate;

public class ClassFactoryDowloads {
	
	public DowloadComObserver getDowloads(String urldowload , String name, String caminho , String metodo) {
		
		if(metodo.equals("dmusica")) {
			
			return new DowloadMusica(urldowload, name, caminho);
			
		} 
		else if(metodo.equals("dvideo")) {
			 
			 return  new DowloadVideo(urldowload, name, caminho);
			 
			
		 }
		 else if (metodo.equals("dimagem")) {
			 
			return new DowloadImg(urldowload , name, caminho);
			 
			
			
		}
		return null;	
		
		
	}

}
