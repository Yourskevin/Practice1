package com.Practice;
import java.util.Scanner;
public class Electric_Bill_Scanner_Using_if_else {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Please enter the user Name");
		String name= obj.next();
		
		System.out.println("Enter password");
		String password=obj.next();
		
		System.out.println("Are you a Residential/Commercial payer");
		String type1=obj.next();
		
		System.out.println("Enter the Units consumed");
		int units=obj.nextInt();
		
		if ("Residential".equals(type1)) {
		
		if(units<=100)
		{
		System.out.println("No Charges");
		}
		else if(units <=200)
		{
		System.out.println("Bill Amount in Rs:" + units*3.50);	
		}
		else if(units>= 201 && units<=500)
		{
		System.out.println("Bill Amount in Rs:"+ units*5);
		
		}
		else
		{
			System.out.println("Bill Amount in Rs:"+ units*10);
			
		}
	}
		
		else if("Commercial".equals(type1))
		{
			if(units<=100)
			{
			System.out.println("No Charges");
			}
			else if(units <=200)
			{
			System.out.println("Bill Amount in Rs:" + units*5);	
			}
			else if(units>= 201 && units<=500)
			{
			System.out.println("Bill Amount in Rs:"+ units*7);
			
			}
			else
			{
				System.out.println("Bill Amount in Rs:"+ units*15);
				
			}
						
			}
			
		else {
			System.out.println("Olung pathu (Y or N) type panra");
		}	
			
			
		}
		}

	
