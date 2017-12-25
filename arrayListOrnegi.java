package javadersleri;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class arrayListOrnegi {

	ArrayList dizi = new ArrayList();

	private void menuEkrani() {

		String ekranYazisi = "Menüden işlem seç\n*************\n\n";
		ekranYazisi += "1 Kayıt Ekle\n";
		ekranYazisi += "2 Kayıt Sil\n";
		ekranYazisi += "3 Kayıt Görüntüle\n";
		ekranYazisi += "0 Çık Git\n";

		String secimStr = this.girisAl(ekranYazisi);
		if (secimStr == null)
			secimStr = "0";
		else if (secimStr.equals("") || secimStr.matches("[^0-9]+"))
			this.menuEkrani();

		int secim = Integer.parseInt(secimStr);
		switch (secim) {
		case 0:
			this.cikis();
			break;
		case 1:
			this.kayitEkle();
			break;
		case 2:
			this.kayitSil();
			break;
		case 3:
			this.kayitListele();
			break;
		default:
			JOptionPane.showMessageDialog(null, "yanlış bir seçim yaptınız");
			this.menuEkrani();
		}
	}

	private void kayitEkle() {
		String eklenecek = this.girisAl("eklenecek ismi giriniz");
		if (eklenecek != null && !eklenecek.equals("")) {
			if (dizi.indexOf(eklenecek.toUpperCase()) != -1)
				this.mesaj("zaten ekli bu yaaa");
			else {
				dizi.add(eklenecek.toUpperCase());
				this.mesaj("eklendiii");
			}
		}
      this.menuEkrani();
	}

	private void kayitSil() {
		String silinecek = this.girisAl("hangi ismi silelim paşam");
		if ( silinecek != null && !silinecek.equals("")){
			if(dizi.indexOf(silinecek.toUpperCase()) >= 0 ){
				dizi.remove(dizi.indexOf(silinecek.toUpperCase()));
				this.mesaj("isimi sildim bile");
			}
			else
				this.mesaj("ismi bulamadım ki");
			
		}
      this.menuEkrani();
	}

	private void kayitListele() {
		String sss = "Listemiz bu \n********\n";
		for(int i=0;i<dizi.size();i++)
			sss+=dizi.get(i)+"\n";
       this.mesaj(sss);
       this.menuEkrani();
	}

	private void cikis() {
		int secim = JOptionPane.showConfirmDialog(null, "emin misin bak?");
		if (secim == 0)
			System.exit(0);
		else
			this.menuEkrani();
	}

	public void uygulamaBaslat() {
		this.menuEkrani();
	}

	public String girisAl(String str) {
		return JOptionPane.showInputDialog(null, str);
	}

	public void mesaj(String str) {
		JOptionPane.showMessageDialog(null, str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayListOrnegi a = new arrayListOrnegi();

		a.uygulamaBaslat();
	}

}
