package com.telesko;

public class ExceptionDemo 
{

	public static void main(String[] args)
	{
		try
		{
			int i=7;
			int j=0;
			int k=i/j;
			//int i=9/0;
			System.out.println("output is"+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error");
		}
		//System.out.println("Bye");
		finally
		{
			System.out.println("Bye");
		}

	}

}
