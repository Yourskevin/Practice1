package com.Practice;
import java.util.Scanner;

public class Scanner_EB {
	public static void main(String []args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter User name");
		String user_name = obj.next();
		
		System.out.println("Enter Password");
		String password=obj.next();
		
		System.out.println("Units consumed");
		int units=obj.nextInt();
		
		System.out.println("Hellow "+ user_name + " Welcome");
		System.out.println("You have consumed " + units +" Units last month");
		System.out.println("Bill amount in rupees :" + units*3.65);
					}

}
