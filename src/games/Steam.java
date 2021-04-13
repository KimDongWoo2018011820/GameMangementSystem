package games;

import java.util.Scanner;

public class Steam extends Game {
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
	    double discount;
	    for( int i = 1 ; i > 0 ; i ++) {
	    	System.out.print("This platform games are now on Discounting?? (y/n) :");
		    answer = input.next();
	    	
		    if( answer.equals("y")|| answer.equals("Y")) {
		    	System.out.print("How much discount? :");
			    discount = input.nextDouble(); 
	    		System.out.print("Price :");
	    		double price = input.nextDouble();
	    		this.setPrice(price*(100-discount)/(double)100);
	    		break;
	    	}
	    	else if(answer.equals("N")|| answer.equals("n")) {
	    		System.out.print("Price :");
	    		double price = input.nextDouble();
	    		this.setPrice(price);
	    		break;
	    	}
	    	
	    }
	   
	}


}
