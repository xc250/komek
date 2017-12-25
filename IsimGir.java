package javadersleri;

import javax.swing.*;
import java.util.Arrays;
import java.lang.System;
class IsimGir {
 public static void main(String[] args) {
 int uzunluk = Integer.parseInt(JOptionPane.showInputDialog(null, "Dizi uzunlugu ne olsun?"));
 String []liste = diziYarat(uzunluk);
 Histogram(liste);
 System.exit(0); 

 }
 public static String[] diziYarat(int boyut) {
 String isimler[] = new String[boyut];
 for(int i=0; i < isimler.length; i++)
 isimler[i] = JOptionPane.showInputDialog(null, i+". ismi giriniz");
 Arrays.sort(isimler);
 return isimler;
 }
 public static void Histogram(String dizi[]) {
 JTextArea cikisEkrani = new JTextArea(15, 15);
 String cikis = "isim \t uzunluk \n -------------------\n";
 for(int i = 0; i < dizi.length; i++) {
 cikis += dizi[i] + "\t";
 for(int k = 0; k < dizi[i].length(); k++)
 cikis += "*";
 cikis += "\n";
 }
 cikisEkrani.setText(cikis);
 JOptionPane.showMessageDialog(null, cikisEkrani);
 }
}
