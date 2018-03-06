package unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	private String madlib;
	private Random rand;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		rand =  new Random();
	}

	public MadLib(String fileName)
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		rand = new Random();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			madlib = "";
						
			while (file.hasNext()) {
				String next = file.next();
								
				if (next.equals("#")) {
					madlib += getRandomNoun();
				}
				else if (next.equals("@")) {
					madlib += getRandomVerb();
				}
				else if (next.equals("&")) {
					madlib += getRandomAdjective();
				}
				else {
					madlib += next;
				}
				
				madlib += " ";
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner nounsdat = new Scanner(new File("nouns.dat"));
			
			while (nounsdat.hasNext()) {
				nouns.add(nounsdat.next());
			}
		}
		catch(Exception e) {}
	}
	
	public void loadVerbs()
	{
		try{
			Scanner verbsdat = new Scanner(new File("verbs.dat"));
			
			while (verbsdat.hasNext()) {
				verbs.add(verbsdat.next());
			}
		}
		catch(Exception e) {}
	}

	public void loadAdjectives()
	{
		try{
			Scanner adjdat = new Scanner(new File("adjectives.dat"));
			
			while (adjdat.hasNext()) {
				adjectives.add(adjdat.next());
			}
		}
		catch(Exception e) {}
	}

	public String getRandomVerb()
	{
		return verbs.get(rand.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		return nouns.get(rand.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		return adjectives.get(rand.nextInt(adjectives.size()));
	}		

	public String toString()
	{
	   return madlib;
	}
}