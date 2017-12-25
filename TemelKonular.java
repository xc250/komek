package degiskenler;

import java.util.Locale;
import java.util.Scanner;

public class TemelKonular {

	public static void main(String[] args) {
System.out.println("Merhaba Dünya");
Scanner input= new Scanner(System.in);
input.useLocale(Locale.US);

int  diziuzunlugu;

System.out.println("dizinin kaç elemanlı olacakğını gir önce");
diziuzunlugu = input.nextInt();

int[] sayi = new int[diziuzunlugu];

for(int i=0; i< diziuzunlugu;i++)
{
	System.out.println(i+1 +"elemanı giriniz");
	sayi[i] = input.nextInt();
	}

 Siralamalar siralamayap = new Siralamalar();
 
 
 Siralamalar.bubbleSort(sayi);
 System.out.println("Bu da Selectionsort sıralaması");
// Siralamalar.selectionSort(sayi);
 

	}

}
