package br.edu.fbvCodAntigo;

import br.edu.fbv.templatemethod.DowloadTemplate;

public class Dowloadteste extends DowloadTemplate{

	public Dowloadteste(String url, String name, String caminho) {
		super(url, name, caminho);
		
	}

	@Override
	public String caminhoExtensao(String caminho, String name) {
	 
		String f= caminho+""+name+".mp3";
		return f;
	}

}
