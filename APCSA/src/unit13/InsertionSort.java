package unit13;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modifiers
	public void add( String  word)
	{
		int loc = 0;
		list.set(0, word);
	}

	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		return "";
	}
}