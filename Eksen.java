package degiskenler;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Eksen extends JFrame implements ActionListener {

	JTextField xpoint, ypoint;
	JButton setPointsButton;
	CoordinatePanel coordinate;
	JPanel settings;
	Container c;

	public Eksen() {

		this.prepareComponents();
		this.prepareFrame();

	}

	public void prepareFrame() {

		this.setSize(420, 470);
		this.setTitle("Sekiller");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.show();

	}

	public void prepareComponents() {

		c = this.getContentPane();
		c.setLayout(new BorderLayout());

		coordinate = new CoordinatePanel();
		c.add(coordinate, BorderLayout.CENTER);

		xpoint = new JTextField(3);
		ypoint = new JTextField(3);
		setPointsButton = new JButton("set point to new coordinates");
		setPointsButton.addActionListener(this);
		settings = new JPanel();
		settings.setLayout(new FlowLayout());
		settings.add(new JLabel("x: "));
		settings.add(xpoint);
		settings.add(new JLabel("y: "));
		settings.add(ypoint);
		settings.add(setPointsButton);
		c.add(settings, BorderLayout.SOUTH);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.setPointsButton) {
			JOptionPane.showMessageDialog(this, "dugmeye basldi");
			coordinate.setPoint(Integer.parseInt(xpoint.getText()), Integer.parseInt(ypoint.getText()));
			this.repaint();
		}
	}

	public static void main(String arg[]) {

		new Eksen();
	}
}

class CoordinatePanel extends JPanel {

	int currentX, currentY;
	Ellipse2D nokta = new Ellipse2D.Double();
	int xSize = 400, ySize = 400;

	public CoordinatePanel() {

		this.setSize(this.xSize, this.ySize);
		this.currentX = 10;
		this.currentY = 20;

		this.setPoint(currentX, currentY);

	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Line2D yline = new Line2D.Double(this.xSize / 2, 0, this.xSize / 2, this.ySize);
		Line2D xline = new Line2D.Double(0, this.ySize / 2, this.xSize, this.ySize / 2);

		// noktanin yeni koordinatlari relative olarak belirleniyor
		nokta.setFrame(this.xSize / 2 + this.currentX - 5, this.ySize / 2 - this.currentY - 5, 10, 10);

		g2.draw(xline);
		g2.draw(yline);
		g2.fill(nokta);

	}

	// Bu metod notanin yeni koordinatlarini set ediyor.
	public void setPoint(int x, int y) {
		this.currentX = x;
		this.currentY = y;
		this.repaint();
	}

}