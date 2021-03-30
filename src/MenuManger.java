import java.util.Scanner;

public class MenuManger {

	public static void main(String[] args) {
		int num =0;
		int input_time=0;
	    Scanner input= new Scanner(System.in);
		
	    //Menu
		while (num != 6){
		    System.out.println("< GameMangementSystem >");
		    System.out.println(" 1. Add Game");
		    System.out.println(" 2. Delete Game");
		    System.out.println(" 3. Edit Game");
		    System.out.println(" 4. View Game");
		    System.out.println(" 5. Show a menu");
		    System.out.println(" 6. Exit");
		    System.out.print("Select one number between 1-6 :");
		    num = input.nextInt();
		    
		    //interaction
		   switch (num) {
		   case 1:
		       AddGame();
	    	   break;
	       case 2:
	    	   DeleteGame();
	           break;
		   case 3:
			   EditGame();
			   break;
		   case 4:
		       ViewGame();
		       break;
		}
	}

  }
    public static void AddGame() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Game Name :");
	    String Game_name = input.nextLine();	
	    System.out.print("Game Type :");
	    String Game_type = input.next();	
	    System.out.print("Game Playtime :");
	    int Game_playtime = input.nextInt();	
	    System.out.print("Game Distributor :");
	    String Game_distributor = input.next();	
	    System.out.print("Game Price :");
	    double Game_price = input.nextDouble();
    }
    public static void DeleteGame() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Game Name :");
	    String Game_name = input.nextLine();	
    	
    	
    }
    
    public static void EditGame() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Game Name :");
	    String Game_name = input.nextLine();	
    	
    	
    }
   
    public static void ViewGame() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Game Name :");
	    String Game_name = input.nextLine();
    	
    }
    
}
