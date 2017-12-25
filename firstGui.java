package degiskenler;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class firstGui extends JFrame{
	static JFrame frame1;
	static JPanel panel1;
	static JButton buttonTop,buttonCik;
	static JLabel label1;
	static JTextField tfSayi1, tfSayi2;

	public static void main(String[] args) {
frame1 = new JFrame("Button");
frame1.setSize(300,100);
frame1.setResizable(false);
frame1.setVisible(true);
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

panel1 = new JPanel();
panel1.setSize(300,100);
panel1.setLocation(0,0);
panel1.setLayout(null);
//frame1.add(panel1);

tfSayi1 = new JTextField();
tfSayi1.setSize(75,30);
tfSayi1.setLocation(10, 10);
panel1.add(tfSayi1);

tfSayi2 = new JTextField();
tfSayi2.setSize(75,30);
tfSayi2.setLocation(90, 10);
panel1.add(tfSayi2);

label1 = new JLabel("Sonuç");
label1.setSize(50, 30);
label1.setLocation(170, 10);
panel1.add(label1);



buttonTop = new JButton("Topla");
buttonTop.setSize(75, 30);
buttonTop.setLocation(10, 45);
buttonTop.addActionListener(new Action());
panel1.add(buttonTop);
	
buttonCik = new JButton("Çıkar");
buttonCik.setSize(75, 30);
buttonCik.setLocation(90, 45);
buttonCik.addActionListener(new Action());
panel1.add(buttonCik);

frame1.add(panel1);

frame1.repaint();

	}
	
	public static void addLabel(){
		
	}

	 static class Action implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e){
			int sayi1 = Integer.parseInt(tfSayi1.getText());
			int sayi2 = Integer.parseInt(tfSayi2.getText());
			if(e.getSource() == buttonTop ){
				label1.setText(" = "+ (sayi1+sayi2));
			}else{
				label1.setText(" = "+ (sayi1-sayi2));
			}
			
			
		}
		
	}
	
	
	
	/*
	{
		
		@Override
		public void actionPerformed(ActionEvent e) {
	buttonTop.setVisible(false);
	label1 = new JLabel("beni Tıkladın");
	label1.setSize(100, 100);
	panel1.add(label1);
		}
	});
		
	*/
	
	
	/*
	
	JFrame gui = new JFrame("Java Öğreniyorum");
	gui.setSize(1400, 500);
	gui.setVisible(true);	
	gui.setResizable(true);
	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel panel = new JPanel();

	JLabel label1 = new JLabel("Java Uygulamaları");
	label1.setFont(new Font("Arial", Font.BOLD, 50));
	panel.add(label1);

	JLabel label2 = new JLabel("Yok yaw öyle mi?");
	label2.setFont(new Font("Arial", Font.ITALIC, 100));
	panel.add(label2);

	gui.add(panel); */

}
