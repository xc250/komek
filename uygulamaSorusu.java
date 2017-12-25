package degiskenler;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * 
 a. iki tarihin birbiriyle kıyaslanması,
b. tarih üzerine belirli bir gün sayısı eklenebilmesi,
c. tutulan tarihin gösterilmesi,
d. tutulan tarihin değiştirilmesi şeklinde olmalıdır. 

 * 
 * */


public class uygulamaSorusu {

	int gun,ay,yil;
	
	
	public void setGun(int gun) {
		this.gun = gun;
	}
	
	public void setAy(int ay) {
		this.ay = ay;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	
	public int getGun() {
		return this.gun;
	}
	
	public int getYil() {
		return this.yil;
	}
	
	public int getAy() {
		return this.ay;
	}
	
public void tarihOlusturma(int day, int month, int year) {
		
	
	}
	
public static void main(String[] Args){
	
	long currenttime = System.nanoTime();
	long currenttimea = System.currentTimeMillis();
	int i = 0;
	StringBuffer str=new StringBuffer(30);
	
	while(i<30){
		i=i+1;
		str.append(i);
	}
	
	
	/*
	System.out.println("currenttime"+(System.nanoTime()-currenttime));
	System.out.println("currenttimea"+(System.currentTimeMillis()-currenttimea));
	System.out.println(str);
	System.out.println(System.currentTimeMillis());
	*/
	
//	Date d1 = new Date();
	//d1.setYear(2014);
	//d1.setDate(30);
	//d1.setMonth(9);
	//d1.setHours(597);
	//d1.setTime(System.nanoTime());
	//System.out.println(d1.getTime());
//	d1.setTime(currenttime);
	System.out.println(System.currentTimeMillis());
	
	GregorianCalendar tarihim = new GregorianCalendar();
	
	//int a = tarihim.get();
	
	
//	System.out.println(tarihim.get(Calendar.));
	System.out.println(tarihim.toString());
}

	
}
