package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.GameViewer;
import gui.WindowFrame;
import manager.GameManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GameManager gameManager = getObject("GameManager.ser");
		GameViewer gameviewer = frame.getGameviewer(); 
		gameviewer.setGamemanager(gameManager);
		frame.setupPanel(gameviewer);
		
	}
	
	 public static GameManager getObject(String filename){
		  GameManager gameManager = null;
		  try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			
			gameManager = (GameManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return gameManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return gameManager;
		  
	  }

}
