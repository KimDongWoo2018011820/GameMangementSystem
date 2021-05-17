import java.util.ArrayList;
import java.util.Scanner;

import games.Game;
import games.GameInput;
import games.GameKinds;
import games.Nexon;
import games.Origin;
import games.Steam;
import games.Ubisoft;

public class GameManager {
	ArrayList<GameInput> games =new ArrayList<GameInput>();
	Scanner input;
	
	GameManager(Scanner input){
		this.input =input;
		
	}
	public void AddGame() {
		int kind ; 
		GameInput gameinput;
		for( int i = 1 ;  i > 0 ; i++ ) {
			System.out.println("1. Origin ");
			System.out.println("2. Steam ");
			System.out.println("3. Ubisoft");
			System.out.println("4. Nexon");
			System.out.println("Select game kind :");
			kind = input.nextInt();
			
			if( kind == 1 ) {
				gameinput = new Origin(GameKinds.Origin);
				gameinput.getUserinput(input);
				games.add(gameinput);
				break;	
			}
			else if ( kind == 2 ) {
				gameinput = new Steam(GameKinds.Steam);
				gameinput.getUserinput(input);
				games.add(gameinput);
				break;									
			}
			else if ( kind == 3) {
				gameinput = new Ubisoft(GameKinds.Ubisoft);
				gameinput.getUserinput(input);
				games.add(gameinput);
				break;	
			}
			else if( kind ==4) {
				gameinput = new Nexon(GameKinds.Nexon);
				gameinput.getUserinput(input);
				games.add(gameinput);
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
