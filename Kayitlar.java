package javadersleri;

class Kayitlar {

	Ogrenci2 dizi[];

	public Kayitlar() {

	}

	public Kayitlar(Ogrenci2 yeniEleman) {
		this.dizi = new Ogrenci2[1];
		this.dizi[0] = yeniEleman;
	}

	public void ekle(Ogrenci2 eklenecekOgr) {
		if (this.dizi == null) {
			dizi = new Ogrenci2[1];
			this.dizi[0] = eklenecekOgr;
		} else {
			Ogrenci2 tmp[] = new Ogrenci2[dizi.length + 1];
			for (int i = 0; i < dizi.length; i++)
				tmp[i] = dizi[i];
			tmp[tmp.length - 1] = eklenecekOgr;
			this.dizi = tmp;
		}
	}

	public void cikart(int id) {
		Ogrenci2 tmp[] = new Ogrenci2[dizi.length - 1];
		int indeks = -1;
		for (int i = 0; i < dizi.length; i++)
			if (dizi[i].getOgrenci_no() == id)
				indeks = i;
		for (int i = 0; i < indeks; i++)
			tmp[i] = dizi[i];
		for (int i = indeks; i < dizi.length - 1; i++)
			tmp[i] = dizi[i + 1];
		dizi = tmp;
	}

	public void listele() {
		System.out.println("Kayitlar listeleniyor:");
		System.out.println("--------------------");
		for (int i = 0; i < dizi.length; i++)
			System.out.println("" + dizi[i]);
	}

	public Ogrenci2 enBuyukOrtalamaliOgrenci() {
		Ogrenci2 max = dizi[0];
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].getOrtalama().compareTo(max.getOrtalama()) == -1)
				max = dizi[i];
		}
		return max;
	}

}
