package games;

import java.util.Scanner;

import log.EventLogger;

public interface GameInput {
	
	public void getUserinput(Scanner input,EventLogger logger);
	
	public String getName();
	
	public void editgame(EventLogger logger);
	
	public void editinfo(int num,EventLogger logger);
	
	public void printinfo();
}
