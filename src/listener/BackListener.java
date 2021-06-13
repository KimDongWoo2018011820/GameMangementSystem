package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.GameAdder;
import gui.MenuSelection;
import gui.WindowFrame;

public class BackListener implements ActionListener {
WindowFrame frame;
	
	public BackListener(WindowFrame frame) {
		this.frame= frame;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		MenuSelection menu = frame.getMenu(); 
		frame.setupPanel(menu);
	}

}
