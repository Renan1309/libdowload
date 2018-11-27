package br.edu.fbv.dowloadarquivos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DowloadImg implements Runnable {
	

	String urlDowload;
	String name;
	String caminho ;
	
	public DowloadImg(String url , String name , String caminho) {
		this.urlDowload = url;
		this.name = name;
		this.caminho = caminho;
	}
	
	@Override
	public void run() {
		//"C:\\Users\\renan\\"+name+".jpg";
		
		// TODO Auto-generated method stuz
		String f= caminho+""+name+".jpg";;
		
		
		URL url;
		try {
			url = new URL(urlDowload);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			//double fileSize = (double) http.getContentLengthLong();
			BufferedInputStream in = new BufferedInputStream(http.getInputStream());
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
			byte[] buffer = new byte[1024];
			double dowloaded = 0.00;
			int read =0;
			double percent = 0.00;
			
			

			while ((read = in.read(buffer , 0 , 1024)) >= 0) {
				bout.write(buffer, 0, read);
				dowloaded += read ;
				//percent = (dowloaded*100)/fileSize;
				String percentual = String.format("%.4f", percent);
				//System.out.println("Dowloaded"+ percentual + "%");
				
			}

			bout.close();
			in.close();
			System.out.println("Download complete ");
			
			String msg = "baixou ";
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
}
