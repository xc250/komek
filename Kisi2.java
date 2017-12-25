package javadersleri;

class Kisi2 {
	String isim;
	char cinsiyet;
	
	public Kisi2(String isimG, char cinsiyetG){
		this.setIsim(isimG);
		this.setCinsiyet(cinsiyetG);
		
	}
	
	
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim.toUpperCase();
	}
	public char getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(char cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	
	public String toString(){
		String str="";
		
		str += "Kisi Bilgileri\n";
		 str += "Isim: "+this.getIsim()+"\n";
		 str += "Cinsiyet :"+this.getCinsiyet()+"\n"; 
		return str;
	}

}
