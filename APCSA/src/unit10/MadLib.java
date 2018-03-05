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
//		verbs = new ArrayList<String>();
//		nouns = new ArrayList<String>();
//		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		nouns = new ArrayList();
		loadNouns();
		verbs = new ArrayList();
		loadVerbs();
		adjectives = new ArrayList();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File (System.getProperty("user.dir") + "\\src\\unit10\\story.dat"));
			
			while(file.hasNext()){
				String next = file.next();
				if(next.equals("#")){
					System.out.print(getRandomNoun());
				}
				else{
					if(next.equals("@")){
						System.out.print(getRandomVerb());
					}
					else{
						if(next.equals("&")){
							System.out.print(getRandomAdjective());
						}
					}
				}
			}
			
			file.close();
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try{
			Scanner file1 = new Scanner (new File (System.getProperty("user.dir") + ("\\src\\unit10\\nouns.dat")));
			while (file1.hasNextLine()){
				nouns.add(file1.nextLine());
			}
			file1.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file2 = new Scanner (new File (System.getProperty("user.dir") + ("\\src\\unit10\\verbs.dat")));
			while (file2.hasNextLine()){
				nouns.add(file2.nextLine());
			}
			file2.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file3 = new Scanner (new File (System.getProperty("user.dir") + ("\\src\\unit10\\adjectives.dat")));
			while (file3.hasNextLine()){
				nouns.add(file3.nextLine());
			}
			file3.close();
		}
		catch(Exception e)
		{
			out.println(e);
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