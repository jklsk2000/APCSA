package unit11LabAssessment;

import java.util.ArrayList;

public class dish {

	private String name;
	private Ingredients stuff;
	
	public dish(String name, int n, ArrayList<String> x){
		stuff = new Ingredients (n, x);
		
		setName(name);
	}
	public void setName(String n){
		name = n;
	}

	public String toString(){
		String output = name + "\t";
		output += stuff;
		return output;
	}
}
