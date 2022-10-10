package com.Practice;

import java.util.Scanner;

public class Factorial_Ifelse
{
	public static void main(String[] args)
	{
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number to do Factorial :");
		double number=num.nextDouble();
		
		double c =1.0;
		for (int i=1; i<=number; i++)
			
			c=c*i;
			System.out.println(c);	
	}

}
