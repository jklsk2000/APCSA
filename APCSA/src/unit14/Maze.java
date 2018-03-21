package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean[][] been;


	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		been = new boolean [size] [size];
		maze = new int [size] [size];
		String[] l = line.split(" ");
		int[] lint = new int [l.length];
		
		for (int x = 0; x < l.length; x++){
			lint[x] = Integer.parseInt(l[x]);
		}
		int place = 0;
		for(int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				maze[i][j] = lint[place];
				place++;
			}
		}
		for(int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean inside(int r, int c){ //inbounds or not
		return (r >= 0) && (r < maze[0].length) && (c >= 0) && (c < maze[0].length);
	}
	
	public boolean beenThere(int r, int c){ //visited squares
		return been[r][c];
	}

	public boolean hasExitPath(int r, int c)
	{
		boolean deway = false;
		if (inside(r,c) && !beenThere(r,c)){
			been[r][c] = true;
			if (maze[r][c] == 1){
				if (c == maze.length - 1){
					deway = true;
				}
				if (!deway && inside(r+1,c)){
					deway = hasExitPath(r+1,c);
				}
				if (!deway && inside(r-1,c)){
					deway = hasExitPath(r-1,c);
				}
				if (!deway && inside(r,c+1)){
					deway = hasExitPath(r,c+1);
				}
				if (!deway && inside(r,c-1)){
					deway = hasExitPath(r,c-1);
				}
			}
		}
		return deway;
	}

	public String toString()
	{
		String output="";
		if (hasExitPath(0,0)){
			output += "exit found\n";
		}
		else if (!hasExitPath(0,0)){
			output += "exit not found\n";
		}
		return output;
	}
}