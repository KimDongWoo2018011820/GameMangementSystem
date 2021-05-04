package games;

import java.util.Scanner;

public class Ubisoft extends Game {
	public Ubisoft( GameKinds kind ) {
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
	   
	    System.out.print("Game Price :");
	    double price = input.nextDouble();
	    this.setPrice(price);
	}


}
