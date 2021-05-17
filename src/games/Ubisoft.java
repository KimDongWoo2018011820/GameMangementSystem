package games;

import java.util.Scanner;

public class Ubisoft extends Game{
	public Ubisoft( GameKinds kind ) {
		this.platform = kind;	
	}
	public void getUserinput(Scanner input) {
		setName(input);
		setType(input);
		setPlaytime( input);
		setDistributor(input);
		setPrice(input);
	}
	
	
	
	public void printinfo() {
		String skind = GamekindstoString();
		System.out.println("platform : "+skind+ " name : "+ name+" type : "+ type+" playtime : "+ playtime+" distributor : "+ distributor+" price : "+ price+"$");
	}
	

}
