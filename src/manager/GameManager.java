package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import games.Game;
import games.GameInput;
import games.GameKinds;
import games.Nexon;
import games.Origin;
import games.Steam;
import games.Ubisoft;
import log.EventLogger;

public class GameManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2056623188555812622L;
	ArrayList<GameInput> games =new ArrayList<GameInput>();

	public void AddGame(EventLogger logger) {
		Scanner input = new Scanner(System.in);
		int kind = -1; ; 
		for( int i = 1 ;  i > 0 ; i++ ) {
			viewGameplatform();
			try {
				kind = input.nextInt();
				if(Kindselect(kind,logger)==1) {
					
					break;
				}
			}catch(InputMismatchException e){
				System.out.println("Pleas input number 1~4");
				if(input.hasNext()) {
					 input.next();
				 }
				 kind =-1;
			}
		}
    }
	public int Kindselect(int kind,EventLogger logger) {
		Scanner input = new Scanner(System.in);
		GameInput gameinput;
		switch(kind) {
		case 1:
			gameinput = new Origin(GameKinds.Origin);
			logger.log("Select Origin");
			gameinput.getUserinput(input,logger);
			games.add(gameinput);
			return 1;
		case 2:
			gameinput = new Steam(GameKinds.Steam);
			logger.log("Select Steam");
			gameinput.getUserinput(input,logger);
			games.add(gameinput);
			return 1;			
		case 3:
			gameinput = new Ubisoft(GameKinds.Ubisoft);
			logger.log("Select Ubisoft");
			gameinput.getUserinput(input,logger);
			games.add(gameinput);
			return 1;
		case 4:
			gameinput = new Nexon(GameKinds.Nexon);
			logger.log("Select Nexon");
			gameinput.getUserinput(input,logger);
			games.add(gameinput);
			return 1;
		default:			
			System.out.println("Select number between 1 and 4");
			return 0;
		}
	}
	
	public void viewGameplatform() {
		System.out.println("1. Origin ");
		System.out.println("2. Steam ");
		System.out.println("3. Ubisoft");
		System.out.println("4. Nexon");
	}
    public void DeleteGame(EventLogger logger) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Game Name :");
	    String Game_name = input.next();
	    int index = findGameindex(Game_name);
	    deleteGameinfo(index,Game_name,logger);
	   
    }
    public int findGameindex(String Game_name) {
    	int index =-1;
    	for( int i =0; i < games.size(); i++) {
	    	if(games.get(i).getName().equals(Game_name)){
	    		index =i;
		    	break;
	    	}
	    }
    	return index;
    }
    
    public void deleteGameinfo(int index,String Game_name,EventLogger logger) {
    	if (index >= 0) {
	    	games.remove(index);
	    	System.out.println("The GAME : " + Game_name+ " is deleted ");
	    	logger.log("The GAME : " + Game_name+ " is deleted ");
	    	return;
	    }
	    else {
	    	System.out.println("The Game : "+Game_name+" has not been registered");
	    	logger.log("The Game : "+Game_name+" has not been registered");
	    	
	    }    	
    }
    
    public void EditGame(EventLogger logger) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Game Name :");
	    String Game_name = input.next();
	    int index = findGameindex(Game_name);
	    EditGameinfo(index,Game_name,logger);
    }
    
    public void EditGameinfo(int index,String Game_name,EventLogger logger) {
    	if (index >= 0) {
	    	games.get(index).editgame(logger);;
	    	System.out.println("The GAME : " + Game_name+ "is Edited");
	    	logger.log("The GAME : " + Game_name+ "is Edited");
	    	return;
	    }
	    else {
	    	System.out.println("The Game : "+Game_name+" has not been registered");
	    	logger.log("The Game : "+Game_name+" has not been registered");
	    }
    }
    
   
    public void ViewGames() {
        for( int i = 0 ;  i < games.size(); i++) {
        	games.get(i).printinfo();
        }
    	
    }
   
    public int size() {
    	return this.games.size();
    }
    
    public GameInput get(int index) {
    	return (GameInput) games.get(index);
    }

}

