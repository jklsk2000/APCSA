package unit14;

import static java.lang.System.*;
import java.util.ArrayList;

		
public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   
   private boolean[][] been;

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
		been = new boolean [10][10];
	}

	public boolean inside(int r, int c){ //inbounds or not
		return (r >= 0) && (r <= 9) && (c >= 0) && (c <= 9);
	}
	
	public boolean beenThere(int r, int c){ //visited squares
		return been[r][c];
	}
	
	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]

		if (!inside(r,c) || atMat[r][c] == '-'){
			return 0;
		}
		
		if (inside(r,c) && !beenThere(r,c)){
			been[r][c] = true;
			if (atMat[r][c] == '@'){
				atCount++;
				
				if (inside(r+1,c)){
					countAts(r+1,c);
				}
				if (inside(r-1,c)){
					countAts(r-1,c);
				}
				if (inside(r,c+1)){
					countAts(r,c+1);
				}
				if (inside(r,c-1)){
					countAts(r,c-1);
				}
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
		atCount = 0;
		return output;
	}
}