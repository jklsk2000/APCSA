package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		
		for (int i=0;i<wordRay.length;i++){
			if(wordRay[i].length() > max){
				max = wordRay[i].length();
			}
		}
		
		
		for (int i=0;i<max;i++){
			for(int j=wordRay.length-1;j>=0;j--){
				char[] w = wordRay[j].toCharArray();
				output += 
			}
		}
		
		return output+"\n\n";
	}
}