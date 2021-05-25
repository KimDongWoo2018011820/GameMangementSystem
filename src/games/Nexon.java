package games;

import java.util.Scanner;

import log.EventLogger;

public class Nexon extends Game {
	protected String answer;
	public Nexon ( GameKinds kind ) {
		this.platform = kind;	
	}
	
	public void getUserinput(Scanner input, EventLogger logger) {
		setName(input,logger);
		setType(input,logger);
		setPlaytime(input,logger);
		setDistributor(input,logger);
		ThisGameisFree(input,logger);
	}
	
	public void ThisGameisFree(Scanner input,EventLogger logger) {
		for( int i = 1 ; i > 0 ; i ++) {
	    	System.out.print("This platform games " +this.getName()+ " are Free? (y/n) :");
		    answer = input.next();   	
		    if( answer.equals("y")|| answer.equals("Y")) {
		    	this.setPrice(0.0);
		    	logger.log("InputPrice Free");
	    		break;
	    	}
	    	else if(answer.equals("N")|| answer.equals("n")) {
	    		this.setPrice(0.0);
	    		setPrice(input,logger);
	    		break;
	    	}
	    	
	    }
	}
	
	public void printinfo() {
		String skind = GamekindstoString();
		if(this.price ==0) {
			System.out.println("platform : "+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : Free");
			
		}
		else {
			System.out.println("platform :"+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : "+ price+"$");
		}
	}


}
