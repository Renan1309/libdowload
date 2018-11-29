package br.edu.fbv.observer;

import java.util.Observable;
import java.util.Observer;

public class NotificarDowload implements Observer {
	
	public String DowloadFinalizado(String a) {
		
		String response = a ;
		
		//System.out.println("Baixou");
		
		
		return response;
		
		
	}

	@Override
	public void update(Observable o, Object arg) {
			
		DowloadRealizado response = (DowloadRealizado)o;
		
		String acao = String.valueOf(arg);
		
		this.DowloadFinalizado(acao);
		
	}
	
	
	
	
}
