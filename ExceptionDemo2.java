package com.telesko;

public class ExceptionDemo2 
{
	public static void main(String[] args)
	{
		try
		{
			int a[]=new int[5];//null; //new int[6];
			a[4]=8;
			int i=7;
			int j=0;
			int k=i/j;
			//int i=9/0;
			System.out.println("output is"+k);
		}
		catch(ArithmeticException  e)
		{
			System.out.println("Cannot divide by zero");
		}
		//System.out.println("Bye");
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Stay in your limits..");
		}
		catch(Exception e)
		{
			System.out.println("Something Wrong");
		}
		finally
		{
			System.out.println("Bye");
		}

	}
}
