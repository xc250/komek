package javadersleri;

import java.util.Scanner;

class Kisi {

	String isim, adres;
	char cinsiyet;
	private Scanner sc;

public Kisi(String GelenIsim, String GelenAdres, char GelenCinsiyet){
		this.setIsim(GelenIsim);
		this.setAdres(GelenAdres);
		this.setCinsiyet(GelenCinsiyet);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim.toUpperCase();
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres.toUpperCase();
	}

	public char getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(char cinsiyet) {
		cinsiyet = Character.toUpperCase(cinsiyet);
		if (cinsiyet != 'E' && cinsiyet != 'K') {
			System.out.println(" e veya k cinsiyeti");
			sc = new Scanner(System.in);
			cinsiyet = sc.next().charAt(0);
			setCinsiyet(cinsiyet);
		} else {
			this.cinsiyet = cinsiyet;
		}
	}

	public String toString(){
		String str ="" ;
		 str += "Kisi Bilgileri\n";
		 str += "Isim: "+this.getIsim()+"\n";
		 str += "Cinsiyet :"+this.getCinsiyet()+"\n";
		 str += "Adres: "+this.getAdres()+"\n";
		return str;
	}
	
	
}
