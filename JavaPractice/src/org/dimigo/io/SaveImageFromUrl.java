package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://cfile23.uf.tistory.com/image/2631CB3B5282E1F613BB19";
		try{
			URL url = new URL(imageUrl);
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")){
				// 파일에 write 하기
				int result;
				byte[] buf = new byte[100];
					while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
