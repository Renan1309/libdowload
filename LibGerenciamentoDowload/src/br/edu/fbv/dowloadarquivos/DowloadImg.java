package br.edu.fbv.dowloadarquivos;


import br.edu.fbv.templatemethod.DowloadTemplate;

public class DowloadImg extends DowloadComObservable {
	public DowloadImg(String url, String name, String caminho) {
		super(url, name, caminho);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String caminhoExtensao(String caminho, String name) {
		// TODO Auto-generated method stub
		
		String f= caminho+""+name+".jpg";
		
		return  f;
	}

	
}
