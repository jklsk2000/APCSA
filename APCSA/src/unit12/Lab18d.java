package unit12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;
import java.util.ArrayList;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File(System.getProperty("user.dir") + "//src//unit12//lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();

		ArrayList<Word> wordList = new ArrayList<Word>(size);
		
		while (file.hasNextLine()){
			wordList.add(new Word (file.nextLine()));
		}
		
		Collections.sort(wordList);
		
		for (int i = 0; i < wordList.size(); i++){
			System.out.println(wordList.get(i));
		}
	}
}