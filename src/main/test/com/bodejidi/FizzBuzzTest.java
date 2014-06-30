package com.bodejidi;

public class FizzBuzzTest
{

    	
	public static void main(String[] args)
	{
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		static boolean judgeResult = true;
		String actualResult = fizzBuzz.say(1);

		if(false == "1".equals(actualResult))
		{
			judgeResult = false;
			System.out.println("EXCEPTION : "+ "1" + " BUT " + actualResult );
		}
		
		actualResult = fizzBuzz.say(2);

		if(false == "2".equals(actualResult))
		{
		    	judgeResult = false;
			System.out.println("EXCEPTION : "+ "2" + " BUT " + actualResult );
		}


		if(judgeResult)
		{
			System.out.println("TEST SUCCESS");
		}
		else
		{
			System.out.println("TEST FAIL");
		}

	}
}
