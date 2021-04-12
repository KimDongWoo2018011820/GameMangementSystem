package gameinformation;
import java.util.Scanner;

public class Game {
	protected GameKinds kind = GameKinds.Origin;
	protected String name;
	protected String type;
	protected int playtime;
	protected String distributor;
	double price;
	
	public Game() {
		
	}
	
	public Game ( String name , String type, int playtime , String distributor , double price) {
		this.name = name;
		this.type = type;
		this.playtime = playtime;
		this.distributor = distributor;
		this.price = price;
	}
	
	public GameKinds getKind() {
		return kind;
	}

	public void setKind(GameKinds kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printinfo() {
		System.out.println("name : "+ name);
		System.out.println("type : "+ type);
		System.out.println("playtime : "+ playtime);
		System.out.println("distributor : "+ distributor);
		System.out.println("price : "+ price+"$");
	}
	
	public void editgame(){
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("Which information Do you want edit?");
			System.out.println(" 1. name");
			System.out.println(" 2. type");
			System.out.println(" 3. playtimes");
			System.out.println(" 4. distributor");
			System.out.println(" 5. price");
			System.out.println(" 6. exit");
			num = input.nextInt();
			if( num == 6) {
				break;
			}
			editinfo(num);
		}
		
	}
	public void editinfo(int num) {
		Scanner input = new Scanner(System.in);
		switch(num) {
		case 1:
			System.out.print("Edit Name :");
			String name = input.next();
			this.setName(name);
			break;
		case 2:
			System.out.print("Edit Type:");
		    String type = input.next();
		    this.setType(type);
			break;
		case 3:
			System.out.print("Edit Playtime :");
		    int playtime = input.nextInt();
		    this.setPlaytime(playtime);
			break;
		case 4:
			System.out.print("Edit Distributor :");
			String distributor = input.next();
			this.setDistributor(distributor);
			break;
		case 5:
			System.out.print("Edit Price :");
			double price = input.nextDouble();
			this.setPrice(price);
			break;
		}
		
		
	}
	
	public void userinput(Scanner input) {
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
