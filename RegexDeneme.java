package javadersleri;

import java.util.regex.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegexDeneme extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton buton;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegexDeneme frame = new RegexDeneme();
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
	public RegexDeneme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.fill = GridBagConstraints.VERTICAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		buton = new JButton("Giriş");
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String str = textField.getText().trim();

				String numericPattern = "^[0-9]+$|-[0-9]+$";
				String str2 = "[^0-9]+";
				String str3 = "\\d{100}";
				String str4 =	"-\\d{1,}|\\d{1,}";	
				Pattern p = Pattern.compile(numericPattern);
                Matcher m = p.matcher(str);
                
                if(m.matches())
				textPane.setText(str+" bulundu");
                else
                textPane.setText(str);
			}
		});
		buton.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_buton = new GridBagConstraints();
		gbc_buton.insets = new Insets(0, 0, 5, 0);
		gbc_buton.gridx = 2;
		gbc_buton.gridy = 2;
		contentPane.add(buton, gbc_buton);

		textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 2;
		gbc_textPane.gridy = 4;
		contentPane.add(textPane, gbc_textPane);
	}

}
