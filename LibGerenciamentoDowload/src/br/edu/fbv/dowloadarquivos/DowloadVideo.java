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

import br.edu.fbv.templatemethod.DowloadTemplate;


public class DowloadVideo extends DowloadComObservable {
	
	public DowloadVideo(String url, String name, String caminho) {
		super(url, name, caminho);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String caminhoExtensao(String caminho, String name) {
		// TODO Auto-generated method stub
		String f= caminho+""+name+".mp4";
		return  f;
	}
	
	

}
