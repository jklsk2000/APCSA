package unit6;

import static java.lang.System.*;
import java.lang.Math;

public class Lab06i
{
	public static void main ( String[] args )
	{
		//add test cases
		Prime p = new Prime();
		p.setPrime(24);
		System.out.println(p.toString());
		
		Prime p2 = new Prime();
		p2.setPrime(7);
		System.out.println(p2.toString());
		
		Prime p3 = new Prime();
		p3.setPrime(100);
		System.out.println(p3.toString());
		
		Prime p4 = new Prime();
		p4.setPrime(113);
		System.out.println(p4.toString());
		
		Prime p5 = new Prime();
		p5.setPrime(65535);
		System.out.println(p5.toString());
		
		Prime p6 = new Prime();
		p6.setPrime(2);
		System.out.println(p6.toString());
		
		Prime p7 = new Prime();
		p7.setPrime(7334);
		System.out.println(p7.toString());
		
		Prime p8 = new Prime();
		p8.setPrime(7919);
		System.out.println(p8.toString());
		
		Prime p9 = new Prime();
		p9.setPrime(1115125003);
		System.out.println(p9.toString());
	}	
}