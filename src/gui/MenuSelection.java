package gui;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	
	public MenuSelection() {
		this.setSize(300,300);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label1 = new JLabel("Menu Selection");
		
		JButton b1 = new JButton("1. Add Game");
		JButton b2 = new JButton("2. Delete Game");
		JButton b3 = new JButton("3. Edit Game");
		JButton b4 = new JButton("4. View Game");
		JButton b5 = new JButton("5. EXIT MENU");
		
		panel1.add(label1);
		
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
