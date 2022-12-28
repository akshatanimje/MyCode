package com.telesko;

public class TeluskoException extends Exception
{
	public TeluskoException(String s)//created a construction whose calling a string s
	{
		super(s);//called the super class constructor so that it called the constructor of throwable and by calling detail message it should print the string
	}
}
