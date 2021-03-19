import java.util.Scanner;

public class MenuManger {

	public static void main(String[] args) {
		int num =0;
		int input_time=0;
		String Game_name =" ",Game_type = " ",Game_distributor = " "; //목록에 들어갈 변수들 초기화
		int Game_playtime = 0;
		double Game_price = 0;
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
		        System.out.print("Game Name :");
	    	    Game_name = input.next();
	    	
	    	    System.out.print("Game Type :");
	    	    Game_type = input.next();
	    	
	    	    System.out.print("Game Playtime :");
	    	    Game_playtime = input.nextInt();
	    	
	    	    System.out.print("Game Distributor :");
	    	    Game_distributor = input.next();
	    	
	    	    System.out.print("Game Price :");
	    	    Game_price = input.nextDouble();
	    	    input_time += 1;
	    	    break;
	       case 2:
	    	   if (input_time == 0) {
	    		    System.out.println("You must input informations about games before delte them");
	    		    System.out.println(" ");
	    		    break;
	    	   }
	    	   Game_name =" ";
	    	   Game_type = " ";
	    	   Game_distributor = " "; 
	   		   Game_playtime = 0;
	   		   Game_price = 0.0;
	           break;
		  case 3:
			  if (input_time == 0) {
	    		    System.out.println("You must input informations about games before edit them");
	    		    System.out.println(" ");
	    		    break;
	    	  }
			        System.out.print("Game Name :");
	    	        Game_name = input.next();
	    	        
	    	        System.out.print("Game Type :");
	    	        Game_type = input.next();
	    	        
	         	    System.out.print("Game Playtime :");
	         	    Game_playtime = input.nextInt();
	   
	    	        System.out.print("Game Distributor :");
	    	        Game_distributor = input.next();
	    	 
	    	        System.out.print("Game Price :");
	    	        Game_price = input.nextDouble();
	    	        break;
		  case 4:
			  if (input_time == 0) {
	    		    System.out.println("You must input informations about games before veiw them");
	    		    System.out.println(" ");
	    		    break;
	    	  }
			  System.out.println("Game Name :" + Game_name);
			  System.out.println("Game Type :" + Game_type);
			  System.out.println("Game Playtime :" + Game_playtime + " hour");
			  System.out.println("Game Distributor :" + Game_distributor);
			  System.out.println("Game Price :" + Game_price + " $");
		}
	}

  }
}
