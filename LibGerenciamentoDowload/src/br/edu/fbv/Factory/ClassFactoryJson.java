package br.edu.fbv.Factory;
import br.edu.fbv.dowloadarquivos.DowloadImg;
import br.edu.fbv.dowloadarquivos.DowloadMusica;
import br.edu.fbv.dowloadarquivos.DowloadVideo;
import br.edu.fbv.listagem.RetornaMusicaJson;
import br.edu.fbv.listagem.RetornaVideoJson;
import br.edu.fbv.templatemethod.DowloadTemplate;
import br.edu.fbv.templatemethod.RetornaJsonTemplate;
import br.edu.fbvCodAntigo.RetornaJsonMusica;

public class ClassFactoryJson {
		
public RetornaJsonTemplate getJson( String metodo ,String urljson) {
		
		if(metodo.equals("jmusica")) {
			
			return new RetornaVideoJson(urljson);
			
		} 
		else if(metodo.equals("jvideo")) {
			 
			 return  new RetornaVideoJson(urljson);
			 
			
		 }
		return null;
		
		
		
	}

}
