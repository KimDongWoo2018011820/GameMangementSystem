import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
	    Scanner input= new Scanner(System.in);
	    GameManager gameManger = new GameManager(input);
	    selectMenu(input,gameManger);
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
					   gameManger.AddGame();
					   logger.log("Add students");
			    	   break;
			       case 2:
			    	   gameManger.DeleteGame();
			    	   logger.log("Delete students");
			           break;
				   case 3:
					   gameManger.EditGame();
					   logger.log("Edit students");
					   break;
				   case 4:
					   gameManger.ViewGames();
					   logger.log("View students");
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
   
    
}
