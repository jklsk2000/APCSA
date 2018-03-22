package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File(System.getProperty("user.dir") + "//src//unit14//Lab24d.dat"));
		int number = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < number; i++){
			String xo = file.nextLine();
			TicTacToe ttt = new TicTacToe(xo);
//			ttt.getWinner();
			System.out.println(ttt.toString());
		}
			
	}
}
