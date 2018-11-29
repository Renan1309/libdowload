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

import br.edu.fbv.model.Video;
import br.edu.fbv.observer.DowloadRealizado;
import br.edu.fbv.templatemethod.RetornaJsonTemplate;

public class RetornaVideoJson extends RetornaJsonTemplate {

	String urlrecebida  ;
	public RetornaVideoJson(String urljson) {
		super(urljson);
		// TODO Auto-generated constructor stub
		

		this.urlrecebida = urljson;
	}

	@Override
	public List<Video> call() throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		InputStream inputStream = null;

		InputStreamReader inputStreamReader = null;
		StringBuffer resultMongo = null;
		// StringBuffer finalapi = null ;

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

		List<Video> listavideo = new ArrayList<Video>();

		String jsonfinal = resultMongo.toString();

		try {
			JSONArray jsonArray = new JSONArray(jsonfinal);
			JSONObject parentObject = jsonArray.getJSONObject(0);
			for (int j = 0; j < jsonArray.length(); j++) {

				Video video = new Video();
				JSONObject finalObject = jsonArray.getJSONObject(j);

				video.setId(finalObject.getString("_id"));
				video.setNome(finalObject.getString("nome"));
				video.setUrlimagem(finalObject.getString("urlimagem"));
				video.setUrlvideo(finalObject.getString("urlvideo"));

				listavideo.add(video);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DowloadRealizado dos = new DowloadRealizado();
		dos.mudarEstado();

		return listavideo;

	}

}
