package unit11ArrayList;

public class Grade {
	
	double grade;
	
	public Grade(double grd) {
		setGrade(grd);
	}
	
	public void setGrade(double grd) {
		grade = grd;
	}
	
	public String getLetterGrade(double x) {
		
		if (x >= 90){
			return "A";
		}
		else if (x >= 80){
			return "B";
		}
		else if (x >= 70){
			return "C";
		}
		else if (x >= 60){
			return "D";
		}
		else{
			return "F";
		}
	}
	
	public double getNumericGrade() {
		return grade;
	}
	
	public String toString() {
		String output = "";
		output += getNumericGrade() + ": ";
		output += getLetterGrade(grade) + "\n";
		return output;
	}
}
