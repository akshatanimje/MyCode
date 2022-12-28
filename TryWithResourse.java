package com.telesko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResourse 
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Enter a number");
		
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
		{
			
			n=Integer.parseInt(br.readLine());
		}
		
		System.out.println(n);

	}

}
