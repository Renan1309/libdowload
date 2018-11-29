

package teste;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import br.edu.fbv.dowloadarquivos.DowloadVideo;
import br.edu.fbv.libdowload.MainDowload;
import br.edu.fbv.libdowload.MainJson;
import br.edu.fbv.model.Musica;
import br.edu.fbv.model.Video;
import br.edu.fbvCodAntigo.libdowload;

public class testelib {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		MainDowload lib = MainDowload.getInstancia();
		String caminho = "C:\\Users\\renan\\";
	
		String u = "https://libgerenciamento1.herokuapp.com/musica" ;
		
		String um= "https://libgerenciamento1.herokuapp.com/video" ;
		
		MainJson jsonlib = new MainJson();
				//MainJson.getInstancia();
		
		String metodo = "jmusica";
		
		//libdowload h = new libdowload();
		
		//h.dowloadjson();
		
		List<Musica> listmusica = jsonlib.responseJson(metodo, u);
		
        Musica m = new Musica();
		
		
		
		for (int i = 0; i <listmusica.size(); i++) {
			System.out.println(listmusica.toString());
		}
		
		m = listmusica.get(0);
		String metodox = "jvideo";
		List<Video> listv = jsonlib.responseJson(metodox, um);
		
		
	   Video v = new Video();
	   
	   v = listv.get(0);
		
	   System.out.println(v.getNome().toString());
		
		
		System.out.println(m.getNome().toString());
		
	
		
	
		
	}
	
	
}
/*
 * 
 *  String urlmusicas= "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/01%20VAI%20DA%20PT%20-%20LEO%20SANTANA.mp3?alt=media&token=3b1e82bc-5b70-478c-9f7a-d555a86f7aa8";
  String name = "musica";
  
  String metodo = "dmusica";
  
  String msg1 =lib.MetodoDowload(urlmusicas, name, caminho, metodo);
  
  System.out.println(msg1);
  
  
  String urltres= "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/eletricista.jpg?alt=media&token=833efa2a-5f8d-4135-8683-51dcdfab5796";
  String metodod = "dimagem";
  String names = "imagem";
  String msg2 =lib.MetodoDowload(urltres, names, caminho, metodod);

System.out.println(msg2);
 
  
   String urlvideo = "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/CXQM5159.MP4?alt=media&token=49ed22aa-57c9-4cd1-b2ca-2dfb47c668a3";
   String namess = "video";
   String metodo1 = "dvideo";
   String msg3 =lib.MetodoDowload(urlvideo, namess, caminho, metodo1);
  
  System.out.println(msg3);
		
		
			String metodos= "jvideo";
		List<Video> listvideo = jsonlib.responseJson(metodos, uvideo);
		
		Video v = new Video();
		v = listvideo.get(6);
		
		System.out.println(v.getNome().toString());
 */

	