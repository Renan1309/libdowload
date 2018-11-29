package br.edu.fbv.dowloadarquivos;

import br.edu.fbv.templatemethod.DowloadComObserver;

public class DowloadComObservable extends DowloadComObserver {

	public DowloadComObservable(String url, String name, String caminho) {
		super(url, name, caminho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String caminhoExtensao(String caminho, String name) {
		// TODO Auto-generated method stub
			
		String f= caminho+""+name+".mp3";
		
		return f;
	}

}
