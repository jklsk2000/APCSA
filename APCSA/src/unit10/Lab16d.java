package unit10;

import static java.lang.System.*;

public class Lab16d
{
	public static void main( String args[] )
	{
		System.out.println(System.getProperty("user.dir"));
		//make a new MadLib
		String madLibFile = "\\src\\unit10\\story.dat";
		MadLib m = new MadLib(madLibFile);
		out.println("\n");
	}
}