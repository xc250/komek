package javadersleri;

class KayitlarDeneme {
	
	public static void main(String arg[]) {

		 Kayitlar x = new Kayitlar();
		 x.ekle(new Ogrenci2("Evren Banger", 'e',"Bilgisayar", 2, 100, 2.54));
		 x.ekle(new Ogrenci2("Aykut Toygar", 'e',"Bilgisayar", 2, 101, 2.4));
		 x.ekle(new Ogrenci2("Hande Kumek", 'k', "Bilgisayar", 3, 102, 3.5));
		 x.ekle(new Ogrenci2("Ilker Kara", 'e', "Bilgisayar", 2, 103, 1.55));
		 x.ekle(new Ogrenci2("Cemile Caglar", 'k',"Isletme", 4, 201, 3.7));
		 x.ekle(new Ogrenci2("Erdem Aykac", 'e', "Isletme", 4, 202, 3.58));
		 x.listele();
		 Ogrenci2 sonuc = x.enBuyukOrtalamaliOgrenci();
		 System.out.println("En buyuk ortalamali ogrenci: \n"+sonuc);
		 } 


}
