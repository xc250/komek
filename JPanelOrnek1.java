package degiskenler;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JPanelOrnek1 extends JFrame implements ActionListener {
	JPanel colorPanel, sizePanel, editPanel, southPanel;
	JTextArea text;

	JButton yellowButton, redButton, blueButton;
	JRadioButton editable, noneditable;
	ButtonGroup group;
	Container c;

	public JPanelOrnek1() {

		c = this.getContentPane();
		c.setLayout(new BorderLayout());

		southPanel = new JPanel();
		southPanel.setLayout(new BorderLayout());

		colorPanel = new JPanel(new FlowLayout());
		yellowButton = new JButton("Sari");
		yellowButton.addActionListener(this);
		colorPanel.add(yellowButton);
		redButton = new JButton("Kirmizi");
		redButton.addActionListener(this);
		colorPanel.add(redButton);
		blueButton = new JButton("Mavi");
		blueButton.addActionListener(this);
		colorPanel.add(blueButton);

		yellowButton.setBackground(Color.BLACK);
		yellowButton.setForeground(Color.WHITE);
		redButton.setBackground(Color.BLACK);
		redButton.setForeground(Color.WHITE);
		blueButton.setBackground(Color.BLACK);
		blueButton.setForeground(Color.WHITE);

		southPanel.add(colorPanel, BorderLayout.SOUTH);

		editPanel = new JPanel(new FlowLayout());
		group = new ButtonGroup();
		editable = new JRadioButton("Duzenlenebilir", false);
		group.add(editable);
		editable.addActionListener(this);
		editPanel.add(editable);
		noneditable = new JRadioButton("Duzenlenemez", true);
		group.add(noneditable);
		noneditable.addActionListener(this);
		editPanel.add(noneditable);

		southPanel.add(editPanel, BorderLayout.NORTH);

		text = new JTextArea();
		text.setText("Deneme Yazisi");
		text.setEditable(true);
		c.add(text, BorderLayout.CENTER);
		c.add(southPanel, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.show();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == yellowButton) {
			text.setBackground(Color.YELLOW);

			yellowButton.setBackground(Color.YELLOW);
			redButton.setBackground(Color.BLACK);
			blueButton.setBackground(Color.BLACK);
		} else if (e.getSource() == redButton) {
			text.setBackground(Color.RED);
			yellowButton.setBackground(Color.BLACK);
			redButton.setBackground(Color.RED);
			blueButton.setBackground(Color.BLACK);
		} else if (e.getSource() == blueButton) {
			text.setBackground(Color.BLUE);
			yellowButton.setBackground(Color.BLACK);
			redButton.setBackground(Color.BLACK);
			blueButton.setBackground(Color.BLUE);
		}

		if (e.getSource() == editable)
			text.setEditable(true);
		else if (e.getSource() == noneditable)
			text.setEditable(false);

		repaint();
	}

	public static void main(String[] args) {
		new JPanelOrnek1();
	}

}
