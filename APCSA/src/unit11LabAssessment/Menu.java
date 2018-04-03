package unit11LabAssessment;

import java.util.ArrayList;

public class Menu {
	private String restName;
	private ArrayList<dish> menu;
	
	public Menu(){
		setName(restName);
		menu = new ArrayList<dish>(0);
	}
	public void setName(String name){
		restName = name;
	}
	public void addToMenu(String name, int n, ArrayList<String> x){
		menu.add(new dish (name,n,x));
	}
	public String toString(){
		String output = "Welcome to " + restName + "!\n\n";
		output += "THE MENU:\n";
		for (int i = 0; i < menu.size(); i++){
			output += "\t" + menu.get(i);
		}
		return output;
	}
}
