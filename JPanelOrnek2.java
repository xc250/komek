package degiskenler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class JPanelOrnek2 extends JFrame implements ActionListener {

	JPanel contentPane;
	private JRadioButton editable;
	private JRadioButton noneditable;
	private JButton buttonYellow;
	private JButton buttonBlue;
	private JButton buttonRed;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					JPanelOrnek2 frame = new JPanelOrnek2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		
		 new JPanelOrnek2().setVisible(true);
     	
	}

	/**
	 * Create the frame.
	 */
	public JPanelOrnek2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelSouth = new JPanel();
		panelSouth.setLayout(new BorderLayout());
		contentPane.add(panelSouth, BorderLayout.SOUTH);

		JPanel panelColor = new JPanel(new FlowLayout());
		panelSouth.add(panelColor, BorderLayout.SOUTH);

		buttonYellow = new JButton("Sar\u0131");
		buttonYellow.addActionListener(this);
		panelColor.add(buttonYellow);

		buttonBlue = new JButton("Mavi");
		buttonBlue.addActionListener(this);
		panelColor.add(buttonBlue);

		buttonRed = new JButton("K\u0131rm\u0131z\u0131");
		buttonRed.addActionListener(this);
		panelColor.add(buttonRed);

		buttonYellow.setForeground(Color.WHITE);
		buttonYellow.setBackground(Color.BLACK);
		buttonBlue.setForeground(Color.WHITE);
		buttonBlue.setBackground(Color.BLACK);
		buttonRed.setForeground(Color.WHITE);
		buttonRed.setBackground(Color.BLACK);

		panelSouth.add(panelColor, BorderLayout.SOUTH);

		JPanel panelEdit = new JPanel(new FlowLayout());
		ButtonGroup group = new ButtonGroup();
		editable = new JRadioButton("Düzenlenebilir", false);
		editable.addActionListener(this);
		group.add(editable);
		panelEdit.add(editable);
		noneditable = new JRadioButton("Düzenlenemez", true);
		noneditable.addActionListener(this);
		group.add(noneditable);
		panelEdit.add(noneditable);
		panelSouth.add(panelEdit, BorderLayout.NORTH);

		textArea = new JTextArea();
		textArea.setText("hele hele bak hele");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonYellow) {
			textArea.setBackground(Color.YELLOW);

			buttonYellow.setBackground(Color.YELLOW);
			buttonRed.setBackground(Color.BLACK);
			buttonBlue.setBackground(Color.BLACK);

		} else if (e.getSource() == buttonRed) {
			textArea.setBackground(Color.RED);

			buttonYellow.setBackground(Color.BLACK);
			buttonRed.setBackground(Color.RED);
			buttonBlue.setBackground(Color.BLACK);

		} else if (e.getSource() == buttonBlue) {
			textArea.setBackground(Color.BLUE);

			buttonYellow.setBackground(Color.BLACK);
			buttonRed.setBackground(Color.BLACK);
			buttonBlue.setBackground(Color.BLUE);

		}
		
		if (e.getSource() == editable)
			textArea.setEditable(true);
		else if (e.getSource() == noneditable)
			textArea.setEditable(false);

	}

}
