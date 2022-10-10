package com.Practice;

import java.util.Scanner;

public class Scanner_Simple_Progm 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Mail ID ");
		String mail=obj.next();
		System.out.println("Enter your Password");
		String password=obj.next();
		System.out.println("What is your Experience");
		int Experience =obj.nextInt();
		//obj.nextLine(); // since it is a integer, to move to next line
		System.out.println("What is your qualification and depat");
		String Qualification=obj.next();
		System.out.println("enter your company");
		String Qualification1=obj.nextLine();
		
		
		
		System.out.println("Your Mail id is :" + mail);
		System.out.println("You have "+ Experience + " years of experience");
		System.out.println(Qualification + " is your qualification");
		
	}

}
