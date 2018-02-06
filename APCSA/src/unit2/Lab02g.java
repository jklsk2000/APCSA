package unit2;

public class Lab02g {
	public static void main (String[]args)
	{
		Fahrenheit f = new Fahrenheit();
		f.setFahrenheit(98.6);
		f.getCelsius();
		f.print();
		
		f.setFahrenheit(52.3);
		f.getCelsius();
		f.print();
	}
}
