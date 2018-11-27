package br.edu.fbv.dowloadarquivos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class DowloadVideo implements Runnable {
	
	String urlDowload;
	String name;
	String caminho ;
	
	public DowloadVideo(String url , String name , String caminho) {
		this.urlDowload = url;
		this.name = name;
		this.caminho = caminho;
	}
	
	
	
	
	@Override
	public void run() {
		
	
		String f= caminho+""+name+".mp4";
		
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
			//System.out.println("Download complete video ");
			
			//String msg = "baixou ";
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}

}
