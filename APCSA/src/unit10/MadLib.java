package unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		
		try{
			Scanner file = new Scanner(new File(fileName));
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try{
			nouns.add("dog");
			nouns.add("pig");
			nouns.add("chicken");
			nouns.add("building");
			nouns.add("car");
			nouns.add("person");
			nouns.add("place");
			nouns.add("thing");
			nouns.add("truck");
			nouns.add("city");
			nouns.add("state");
			nouns.add("school");
			nouns.add("student");
			nouns.add("bird");
			nouns.add("turkey");
			nouns.add("lion");
			nouns.add("tiger");
			nouns.add("alligator");
			nouns.add("elephant");
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			verbs.add("run");
			verbs.add("fly");
			verbs.add("skip");
			verbs.add("climb");
			verbs.add("clean");
			verbs.add("smell");
			verbs.add("eat");
			verbs.add("cry");
			verbs.add("smile");
			verbs.add("laugh");
			verbs.add("jump");
			verbs.add("crank");
			verbs.add("program");
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try{
			adjectives.add("blue");
			adjectives.add("green");
			adjectives.add("orange");
			adjectives.add("fat");
			adjectives.add("skinny");
			adjectives.add("tall");
			adjectives.add("funny");
			adjectives.add("mad");
			adjectives.add("glad");
			adjectives.add("happy");
			adjectives.add("silly");
			adjectives.add("purple");
			adjectives.add("big");
			adjectives.add("little");
			adjectives.add("tiny");
			adjectives.add("huge");
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		String rverb = "";
		int r = (int) (Math.random() * verbs.size());
		rverb += verbs.get(r);
		return rverb;
	}
	
	public String getRandomNoun()
	{
		String rnoun = "";
		int r = (int) (Math.random() * nouns.size());
		rnoun += nouns.get(r);
		return rnoun;
	}
	
	public String getRandomAdjective()
	{
		String radjective = "";
		int r = (int) (Math.random() * adjectives.size());
		radjective += adjectives.get(r);
		return radjective;
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}