package degiskenler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Images extends JFrame implements ActionListener{
	
	static JScrollPane scPane = new JScrollPane();
	static JLabel imageView = new JLabel();
	static JButton btnNext = new JButton("Sonraki");
	static JButton btnPre = new JButton("Önceki");
	static BufferedImage[] bufImages;
	static Images myImage;
    static int imageNum=0;
    
    public Images(){
    	setSize(750,580);
    	setResizable(false);
    	setLayout(null);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bufImages = new BufferedImage[4];
        
        for(int i=1;i<5;i++){
        	File myFile = new File("image"+i+".png");
        	if(myFile.exists()){
        		try{
        			bufImages[i-1]=ImageIO.read(myFile);
        			
        		}catch(IOException e){
        			e.printStackTrace();
        			
        		}
        	}else{
        		
        		System.out.println("Resim Yok");
        	}
        }
    	
        btnNext.setSize(100, 40);
        btnNext.setLocation(130, 10);
        btnNext.addActionListener(this);
        
        add(btnNext);
        
        btnPre.setSize(100, 40);
        btnPre.setLocation(10, 10);
        btnPre.addActionListener(this);
        
        add(btnPre);
        
        ImageIcon icon = new ImageIcon(bufImages[imageNum]);
        imageView.setIcon(icon);
            	
        scPane.setSize(750, 500);
        scPane.setLocation(0, 60);
        
        scPane.setViewportView(imageView);
        
        add(scPane);
        repaint();
        setVisible(true);
    }
        public static void main (String []args){
        	
        	myImage = new Images();
        }
        
        @Override
        public void actionPerformed(ActionEvent e){
        	if(e.getSource()== btnNext){
        		if(imageNum<3){
        			imageNum++;
        			ImageIcon icon = new ImageIcon(bufImages[imageNum]);
        			imageView.setIcon(icon);
        		}
        	}else{
        		if(imageNum>0){
        			imageNum--;
        			ImageIcon icon = new ImageIcon(bufImages[imageNum]);
        			imageView.setIcon(icon);
        		}
        	}
        	
        	myImage.repaint();
        }
   
}
