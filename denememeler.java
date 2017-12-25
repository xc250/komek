package degiskenler;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class denememeler extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					denememeler frame = new denememeler();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public denememeler() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 376);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		String[] liste = {"ali","veli","deli"		};
		diziSiralar(liste);
		 String yazi="-";
		int i=0;
		while(i<liste.length){
			yazi +=liste[i];
			i++;
		}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 20, 200, 200);
		contentPane.add(textArea);
		textArea.setText(yazi);
	}

	public String[] diziSiralar(String[] dizi) {
		Arrays.sort(dizi);
		return dizi;
	}
}
