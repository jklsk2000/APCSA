package unit11LabAssessment;

import java.util.ArrayList;

public class restaurantTester {
	public static void main(String[] args){
		String location = "Carmel Valley";
		String phone = "xxx-xxx-xxxx";
		
		Restaurant r = new Restaurant ();
		r.setInfo(location, phone);
		
		Menu m = new Menu ();
		m.setName("Pasta Place");
		ArrayList<String> yum = new ArrayList<String>();
		yum.add("chicken");
		yum.add("tomato sauce");
		yum.add("noodles");
		m.addToMenu("Chicken Pasta", yum.size(), yum);
		
		r.setMenu(m);
		
		System.out.println(r);
	}
}
