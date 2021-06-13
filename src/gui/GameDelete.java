package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listener.BackListener;

public class GameDelete extends JPanel{
	WindowFrame frame;
	
	public GameDelete(WindowFrame frame) {
		this.frame = frame;
		JPanel p1 = new JPanel();
		JLabel l1 = new JLabel("Input Game NAME : ");
		JLabel l2 = new JLabel(" ");
		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("Delete");
		JButton b2 = new JButton("Back");
		
		b2.addActionListener(new BackListener(frame));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(b1);
		p1.add(b2);
		this.add(p1);
		
	}

}
