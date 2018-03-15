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
		int max = 0;
		
		for (int i=0;i<wordRay.length;i++){
			if(wordRay[i].length() > max){
				max = wordRay[i].length();
			}
		}
		
		for(int i=0;i<wordRay.length;i++){
			for (int j = wordRay[i].length(); j<=max;j++){
				wordRay[i] = " " + wordRay[i];
			}
		}
		
		for (int i=0;i<=max;i++){
			for(int j=wordRay.length-1;j>=0;j--){
				char[] w = wordRay[j].toCharArray();
				output += w[wordRay[j].length() - 1 - i];
			}
			output += "\n";
		}
		
		return output+"\n\n";
	}
}