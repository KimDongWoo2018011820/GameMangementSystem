package games;

import java.util.Scanner;

public class Nexon extends Game {
	protected String answer;
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
	
	public void printinfo() {
		String skind = "no kinds"; 
		switch(this.platform) {
		case Origin :
			skind = "Origin";
			break;
		case Steam:
			skind = "Steam";
			break;
		case Ubisoft :
			skind = "Ubisoft";
			break;
		case Nexon:
			skind = "Nexon";
			break;
		default :					
		}
		if(this.price ==0) {
			System.out.println("platform : "+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : Free");
			
		}
		else {
			System.out.println("platform :"+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : "+ price+"$");
		}
	}


}
