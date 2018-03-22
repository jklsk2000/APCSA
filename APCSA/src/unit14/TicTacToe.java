package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char [0][0];
	}

	public TicTacToe(String game)
	{
		char[] xo = game.toCharArray();
		
		mat = new char [3][3];
		
		int count = 0;
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				mat[i][j] = xo[count];
				count++;
			}
		}
		
		for(int x = 0; x < 3; x++){
			for (int y = 0; y < 3; y++){
				System.out.print(mat[x][y]);
			}
			System.out.println();
		}
	}

	public String getWinner()
	{
		String output = "";
		if (horizontal()){
			
		}
		else if (vertical()){
			
		}
		else if (diagonal()){
			
		}
		else{
			output += "draw";
		}
		return output;
	}
	
	public boolean horizontal(){
		for (int i = 0; i < 3; i++){
			if (mat[i][0] == mat [i][1] && mat[i][1] == mat[i][2]){
				System.out.println(mat[i][0] + " won horizontally");
				return true;
			}
		}
		return false;
	}
	
	public boolean vertical(){
		for (int i = 0; i < 3; i++){
			if (mat[0][i] == mat [1][i] && mat[1][i] == mat[2][i]){
				System.out.println(mat[0][i] + " won vertically");
				return true;
			}
		}
		return false;
	}
	
	public boolean diagonal(){
		if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]){
			System.out.println(mat[0][0] + " won diagonally");
			return true;
		}
		else if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]){
			System.out.println(mat[0][2] + " won diagonally");
			return true;
		}
		return false;
	}

	public String toString()
	{
		String output="";
		output = getWinner();
		return output+"\n\n";
	}
}