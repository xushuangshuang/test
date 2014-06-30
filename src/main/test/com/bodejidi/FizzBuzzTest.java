package com.bodejidi;

public class FizzBuzzTest
{
    	static boolean judgeResult = true;
	public static void main(String[] args)
	{
		test_should_be_1();
		test_should_be_2();
		test_should_be_3();
		outputResult();
	}

	public static void test_should_be_1()
	{
		FizzBuzz fizzBuzz1 = new FizzBuzz();
		judgeEquals("1", fizzBuzz1.say(1));
	}
	public static void test_should_be_2()
	{
		FizzBuzz fizzBuzz2 = new FizzBuzz();
		judgeEquals("2", fizzBuzz2.say(2));
	}
	public static void test_should_be_3()
	{
		FizzBuzz fizzBuzz3 = new FizzBuzz();
		judgeEquals("FIZZ", fizzBuzz3.say(3));
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
