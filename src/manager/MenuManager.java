package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;
import manager.GameManager;


public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

	    Scanner input= new Scanner(System.in);
	    GameManager gameManager = getObject("GameManager.ser");
	    if(gameManager == null) {
	    	gameManager = new GameManager();
	    }
	    WindowFrame frame = new WindowFrame(gameManager);
	    selectMenu(input,gameManager);
	    putObject(gameManager,"GameManager.ser");
  }
  public static void selectMenu(Scanner input,GameManager gameManger) {
		  int num =0;
		    //Menu
			while (num != 5){
				showMenu();
			 try {   
				num = input.nextInt();
				 switch (num) {
				   case 1:
					   gameManger.AddGame(logger);
					   logger.log("Add Games");
			    	   break;
			       case 2:
			    	   gameManger.DeleteGame(logger);
			    	   logger.log("Delete Games");
			           break;
				   case 3:
					   gameManger.EditGame(logger);
					   logger.log("Edit Games");
					   break;
				   case 4:
					   gameManger.ViewGames();
					   logger.log("View Games");
				       break;
				   default:
					   logger.log("EXIT");
					   continue;
				}
			 }catch(InputMismatchException e) {
				 System.out.println("Please Input Number 1 ~ 5");
				 if(input.hasNext()) {
					 input.next();
				 }
				 num =-1;
			 }
		}
  }
	
  public static void showMenu() {
	    System.out.println("< GameMangementSystem >");
	    System.out.println(" 1. Add Game");
	    System.out.println(" 2. Delete Game");
	    System.out.println(" 3. Edit Game");
	    System.out.println(" 4. View Games");
	    System.out.println(" 5. Exit");
	    System.out.print("Select one number between 1-5 :");
	  
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
