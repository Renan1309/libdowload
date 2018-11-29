package br.edu.fbv.templatemethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class DowloadTemplate implements Runnable {
	
	
	String urlDowload;
	String name;
	String caminho ;
	
	public  DowloadTemplate(String url , String name , String caminho) {
		this.urlDowload = url;
		this.name = name;
		this.caminho = caminho;
	}
	
	public abstract String caminhoExtensao(String caminho , String name);
	
	
	
	public void run() {
		
	
		//String f= caminho+""+name+".mp3";
		
		String f = caminhoExtensao(caminho, name);
		
		URL url;
		try {
			url = new URL(urlDowload);
			//HttpURLConnection http = (HttpURLConnection)url.openConnection();
			//double fileSize = (double) http.getContentLengthLong();
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
	
	
}

}
