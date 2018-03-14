package Lab18e;

public class WordVowel implements Comparable<WordVowel>
{
	private String word;

	public WordVowel( String s)
	{
		word = s;
	}
	
	public String getWord(){
		return word;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		char[] c = word.toCharArray();
		char[] v = vowels.toCharArray();
		
		for (int i = 0; i < c.length; i++){
			for (int j = 0; j < v.length; j++){
				if (c[i] == v[j]){
					vowelCount = vowelCount + 1;
				}
			}
		}
		
		return vowelCount;
	}

	public boolean equals (WordVowel rhs){
		if (word.equals(rhs.getWord())){
			return true;
		}
		return false;
	}
	
	public int compareTo(WordVowel rhs)
	{
		if (numVowels() > rhs.numVowels())
		{
			return 1;
		}
		else if (numVowels() < rhs.numVowels()){
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