import java.util.Scanner;

public class Game {
	
	String name;
	String type;
	int playtime;
	String distributor;
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
			this.name = input.next();
			break;
		case 2:
			System.out.print("Edit Type:");
			this.type = input.next();
			break;
		case 3:
			System.out.print("Edit Playtime :");
			this.playtime = input.nextInt();
			break;
		case 4:
			System.out.print("Edit Distributor :");
			this.distributor = input.next();
			break;
		case 5:
			System.out.print("Edit Price :");
			this.price = input.nextDouble();
			break;
		}
		
		
	}

}
