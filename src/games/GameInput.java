package games;

import java.util.Scanner;

import log.EventLogger;

public interface GameInput {
	
	public void getUserinput(Scanner input,EventLogger logger);
	
	public String getName();
	public String getType();
	public String getDistributor();
	public double getPrice();
	public int getPlaytime();
	

	
	public void editgame(EventLogger logger);
	
	public void editinfo(int num,EventLogger logger);
	
	public void printinfo();
}
