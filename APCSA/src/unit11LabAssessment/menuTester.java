package unit11LabAssessment;

import java.util.Scanner;
import java.util.ArrayList;

public class menuTester {
	public static void main (String[] args){
		Menu m = new Menu ();
		m.setName("Pasta Place");
		ArrayList<String> yum = new ArrayList<String>();
		yum.add("chicken");
		yum.add("tomato sauce");
		yum.add("noodles");
		m.addToMenu("Chicken Pasta", yum.size(), yum);
		System.out.println(m);
	}
}