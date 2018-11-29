package br.edu.fbv.templatemethod;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.Callable;

import br.edu.fbv.model.Musica;
import br.edu.fbvCodAntigo.Midias;
import br.edu.fbvCodAntigo.ObjectTeste;

public abstract class RetornaJsonTemplate implements Callable<List>  {
	
	
	String urlrecebido;

	public RetornaJsonTemplate(String urljson) {

		this.urlrecebido = urljson;
	}
	
	public abstract List call() throws MalformedURLException, IOException ;

	
}