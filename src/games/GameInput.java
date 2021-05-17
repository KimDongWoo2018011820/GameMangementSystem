package games;

import java.util.Scanner;

public interface GameInput {
	
	public void getUserinput(Scanner input);
	
	public String getName();
	
	public void editgame();
	
	public void editinfo(int num);
	
	public void printinfo();
}
