package Unit1;

import static java.lang.System.*;

public class Lab1a
{
	public void stars()
	{
		out.println("********************");
	}
	public void dash()
	{
		out.println("--------------------");
	}
	public void blank()
	{
		out.println("\n\n");
	}
	public void smallbox()
	{
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
	}
	public void bigbox()
	{
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
		out.println("********************");
		out.println("--------------------");
	}
	public static void main (String[] args)
	{
		Lab1a starsandstripes = new Lab1a();
		starsandstripes.smallbox();
		starsandstripes.blank();
		starsandstripes.bigbox();
	}
}




