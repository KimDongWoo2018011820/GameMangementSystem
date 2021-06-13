package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import exception.DistributorNameException;
import exception.NameFormException;
import games.GameInput;
import games.GameKinds;
import games.Origin;
import gui.WindowFrame;
import manager.GameManager;

public class GameAddListener implements ActionListener {
	GameManager gamemanager;
	JTextField fieldName;
	JTextField fieldType;
	JTextField fieldPlaytime;
	JTextField fieldDistributor;
	JTextField fieldPrice;
	double price;
	int playtime;
	
	public GameAddListener(GameManager gamemanager,JTextField fieldName,JTextField fieldType,JTextField fieldPlaytime,JTextField fieldDistributor,JTextField fieldPrice){
		this.gamemanager = gamemanager;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.fieldPlaytime = fieldPlaytime;
		this.fieldDistributor = fieldDistributor;
		this.fieldPrice = fieldPrice;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GameInput gameinput = new Origin(GameKinds.Origin);
		
		try {
			gameinput.setName(fieldName.getText());
			gameinput.setType(fieldType.getText());
			gameinput.setPlaytime(Integer.parseInt(fieldPlaytime.getText()));
			gameinput.setDistributor(fieldDistributor.getText());
			gameinput.setPrice(Double.parseDouble(fieldPrice.getText()));
			gamemanager.AddGame(gameinput);
			putObject(gamemanager,"GameManager.ser");
			
		} catch (NameFormException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DistributorNameException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}
	
	public static void putObject(GameManager gameManager,String filename){
		  try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			
			out.writeObject(gameManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  
	  }

}
