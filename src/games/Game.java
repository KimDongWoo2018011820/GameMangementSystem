package games;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DistributorNameException;
import exception.NameFormException;
import log.EventLogger;

public abstract class Game implements GameInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7491748519103648597L;
	protected GameKinds platform;
	protected String name;
	protected String type;
	protected int playtime;
	protected String distributor;
	protected double price;
	
	public Game() {
		
	}
	
	public Game ( String name ) {
		this.name = name;
	}
	public Game ( GameKinds kind ) {
		this.platform = kind;	
	}
	
	public Game ( String name , String type, int playtime , String distributor , double price) {
		this.name = name;
		this.type = type;
		this.playtime = playtime;
		this.distributor = distributor;
		this.price = price;
	}
	public Game ( GameKinds kind ,String name , String type, int playtime , String distributor , double price) {
		this.platform = kind;
		this.name = name;
		this.type = type;
		this.playtime = playtime;
		this.distributor = distributor;
		this.price = price;
	}
	
	public GameKinds getKind() {
		return platform;
	}

	public void setKind(GameKinds kind) {
		this.platform = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameFormException {
		if(checknameform(name)==1) {
			throw new NameFormException();
		}
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPlaytime() {
		return playtime;
	}

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) throws DistributorNameException{
		if( checknameform(distributor)==1) {
			throw new DistributorNameException();
		}
		this.distributor = distributor;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void printinfo();
	
	public void editgame(EventLogger logger){
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(true) {
			showeditMenu();
			num = input.nextInt();
			if( num == 6) {
				break;
			}
			editinfo(num,logger);
		}
		
	}
	public void showeditMenu() {
		System.out.println("Which information Do you want edit?");
		System.out.println(" 1. name");
		System.out.println(" 2. type");
		System.out.println(" 3. playtimes");
		System.out.println(" 4. distributor");
		System.out.println(" 5. price");
		System.out.println(" 6. exit");
	}
	
	
	public void setName(Scanner input,EventLogger logger) {
		int i=0;
		while(i==0) {
			try {
				System.out.print("Name :");
				String name = input.next();
				this.setName(name);
				logger.log("InputName : "+name);
				break;
			}catch(NameFormException e) {
				System.out.println("There are no games whose names are made up of numbers.");
			}
		}
	}
	public void setType(Scanner input,EventLogger logger) {
		System.out.print("Type:");
	    String type = input.next();
	    this.setType(type);
	    logger.log("InputType : "+type);
	}
	public void setPlaytime(Scanner input,EventLogger logger) {
		int i =0;
		while(i==0)
			try {
				System.out.print("Playtime :");
				int playtime = input.nextInt();
				this.setPlaytime(playtime);
				logger.log("InputPlaytime : "+playtime);
				break;
			}catch(InputMismatchException e) {
				System.out.println("Please input number");
				if(input.hasNext()) {
					 input.next();
				 }
			}
	}
	
	
	
	public void setDistributor(Scanner input,EventLogger logger) {
		int i =0;
		while(i!=10) {
			try {
				System.out.print("Distributor :");
				String distributor = input.next();
				this.setDistributor(distributor);
				logger.log("InputDistributor : "+distributor);
				break;
			}catch(DistributorNameException e) {
				System.out.println("There are no Distributor whose names are made up of numbers.");
			}
		}
	}
	public void setPrice(Scanner input,EventLogger logger) {
		int i=0;
		while(i==0) {
			try {
				System.out.print("Price :");
				double price = input.nextDouble();
				this.setPrice(price);
				logger.log("InputPrice :  "+price);
				break;
			}catch(InputMismatchException e) {
				System.out.println("Pleas input number");
				 if(input.hasNext()) {
					 input.next();
				 }
			}
		}
	}
	
	
	public void editinfo(int num,EventLogger logger) {
		Scanner input = new Scanner(System.in);
		switch(num) {
		case 1:
			setName( input,logger);
			break;
		case 2:
			setType( input,logger);
			break;
		case 3:
			setPlaytime( input,logger);
			break;
		case 4:
			setDistributor(input,logger);
			break;
		case 5:
			setPrice(input,logger);
			break;
		}
		
		
	}
	public void getUserinput(Scanner input,EventLogger logger) {
		setName(input,logger);
		setType(input,logger);
		setPlaytime( input,logger);
		setDistributor(input,logger);
		setPrice(input,logger);
	}
	
	public String GamekindstoString() {
		String skind = "no kins"; 
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
		return skind;
	}
	
	public int checknameform(String name) {
		int count =0;
		char list[]= name.toCharArray();
		for( int i =0; i< name.length();i++) {
			if(list[i]>='0'&&list[i]<='9') {
				count +=1;
			}
		}
		if(count == name.length()) {
			return 1;
		}
		return 0;
	}

}
