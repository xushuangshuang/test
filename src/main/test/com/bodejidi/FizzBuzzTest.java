package com.bodejidi;

public class FizzBuzzTest
{
    	static boolean judgeResult = true;
	public static void main(String[] args)
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		String actualResult = fizzBuzz.say(1);
		judgeEquals("1", actualResult);
		actualResult = fizzBuzz.say(2);
		judgeEquals("2", actualResult);

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
