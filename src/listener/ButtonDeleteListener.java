package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.GameDelete;
import gui.GameViewer;
import gui.WindowFrame;

public class ButtonDeleteListener implements ActionListener {
    WindowFrame frame;
	
	
	public ButtonDeleteListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		GameDelete gamedelete = frame.getGamedelete();
		frame.setupPanel(gamedelete);
		
	}


}
