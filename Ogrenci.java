package javadersleri;

 class Ogrenci extends Kisi {
  String bolum;
  int donem;
  
  
  public Ogrenci(String ad, char cns, String adr, String blm, int dnm) {
	  super(ad, adr, cns);
	  this.setBolum(blm);
	  this.setDonem(dnm);
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
  
  
public String toString() {
	 String str = super.toString();
	 str += "Bolum: "+this.getBolum()+"\n";
	 str += "Donem: "+this.getDonem()+"\n";
	 return str;
	 } 

  
  
  
  
  
}
