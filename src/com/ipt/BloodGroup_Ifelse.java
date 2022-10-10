package com.ipt;

import java.util.Scanner;

public class BloodGroup_Ifelse {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Value:");
		int value = obj.nextInt();
		
		if(value >= 90)
		{
			System.out.println("The Blood group is O+ ");
		}
		else if(value <90 && value >=80)
		{
			System.out.println("The Blood group is O- ");
		}
		else if(value <80 && value >=70)
		{
			System.out.println("The Blood group is A+ ");
		}
		else if(value <70 && value >=60)
		{
			System.out.println("The Blood group is A- ");
		}
		else if(value <60 && value >=50)
		{
			System.out.println("The Blood group is B+ ");
		}
		else if(value <50 && value >=40)
		{
			System.out.println("The Blood group is B- ");
		}
		else if(value <40 && value >=30)
		{
			System.out.println("The Blood group is AB+ ");
		}
		else if(value <30 && value >=20)
		{
			System.out.println("The Blood group is AB- ");
		}
		else
		{
			System.out.println("HIV Positive");
		}
		
	}

}
