import java.util.ArrayList;
import java.util.Scanner;

import games.Game;
import games.Nexon;
import games.Steam;
import games.Ubisoft;

public class GameManager {
	ArrayList<Game> games =new ArrayList<Game>();
	Scanner input;
	
	GameManager(Scanner input){
		this.input =input;
		
	}
	public void AddGame() {
		int kind ; 
		Game game;
		for( int i = 1 ;  i > 0 ; i++ ) {
			System.out.println("1. Origin ");
			System.out.println("2. Steam ");
			System.out.println("3. Ubisoft");
			System.out.println("4. Nexon");
			System.out.println("Select game kind :");
			kind = input.nextInt();
			
			if( kind == 1 ) {
				game = new Game();
				game.getUserinput(input);
				games.add(game);
				break;	
			}
			else if ( kind == 2 ) {
				game = new Steam();
				game.getUserinput(input);
				games.add(game);
				break;									
			}
			else if ( kind == 3) {
				game = new Ubisoft();
				game.getUserinput(input);
				games.add(game);
				break;	
			}
			else if( kind ==4) {
				game = new Nexon();
				game.getUserinput(input);
				games.add(game);
				break;	
			}
			else {
				System.out.println("Select number between 1 and 4");
			}
			
		}
    }
    public void DeleteGame() {
    	System.out.print("Game Name :");
	    String Game_name = input.next();
	    int index = -1;
	    for( int i =0; i < games.size(); i++) {
	    	if(games.get(i).getName().equals(Game_name)){
	    		index =i;
		    	break;
	    	}
		     	
	    }
	    if (index >= 0) {
	    	games.remove(index);
	    	System.out.println("The GAME : " + Game_name+ " is deleted ");
	    	return;
	    }
	    else {
	    	System.out.println("The Game : "+Game_name+" has not been registered");
	    }
	   
    }
    
    public void EditGame() {
    	System.out.print("Game Name :");
	    String Game_name = input.next();
	    int index = -1;
	    for( int i =0; i < games.size(); i++) {
	    	if(games.get(i).getName().equals(Game_name)){
	    		index =i;
		    	break;
	    	}		    	    	
	    }
	    if (index >= 0) {
	    	games.get(index).editgame();;
	    	System.out.println("The GAME : " + Game_name+ "is Edited");
	    	return;
	    }
	    else {
	    	System.out.println("The Game : "+Game_name+" has not been registered");
	    }
    }
   
    public void ViewGames() {
//    	System.out.print("Game Name :");
//	    String Game_name = input.next();
        for( int i = 0 ;  i < games.size(); i++) {
        	games.get(i).printinfo();
        }
    	
    }

}
