package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setQuadratic(a,b,c);
	}

	public void setQuadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		rootOne = (-quadB - Math.sqrt( Math.pow(quadB, 2) - 4 * quadA * quadC)) / (2 * quadA);
		rootTwo = (-quadB + Math.sqrt( Math.pow(quadB, 2) - 4 * quadA * quadC)) / (2 * quadA);
	}

	public void calcRoots( )
	{
		rootOne = (-b - Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		rootTwo = (-b + Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}

	public void print( )
	{
		System.out.println("Root one is " + rootOne  + "\nRoot two is " + rootTwo);
	}
}
