package unit6;

import static java.lang.System.*;

public class Lab06g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats t = new LoopStats();
		t.setNums(1, 5);
		System.out.println(t.toString());
		System.out.println("total " + t.getTotal());
		System.out.println("even count " + t.getEvenCount());
		System.out.println("odd count " + t.getOddCount() + "\n");
		
		LoopStats t2 = new LoopStats();
		t2.setNums(2, 8);
		System.out.println(t2.toString());
		System.out.println("total " + t2.getTotal());
		System.out.println("even count " + t2.getEvenCount());
		System.out.println("odd count " + t2.getOddCount() + "\n");
		
		LoopStats t3 = new LoopStats();
		t3.setNums(5, 15);
		System.out.println(t3.toString());
		System.out.println("total " + t3.getTotal());
		System.out.println("even count " + t3.getEvenCount());
		System.out.println("odd count " + t3.getOddCount() + "\n");
	}
}