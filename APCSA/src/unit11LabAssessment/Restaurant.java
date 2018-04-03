package unit11LabAssessment;

public class Restaurant {
	private String location;
	private String phone;
	private Menu menu;
	
	public Restaurant(){
		setInfo(location, phone);
		setMenu(menu);
	}
	public void setInfo(String x, String y){
		location = x;
		phone = y;
	}
	public void setMenu(Menu m){
		menu = m;
	}
	public String toString(){
		String output = "Branch Location: " + location + "\n";
		output += "Phone Number: " + phone + "\n\n";
		output += menu;
		return output;
	}
}
