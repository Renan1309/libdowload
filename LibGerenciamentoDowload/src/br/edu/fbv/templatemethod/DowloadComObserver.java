package br.edu.fbv.templatemethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class DowloadComObserver implements Callable<String> {
	
	String urlDowload;
	String name;
	String caminho ;
	
	public  DowloadComObserver(String url , String name , String caminho) {
		this.urlDowload = url;
		this.name = name;
		this.caminho = caminho;
	}
	
	public abstract String caminhoExtensao(String caminho , String name);
	
	
	
	public String call() {
		
	
		
		String f = caminhoExtensao(caminho, name);
		
		URL url;
		try {
			url = new URL(urlDowload);
			
			InputStream in = url.openStream();
			FileOutputStream fos = new FileOutputStream(f);
			int bytes = 0;
			

			while ((bytes = in.read()) != -1) {
				fos.write(bytes);
			}

			
			in.close();
			fos.close();
			
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String response = "Baixou "+name ;
		
		
		
		
		return response;
	
	
}

}



