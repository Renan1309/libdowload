

package teste;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import br.edu.fbv.dowloadarquivos.DowloadVideo;
import br.edu.fbv.libdowload.libdowload;
import br.edu.fbv.model.Musica;
import br.edu.fbv.model.Video;

public class testelib {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		libdowload lib = new libdowload();
		
		String name = "baixa";
		String nameM = "leosantana";
		String urlvideo = "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/CXQM5159.MP4?alt=media&token=49ed22aa-57c9-4cd1-b2ca-2dfb47c668a3";
		String caminho = "C:\\Users\\renan\\";
		
		String urlmusica= "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/01%20VAI%20DA%20PT%20-%20LEO%20SANTANA.mp3?alt=media&token=3b1e82bc-5b70-478c-9f7a-d555a86f7aa8";
		
		String testtt = caminho+""+name+".mp4";
		
		lib.dowloadMusica(urlmusica, name, caminho);
		
		lib.dowloadVideo(urlvideo, name, caminho);
				
		Scanner ler = new Scanner(System.in);
		
	

		
		String url = "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/Prestadores-de-servi%C3%A7o.jpg?alt=media&token=d11c7ee2-2003-4715-b57e-9b446497a98b";
		String urldois = "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/eletricista.jpg?alt=media&token=833efa2a-5f8d-4135-8683-51dcdfab5796";
		
		String urltres= "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/eletricista.jpg?alt=media&token=833efa2a-5f8d-4135-8683-51dcdfab5796";
		
		//String name = "baixa";
		String namedois = "baixadois";
		String nametres = "baixatres";
		String namequatro = "baixaquatro";
		
		lib.dowloadImg(urltres, nametres, caminho);
	}
	
}
		
		/*
			List<Musica> listvideo =  lib.dowloadjson();
	//	List<Video> ggg = (List<Video>) listvideo ;
		
		
		Musica musiquei = new Musica();
		musiquei = listvideo.get(9);
		
		for (int i = 0; i < listvideo.size(); i++) {
			System.out.println(listvideo.toString());
		}
		
		System.out.println(musiquei.getNome().toString() +""+ musiquei.getUrlimagem().toString());
		
		while (true) {
		int num = 	ler.nextInt();
		
		if (num == 1) {
			
			//String caminho = "C:\\Users\\renan\\"+name+".jpg";
			
			lib.dowloadImg(url, name);
			
			System.out.println("baixando 1");
			
		}
		if(num == 2) {
			lib.dowloadImg(urldois, namedois);
			System.out.println("baixando 2");
			
		}
		if(num == 3) {
			lib.dowloadImg(urltres, nametres);
			
			System.out.println("baixando 3");
		}
		
		if(num== 4){
		 
           // System.out.println(recebido.toString());
		}
			
		}
		
		
		
		
	
		
		/*
		libdowload lib = new libdowload();
		List<Video> listvideo =  lib.dowloadjson();
		
		for (int i = 0; i < listvideo.size(); i++) {
			System.out.println(listvideo);
		}
*/
