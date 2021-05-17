package games;

import java.util.Scanner;

public class Nexon extends Game {
	protected String answer;
	public Nexon ( GameKinds kind ) {
		this.platform = kind;	
	}
	
	public void getUserinput(Scanner input) {
		setName(input);
		setType(input);
		setPlaytime(input);
		setDistributor(input);
		ThisGameisFree(input);
	}
	
	public void ThisGameisFree(Scanner input) {
		for( int i = 1 ; i > 0 ; i ++) {
	    	System.out.print("This platform games " +this.getName()+ " are Free? (y/n) :");
		    answer = input.next();   	
		    if( answer.equals("y")|| answer.equals("Y")) {
		    	this.setPrice(0.0);		
	    		break;
	    	}
	    	else if(answer.equals("N")|| answer.equals("n")) {
	    		this.setPrice(0.0);
	    		setPrice(input);
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
