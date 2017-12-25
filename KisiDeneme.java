package javadersleri;

 class KisiDeneme {

	public static void main(String[] args) {

Ogrenci o1 = new Ogrenci("Dogac Berkun", 'e', "Kurtulus Cd. No 24",
		 "Bilgisayar Bilimleri", 2);

System.out.println(o1);
o1.setDonem(3);
o1.setCinsiyet('k');
System.out.println(o1); 


	}

}
