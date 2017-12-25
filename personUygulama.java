package javadersleri;

import javax.swing.JOptionPane;

/*
 Uygulama Sorusu (Derste yapilacak):
Sınıfların dizilere parametre olarak gönderilmesine iliskin ornekler
 - Person turunden bir sinif yarat (isim, yas)
 - Bu sinif turunden elemanlari olan bir array yarat
 - Bu arrayi bir metoda gonder ve ekranda goruntule
 - Sonra compareTo metodunu Person sinifina ekle ve sort bilgisiyle bu sefer bu listeyi sirala 

 * */


public class personUygulama {

	public static void main(String[] args) {
		
		
		 String myString = "Merhaba dünya";         
		   byte[] strByte = myString.getBytes();  
		   System.out.println(strByte[5]); 
		   System.out.println(new String(strByte)); 
		// TODO Auto-generated method stub

	}
	
	public class person {
		
		private String isim;
		private Integer yas;
		
		public person(){
			
		}
		
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public Integer getYas() {
			return yas;
		}
		public void setYas(Integer yas) {
			
			while(yas < 0)
				 yas = Integer.parseInt(JOptionPane.showInputDialog(null, "Yas bilgisi 0 ya dadaha kucuk olamaz!\nTekrar giriniz")); 
			
			
			this.yas = yas;
		}
		
		
		
		
		
	}
	

}
