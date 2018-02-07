package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		Scanner keyboard = new Scanner (System.in);
		
		Quadratic q = new Quadratic();
		System.out.println("Enter a :: ");
		int a = keyboard.nextInt();

		System.out.println("Enter b :: ");
		int b = keyboard.nextInt();
		
		System.out.println("Enter c :: ");
		int c = keyboard.nextInt();
		
		q.setQuadratic(a,b,c);
		q.setEquation(a,b,c);
		q.calcRoots();
		q.print();
	}
}
