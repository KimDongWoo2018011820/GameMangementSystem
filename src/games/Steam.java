package games;

import java.util.Scanner;

import log.EventLogger;

public class Steam extends Game {
	protected String answer;
	protected double discount;
	
	public Steam( GameKinds kind ) {
		this.platform = kind;	
	}
	public void getUserinput(Scanner input,EventLogger logger) {
		setName(input,logger);
		setType(input,logger);
		setPlaytime(input,logger);
		setDistributor(input,logger);  
		This_Game_On_Sale(input,logger);
	}
	
	public void This_Game_On_Sale(Scanner input,EventLogger logger) {
		 for( int i = 1 ; i > 0 ; i ++) {
		    	System.out.print("This platform games are now on Discounting?? (y/n) :");
			    answer = input.next();	    	
			    if(answer.equals("y")|| answer.equals("Y") ) {
			    	System.out.print("How much discount? :");
				    discount = input.nextDouble(); 
				    logger.log("InputDiscount : " + discount);
		    		System.out.print("Price :");
		    		double price = input.nextDouble();
		    		this.setPrice(price*(100-discount)/(double)100);
		    		break;
		    	}
		    	else if(answer.equals("N")|| answer.equals("n")) {
		    		System.out.print("Price :");
		    		setPrice(input,logger);
		    	}		    	
		    }		
	}
	
	public void printinfo() {
		String skind = GamekindstoString();
		if( answer.equals("y")|| answer.equals("Y")) {
			System.out.println("platform :"+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : "+ price+"$ " +discount+ " % sales");
		}
		else {
			System.out.println("platform :"+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : "+ price+"$");
		}
	}


}
