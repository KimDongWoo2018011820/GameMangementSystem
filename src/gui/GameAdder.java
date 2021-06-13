package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.BackListener;
import listener.GameAddListener;

public class GameAdder extends JPanel{
	WindowFrame frame;
	
	public GameAdder(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name :",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10); 
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelType = new JLabel("Type :",JLabel.TRAILING);
		JTextField fieldType = new JTextField(10); 
		labelType.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);
		
		JLabel labelPlaytime = new JLabel("PlayTime :",JLabel.TRAILING);
		JTextField fieldPlaytime = new JTextField(10); 
		labelPlaytime.setLabelFor(fieldPlaytime);
		panel.add(labelPlaytime);
		panel.add(fieldPlaytime);
		
		JLabel labelDistributor = new JLabel("Distributor :",JLabel.TRAILING);
		JTextField fieldDistributor = new JTextField(10); 
		labelDistributor.setLabelFor(fieldDistributor);
		panel.add(labelDistributor);
		panel.add(fieldDistributor);
		
		JLabel labelPrice = new JLabel("Price :",JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10); 
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		SpringUtilities.makeCompactGrid(panel, 5,2, 6, 6, 6, 6);
		
		JButton b1 = new JButton("ADD");
		b1.addActionListener(new GameAddListener(this.frame.gamemanager,fieldName,fieldType, fieldPlaytime,fieldDistributor,fieldPrice) );
		JButton b2 = new JButton("Back");
		b2.addActionListener(new BackListener(this.frame));
	
		this.add(panel,BorderLayout.CENTER);
		this.add(b1,BorderLayout.NORTH);
		this.add(b2,BorderLayout.SOUTH);
		
	}

}
