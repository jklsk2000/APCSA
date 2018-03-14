package unit12;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public String getWord(){
		return word;
	}
	
	public boolean equals (Word rhs){
		if (word.equals(rhs.getWord())){
			return true;
		}
		return false;
	}

	public int compareTo( Word rhs )
	{
		if(word.length() > rhs.getWord().length()){
			return 1;
		}
		else if(word.length() < rhs.getWord().length()){
			return -1;
		}
		else{
			if(word.compareTo(rhs.getWord()) > 0){
				return 1;
			}
			else if(word.compareTo(rhs.getWord()) < 0){
				return -1;
			}
			else{
				return 0;
			}
		}
	}

	public String toString()
	{
		return word;
	}
}