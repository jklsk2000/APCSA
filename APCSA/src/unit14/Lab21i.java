package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File (System.getProperty("user.dir") + "//src//unit14//lab21i.dat"));
		int size = file.nextInt();
		file.nextLine();
		String line = file.nextLine();
		Maze onezero = new Maze(size, line);
		System.out.println(onezero);
		
		size = file.nextInt();
		file.nextLine();
		line = file.nextLine();
		Maze onezero1 = new Maze(size, line);
		System.out.println(onezero1);
		
		size = file.nextInt();
		file.nextLine();
		line = file.nextLine();
		Maze onezero2 = new Maze(size, line);
		System.out.println(onezero2);
		
		size = file.nextInt();
		file.nextLine();
		line = file.nextLine();
		Maze onezero3 = new Maze(size, line);
		System.out.println(onezero3);
		
		size = file.nextInt();
		file.nextLine();
		line = file.nextLine();
		Maze onezero4 = new Maze(size, line);
		System.out.println(onezero4);
		
		size = file.nextInt();
		file.nextLine();
		line = file.nextLine();
		Maze onezero5 = new Maze(size, line);
		System.out.println(onezero5);
	}
}