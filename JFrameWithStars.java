package degiskenler;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class JFrameWithStars extends JFrame{

	static JTextField tfInput = new JTextField();
	static JButton btDo = new JButton("Çiz");
	
	public JFrameWithStars(){
		setTitle("STARS");
		setLayout(null);
		tfInput.setSize(50, 30);
		tfInput.setLocation(10, 10);
		add(tfInput);
		btDo.setSize(50, 30);
		btDo.setLocation(70, 10);
		btDo.setFont(new Font(null, Font.PLAIN, 10));
		add(btDo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args){
		final JFrameWithStars star = new JFrameWithStars();
		star.setSize(300, 500);
		star.setVisible(true);
		btDo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

try{
	int sayi = Integer.parseInt(tfInput.getText());
	if(sayi <= 0){
		JOptionPane.showMessageDialog(null, "0dan büyük gir lo", "Hata", JOptionPane.WARNING_MESSAGE);
	}
	else
	{
		for (int i=0;i<sayi;i++){
			String st = "";
		
			for (int j=0;j<=i;j++){	
				st += "*";
			}
				JLabel label1 = new JLabel(st);
				       label1.setSize(10+i*10, 20);
			           label1.setLocation(10, 50+i*20);	
			           star.add(label1);
		}	
					
	star.repaint();
	}
} catch(Exception e1){
	JOptionPane.showMessageDialog( null, "sayı gir lan", "Hata", JOptionPane.ERROR_MESSAGE);
}

				
			}
		});
		
		
	}
	

}
