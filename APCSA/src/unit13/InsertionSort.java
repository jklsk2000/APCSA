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
	public void add(String  word)
	{
		int loc = 0;
		
		if (!exist(word)){
			loc = Collections.binarySearch(list, word);
			loc = Math.abs(loc)-1;
			list.add(loc,word);
		}
	}

	public void remove(String word)
	{
		list.remove(word);
	}
	
	private boolean exist(String word){
		if(Collections.binarySearch(list,word) > 0){
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		for (int i=0; i<list.size(); i++){
			int min = i;
			for (int j = i + 1; j < list.size(); j++){
				if (list.get(j).compareTo(list.get(min)) < 0){
					min = j;
				}
			}
			if (min != i){
				String filler = list.get(min);
				list.set(min, list.get(i));
				list.set(i, filler);
			}
		}
		
		String output = "";
		
		for (int x = 0; x < list.size(); x++){
			output += list.get(x) + " ";
		}
		return output;
	}
}