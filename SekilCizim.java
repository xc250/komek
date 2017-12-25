package degiskenler;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class SekilCizim extends JFrame {
	DrawPanel panel;
	Container c;

	public SekilCizim() {

		c = this.getContentPane();

		panel = new DrawPanel();
		c.add(panel);

		this.setSize(400, 400);
		this.setTitle("Sekiller");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.show();
	}

	public static void main(String arg[]) {
		new SekilCizim();

	}

}

class DrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 200, 150);

		Ellipse2D ellipse = new Ellipse2D.Double();
		super.setBackground(Color.BLACK);
		g2.setColor(Color.GREEN);
		ellipse.setFrame(rectangle);

		g2.draw(rectangle);
		g2.draw(ellipse);

	}
}
