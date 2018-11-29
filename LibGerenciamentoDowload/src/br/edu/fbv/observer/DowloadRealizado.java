package br.edu.fbv.observer;

import java.util.Observable;

public class DowloadRealizado  extends Observable{
	
	String acao = "";
	public void notificar() {
		
		this.acao = "Dowload Realizado";
		
		this.mudarEstado();
		
		//System.out.println("Baixou");
		

		
		
	}
	
	public void  mudarEstado() {
		
		setChanged();
		notifyObservers(acao);
		
	}

}
