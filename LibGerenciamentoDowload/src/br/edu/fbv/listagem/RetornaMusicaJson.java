package br.edu.fbv.listagem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import br.edu.fbv.model.Musica;
import br.edu.fbv.templatemethod.RetornaJsonTemplate;
import br.edu.fbvCodAntigo.Midias;
import br.edu.fbvCodAntigo.ObjectTeste;

public class RetornaMusicaJson extends RetornaJsonTemplate {
	String urlrecebida  ;
	public RetornaMusicaJson(String urljson) {
		super(urljson);
		
		this.urlrecebida = urljson;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Musica> call() throws IOException {
		// TODO Auto-generated method stub
		//String urlrecebida = urljson ;
		
		InputStream inputStream = null;

		InputStreamReader inputStreamReader = null;
		StringBuffer resultMongo = null;
	
		URL url = new URL(urlrecebida);

		HttpURLConnection result = (HttpURLConnection) url.openConnection();

		inputStream = result.getInputStream();

		inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader reader = new BufferedReader((inputStreamReader));
		String linha = "";
		resultMongo = new StringBuffer();

		while ((linha = reader.readLine()) != null) {
			resultMongo.append(linha);
		}

		//List<Video> listvideos = new ArrayList<Video>();
		
		List<Musica> listmusica = new ArrayList<Musica>();

		String jsonfinal = resultMongo.toString();

		try {
			JSONArray jsonArray = new JSONArray(jsonfinal);
			JSONObject parentObject = jsonArray.getJSONObject(0);
			for (int j = 0; j < jsonArray.length(); j++) {

				//Video video = new Video();
				Musica musica = new Musica();
				
				JSONObject finalObject = jsonArray.getJSONObject(j);

				musica.setId(finalObject.getString("_id"));
				musica.setNome(finalObject.getString("nome"));
				musica.setUrlimagem(finalObject.getString("urlimagem"));
				musica.setUrlmusica(finalObject.getString("urlmusica"));

				listmusica.add(musica);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listmusica;
	}

}
