package unit12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File(System.getProperty("user.dir") + "//src//unit12//lab18e.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<WordVowel> wordList = new ArrayList<WordVowel>(size);
		
		while (file.hasNextLine()){
			wordList.add(new WordVowel (file.nextLine()));
		}
		
		Collections.sort(wordList);
		
		for (int i = 0; i < wordList.size(); i++){
			System.out.println(wordList.get(i));
		}
	}
}