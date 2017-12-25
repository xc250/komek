package degiskenler;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Cerceve extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	Cerceve c =	new Cerceve();
	}

	/**
	 * Create the frame.
	 */
	public Cerceve() {
		setTitle("\u00E7er\u00E7eve de\u011Fil resim ar\u0131yorum");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		// setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
	}

}
