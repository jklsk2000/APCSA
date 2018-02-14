package unit6;

import static java.lang.System.*;

public class ForLoopRunner
{
	//instance variables and constructors could be used, but are not really needed
	
	//runForLoop() will run a for loop from start to stop going up by increment
	public static void runForLoop(int start, int stop, int increment )
	{
		
		out.println("start " + start + " : stop " + stop + " : increment " + increment);
		
		int run = 0;
		for(run = start; run < stop; run = run + increment )
		{
			out.print(run + " ");
		}
		out.println("\n");
	}
}
