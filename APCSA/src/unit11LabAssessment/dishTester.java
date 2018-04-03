package unit11LabAssessment;

import java.util.ArrayList;

public class dishTester {
	public static void main (String[] args){
		ArrayList<String> yum = new ArrayList<String>();
		yum.add("chicken");
		yum.add("tomato sauce");
		yum.add("noodles");
		
		dish d = new dish ("Chicken Pasta", yum.size(), yum);
		System.out.println(d);
	}
}
