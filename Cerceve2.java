package degiskenler;

import java.awt.*;

import javax.swing.*;

public class Cerceve2 extends JFrame {

	public Cerceve2() {

		super("Benim ilk denemem");

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setResizable(false);
		this.show();
     //   this.setVisible(true);
	}
	
	
	public void paint(Graphics g) {

		 g.setColor(new Color(200, 20, 208));
		 g.drawString("Merhaba ", 150, 200);
		 g.setColor(Color.GREEN);
		 g.drawLine(0, 0, 300, 300);
		 g.setColor(Color.RED);
		 g.drawRect(149, 188, 50, 20);
		 g.setColor(Color.CYAN);
		 g.drawOval(30, 30, 100, 150);
		 g.setColor(Color.YELLOW);
		 g.fillOval(30, 30, 80, 120);

		 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Cerceve2();
	}

}
