package unit14;

import static java.lang.System.*;
import java.util.ArrayList;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{       {'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]

		ArrayList<Integer> rray = new ArrayList<Integer>();
		ArrayList<Integer> cray = new ArrayList<Integer>();
		
		if(r >= 0 && r <= 9 && c >= 0 && c <= 9 && atMat[r][c] == '@' && rray.indexOf(r) == -1 && cray.indexOf(c) == -1){
			rray.add(r);
			cray.add(c);
			atCount++;
			
			if (rray.size() <= 10 && cray.size() <= 10){
				countAts(r+1, c);
				countAts(r-1, c);
				countAts(r, c-1);
				countAts(r, c+1);
			}
		}
		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}