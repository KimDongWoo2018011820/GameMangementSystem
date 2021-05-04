package games;

import java.util.Scanner;

public class Nexon extends Game {
	public Nexon ( GameKinds kind ) {
		this.platform = kind;	
	}
	
	public void getUserinput(Scanner input) {
		System.out.print("Game Name :");
	    String name = input.next();	
	    this.setName(name);
	   
	    System.out.print("Game Type :");
	    String type = input.next();	
	    this.setType(type);
	   
	    System.out.print("Game Playtime :");
	    int playtime = input.nextInt();	
	    this.setPlaytime(playtime);
	   
	    System.out.print("Game Distributor :");
	    String distributor = input.next();
	    this.setDistributor(distributor);
	   
	    String answer;
	    for( int i = 1 ; i > 0 ; i ++) {
	    	System.out.print("This platform games " +this.getName()+ " are Free? (y/n) :");
		    answer = input.next();
	    	
		    if( answer.equals("y")|| answer.equals("Y")) {
		    	this.setPrice(0.0);		
	    		break;
	    	}
	    	else if(answer.equals("N")|| answer.equals("n")) {
	    		this.setPrice(0.0);	
	    		System.out.print("Game Price :");
			 	double price = input.nextDouble();
			 	this.setPrice(price);		    			    	
	    		break;
	    	}
	    	
	    }
	}


}
