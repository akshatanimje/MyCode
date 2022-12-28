package com.telesko;

import java.util.Scanner;

//scanner

public class UserInput2 {

	public static void main(String[] args) 
	{
		int n=0;//we can use double also ,their are so many methods inside scanner class
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);//getting the input from keyboard
		n=sc.nextInt();//sc is object of scanner
		System.out.println(n);

	}

}
