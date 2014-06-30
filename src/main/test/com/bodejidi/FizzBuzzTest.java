package com.bodejidi;

public class FizzBuzzTest
{
    	static boolean judgeResult = true;
	public static void main(String[] args)
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		judgeEquals("1", fizzBuzz.say(1));
		judgeEquals("2", fizzBuzz.say(2));
		judgeEquals("FIZZ", fizzBuzz.say(3));
		outputResult();
	}

	public static void outputResult()
	{
		if(judgeResult)
		{
			System.out.println("TEST SUCCESS");
		}
		else
		{
			System.out.println("TEST FAIL");
		}
	}

	public static void judgeEquals(String expectedResult, String actualResult)
	{
		if(false == expectedResult.equals(actualResult))
		{
			judgeResult = false;
			System.out.println("EXCEPTION : "+ expectedResult + " BUT " + actualResult );
		}
	}
}
