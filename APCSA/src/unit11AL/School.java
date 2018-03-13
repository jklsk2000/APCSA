package unit11AL;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class School {
	
	private String schoolName;
	private ArrayList<Class> school;
	
	public School () {
		school = new ArrayList<Class>();
	}
	public School (String name, int classnum){
		schoolName = name;
		school = new ArrayList<Class>(classnum);
	}
	public void addClass(int spot, Class c){
		school.set(spot, c);
	}
}
