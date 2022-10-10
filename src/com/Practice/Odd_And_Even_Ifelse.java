package com.Practice;
import java.util.Scanner;
public class Odd_And_Even_Ifelse 
{
	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number to check odd or even :");
		int number =num.nextInt();
		
		if (number %2==0)
			System.out.println(number + "is even");
		else 
			System.out.println(number + "is odd");
		
	}

}
