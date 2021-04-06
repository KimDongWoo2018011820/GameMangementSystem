import java.util.Scanner;

public class GameManger {
	Game game;
	Scanner input;
	
	GameManger(Scanner input){
		this.input =input;
		
	}
	public void AddGame() {
		game = new Game();
    	System.out.print("Game Name :");
	    game.name = input.next();	
	    System.out.print("Game Type :");
	    game.type = input.next();	
	    System.out.print("Game Playtime :");
	    game.playtime = input.nextInt();	
	    System.out.print("Game Distributor :");
	    game.distributor = input.next();	
	    System.out.print("Game Price :");
	    game.price = input.nextDouble();
    }
    public void DeleteGame() {
    	System.out.print("Game Name :");
	    String Game_name = input.next();
	    if (game == null) {
	    	System.out.println("The Game has not been registered");
	    	return;
	    }
	    if(game.name.equals(Game_name) ){
	    	game = null;
	    	System.out.println("The Game is deleted");    	
	    } 	
    }
    
    public void EditGame() {
    	System.out.print("Game Name :");
	    String Game_name = input.next();
	    if ( game.name.equals(Game_name)) {
	    	game.editgame();
	    	
	    }	
    }
   
    public void ViewGame() {
    	System.out.print("Game Name :");
	    String Game_name = input.next();
        if ( game.name.equals(Game_name)){
        	game.printinfo();    	
	    }
    	
    }

}
