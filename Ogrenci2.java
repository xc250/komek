package javadersleri;

public class Ogrenci2 extends Kisi2 {
	String bolum;
	 int donem;
	 int ogrenci_no;
	 String ortalama;
	 
	
	public Ogrenci2(String isimG, char CinsiyetG, String bolumG, int donemG, int ogrenci_noG, double ortalamaG){
		super(isimG, CinsiyetG);
		this.setBolum(bolumG);
		this.setDonem(donemG);
		this.setOgrenci_no(ogrenci_noG);
		this.setOrtalama(ortalamaG);
	}


	
	
	public String getBolum() {
		return bolum;
	}


	public void setBolum(String bolum) {
		this.bolum = bolum.toUpperCase();
	}


	public int getDonem() {
		return donem;
	}


	public void setDonem(int donem) {
		this.donem = donem;
	}


	public int getOgrenci_no() {
		return ogrenci_no;
	}


	public void setOgrenci_no(int ogrenci_no) {
		this.ogrenci_no = ogrenci_no;
	}


	public String getOrtalama() {
		return ortalama;
	}


	public void setOrtalama(double ortalama) {
		if(ortalama < 1.0)
			 this.ortalama = "F";
			 else if(ortalama >= 1.0 && ortalama < 1.5)
			 this.ortalama = "D";
			 else if(ortalama >= 1.5 && ortalama<2.0)
			 this.ortalama = "C";
			 else if(ortalama >= 2.0 && ortalama<3.6)
			 this.ortalama = "B";
			 else if(ortalama >= 3.6 && ortalama <= 4.0)
			 this.ortalama = "A"; 

	}

	
	public String toString(){
		
		String str = super.toString();
		 str += "Bolum: "+this.getBolum()+"\n";
		 str += "Donem: "+this.getDonem()+"\n";
		 str += "Ogrenci No: "+this.getOgrenci_no()+"\n";
		 str += "Ortalamasi: "+this.getOrtalama()+"\n";
		 return str; 
		
	}
	
	
	
}
