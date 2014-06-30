package com.bodejidi;

public class FizzBuzz
{
	public String say(Integer num)
	{
	    	if(num % 3 == 0)
		{
			return "FIZZ";
		}

		return String.valueOf(num);
	}
}
