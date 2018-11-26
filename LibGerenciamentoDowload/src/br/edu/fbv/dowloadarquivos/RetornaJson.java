package br.edu.fbv.dowloadarquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class  RetornaJson {
	
	public  StringBuffer jsonrecebido() throws IOException{
		
		 String urlmongo = "https://vast-hollows-56426.herokuapp.com/cadastro";
		    

	      InputStream inputStream = null;

	      InputStreamReader inputStreamReader = null;
	      StringBuffer resultMongo = null;
	      //StringBuffer finalapi = null ;

	          URL url = new URL(urlmongo);
	          
	          HttpURLConnection result = (HttpURLConnection) url.openConnection() ;

	         
	          inputStream = result.getInputStream();

	          inputStreamReader = new InputStreamReader(inputStream);
	       
	          BufferedReader reader = new BufferedReader((inputStreamReader));
	          String linha = "";
	          resultMongo = new StringBuffer();
	        
	          while ((linha = reader.readLine()) != null) {
	              resultMongo.append(linha);
	          }


	       return resultMongo;

		
	}
	
	

}
