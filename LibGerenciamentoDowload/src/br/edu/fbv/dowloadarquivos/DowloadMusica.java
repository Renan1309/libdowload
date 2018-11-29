package br.edu.fbv.dowloadarquivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import br.edu.fbv.templatemethod.DowloadTemplate;

public class DowloadMusica extends DowloadComObservable{

	public DowloadMusica(String url, String name, String caminho) {
		super(url, name, caminho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String caminhoExtensao(String caminho, String name) {
		
		String f= caminho+""+name+".mp3";
		
		return f;
	}

	

}
