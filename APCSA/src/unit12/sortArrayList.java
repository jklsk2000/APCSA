package unit12;

import java.util.ArrayList;
import java.lang.Integer;

public class sortArrayList{
	
	public static ArrayList<Integer> sort(ArrayList<Integer> list){
		
		for (int i = 0; i < list.size() - 1; i++){
			if (list.get(i).compareTo(list.get(i+1)) > 0){
				list.add(i, list.get(i+1));
				list.remove(i+2);
			}
		}
		return list;
	}
}
