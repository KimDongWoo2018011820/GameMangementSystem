package games;

import java.util.Scanner;

import exception.DistributorNameException;
import exception.NameFormException;
import log.EventLogger;

public interface GameInput {
	
	public void getUserinput(Scanner input,EventLogger logger);
	
	public String getName();
	public String getType();
	public String getDistributor();
	public double getPrice();
	public int getPlaytime();
	
	public void setName(String name) throws NameFormException;
	public void setType(String type); 
	public void setPlaytime(int playtime); 
	public void setDistributor(String distributor) throws DistributorNameException;
	public void setPrice(double price);
	
	public void editinfo(int num,EventLogger logger);
	public void editgame(EventLogger logger);
	public void printinfo();
}
