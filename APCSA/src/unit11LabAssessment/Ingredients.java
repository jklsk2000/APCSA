package unit11LabAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ingredients {
	
	int number;
	ArrayList<String> ing = new ArrayList<String>();
	
	public Ingredients(int num, ArrayList<String> i){
		setIngredients(number,i);
	}
	public void setIngredients(int num, ArrayList<String> i){
		number = num;
		ing = i;
	}
	public void add(String yum){
		ing.add(yum);
	}
	public void remove(String yuck){
		ing.remove(yuck);
	}
	public int searchFor(String food){
		int x = Collections.binarySearch(ing, food);
		return x;
	}
	public String toString(){
		String output = "Ingredients: ";
		output += ing;
		return output;
	}
}
