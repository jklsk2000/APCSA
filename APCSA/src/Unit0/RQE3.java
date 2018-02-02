package Unit0;

public class RQE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float population = 312032486f;
		float birth = (60*60*24*365)/7f;
		float death = (60*60*24*365)/13f;
		float imm = (60*60*24*365)/45f;
		
		population = population + 5*birth - 5*death + 5*imm;
		
		System.out.println("The US population in five years will be " + population);
	}

}
