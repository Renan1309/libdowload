package br.edu.fbv.libdowload;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import br.edu.fbv.dowloadarquivos.DowloadImg;
import br.edu.fbv.dowloadarquivos.RetornaJson;

public class libdowload {
	
	public StringBuffer dowloadjson () throws IOException {
		RetornaJson retjson = new RetornaJson();
		
		StringBuffer recebido = retjson.jsonrecebido();
		
		return recebido ;
	}
	
	
	
 	public String dowloadImg (String url , String name ) throws IOException {
 		
 		
 	
		
		DowloadImg obj = new DowloadImg(url , name);
		
		poolthread(obj);
		
		String mensagem = null ;
		
	
		
		
		
		return mensagem;
	}
 	
 	public void poolthread (DowloadImg name) {
 		
 		int nut = 1;
 		 ExecutorService exec = Executors.newFixedThreadPool(nut);
 		// ExecutorService exec = Executors.newCachedThreadPool();
		 exec.execute(name);
		 
		 System.out.println("execultando thread");
 		
 	}
	

}
