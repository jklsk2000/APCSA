package unit2;

public class Lab02c
{
	public static void main( String[] args )
   {
 		//add more test cases
		Average avg = new Average();
		avg.setNums(5, 5);
		avg.average();
		avg.print();
		
		avg.setNums(90, 100);
		avg.average();
		avg.print();
		
		avg.setNums(100, 85.8);
		avg.average();
		avg.print();
		
		avg.setNums(-100, 55);
		avg.average();
		avg.print();
	}
}