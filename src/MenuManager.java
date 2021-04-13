import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
	    Scanner input= new Scanner(System.in);
	    GameManager gameManger = new GameManager(input);
	    int num =0;
		
	    //Menu
		while (num != 5){
		    System.out.println("< GameMangementSystem >");
		    System.out.println(" 1. Add Game");
		    System.out.println(" 2. Delete Game");
		    System.out.println(" 3. Edit Game");
		    System.out.println(" 4. View Games");
		    System.out.println(" 5. Exit");
		    System.out.print("Select one number between 1-5 :");
		    num = input.nextInt();
		    
		    //interaction
		   switch (num) {
		   case 1:
			   gameManger.AddGame();
	    	   break;
	       case 2:
	    	   gameManger.DeleteGame();
	           break;
		   case 3:
			   gameManger.EditGame();
			   break;
		   case 4:
			   gameManger.ViewGames();
		       break;
		}
	}

  }
   
    
}
