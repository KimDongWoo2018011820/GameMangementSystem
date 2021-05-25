package games;

import java.util.Scanner;

import log.EventLogger;

public class Ubisoft extends Game{
	public Ubisoft( GameKinds kind ) {
		this.platform = kind;	
	}
	public void getUserinput(Scanner input,EventLogger logger) {
		setName(input,logger);
		setType(input,logger);
		setPlaytime( input,logger);
		setDistributor(input,logger);
		setPrice(input,logger);
	}
	
	
	
	public void printinfo() {
		String skind = GamekindstoString();
		System.out.println("platform : "+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : "+ price+"$");
	}
	

}
