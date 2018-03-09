package unit11;

public class Grade {
	
	double [] grade;
	
	public Grade(double[] grd) {
		setGrade(grd);
	}
	
	public void setGrade(double[] grd) {
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
	
	public double getNumericGrade(int y) {
		return grade[y];
	}
	
	public String toString() {
		String output = "";
		for(int i = 0; i < grade.length; i ++){
			output += getNumericGrade(i) + ": ";
			output += getLetterGrade(grade[i]) + "\n";
		}
		return output;
	}
}
