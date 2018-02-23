package unit8;

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		number = 0;
	
		roman = roman.replaceAll("CM", "DCCCC");
		roman = roman.replaceAll("CD", "CCCC");
		roman = roman.replaceAll("XC", "LXXXX");
		roman = roman.replaceAll("XL", "XXXX");
		roman = roman.replaceAll("IX", "VIIII");
		roman = roman.replaceAll("IV", "IIII");
		
		
		for (int i = 0; i < LETTERS.length; i++)
		{
			for (int j = 0; j < roman.length(); j++)
			{
				if (roman.substring(j, j+1).equals(LETTERS[i]))
				{
					number += NUMBERS[i];
				}
			}
			
		}
		
		return number;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < NUMBERS.length; i++)
		{
			while (number >= NUMBERS[i]){
				number = number - NUMBERS[i];
				output += LETTERS[i];
			}
		}
		return output + "\n";
	}
}