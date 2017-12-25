package degiskenler;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.DataInputStream;

public class DosyaIslemleri {

	public static void main(String[] args) {
		
		String[] veri = new String[3];
		
		try {
			
			FileInputStream ft = new FileInputStream("test.txt");
			DataInputStream  dt = new DataInputStream(ft);
			BufferedReader bt = new BufferedReader(new InputStreamReader(dt,"ISO-8859-9"));
						
			
		
			for(int i=0;i<3;i++){
				 veri[i] = bt.readLine();
			     System.out.println(veri[i]);
			}
			
			dt.close();
			
			
		} catch (Exception e) {
 
	    System.err.println("Hata :" + e.getMessage());   
		}
		
		
		try {
			BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("klavyeden giriş yapın");
			String str = in.readLine();
			System.out.println(str);
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
