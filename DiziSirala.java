package javadersleri;

import javax.swing.*;
import java.util.Arrays;
import java.lang.System;

class DiziSirala {
	/*
	\n : alt satır başına
	\t : tab tuşu
	\\ : \ işareti 
	
	\” : “ işareti
	\b : backspace (bir önceki karakteri silme)
	\r : kendisinden önce gelen tüm karakterleri satır başına kadar silme 
	*/
	
	public static void main(String[] args) {
		
		System.out.println("merhaba awfawfawfa\rmerhaba");
		System.out.println("oldumuyaaa\t awfawfawfa");
		
		String liste[] = { "Evren Akar", "Ahmet Aykaç", "Fatih Demir", "Ender Uçkun" };
		diziGoruntule(liste, "Orjinal Dizi");
		
		diziGoruntule(alfabetikSirala(liste), "Sirali Dizi");
		System.exit(0);
	}

	public static String[] alfabetikSirala(String[] dizi) {
	//	String sirali_dizi[] = new String[dizi.length];
	//	System.arraycopy(dizi, 0, sirali_dizi, 0, dizi.length);
		Arrays.sort(dizi);
		return dizi;
	}

	public static void diziGoruntule(String[] dizi, String dizi_adi) {
		String mesaj = dizi_adi + " Içerigi\n***************\n\n";
		for (int i = 0; i < dizi.length; i++)
			mesaj += "dizinin " + i + ". elemani: " + dizi[i] + "\n";
		JOptionPane.showMessageDialog(null, mesaj);
	}

}