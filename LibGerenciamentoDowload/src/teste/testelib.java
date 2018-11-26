package teste;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import br.edu.fbv.libdowload.libdowload;
import br.edu.fbv.model.Video;

public class testelib {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		libdowload lib = new libdowload();
		
		Scanner ler = new Scanner(System.in);
		
		List<Video> listvideo =  lib.dowloadjson();
	//	List<Video> ggg = (List<Video>) listvideo ;
		
		
		
		
		for (int i = 0; i < listvideo.size(); i++) {
			System.out.println(listvideo.toString());
		}
		
		
		String url = "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/Prestadores-de-servi%C3%A7o.jpg?alt=media&token=d11c7ee2-2003-4715-b57e-9b446497a98b";
		String urldois = "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/eletricista.jpg?alt=media&token=833efa2a-5f8d-4135-8683-51dcdfab5796";
		
		String urltres= "https://firebasestorage.googleapis.com/v0/b/teste-b3d5f.appspot.com/o/eletricista.jpg?alt=media&token=833efa2a-5f8d-4135-8683-51dcdfab5796";
		
		String name = "baixa";
		String namedois = "baixadois";
		String nametres = "baixatres";
		String namequatro = "baixaquatro";
		
		
	
		
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
	}

}
