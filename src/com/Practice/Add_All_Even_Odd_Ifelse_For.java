package com.Practice;
import java.util.Scanner;
	public class Add_All_Even_Odd_Ifelse_For 

{
	public static void main(String []Args)
{
		int even =0;
		int odd =0;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a interger number :");
	int num =obj.nextInt();
	System.out.println("evn num :");
	for (int i=1; i<=num; i++)
	{
		if (i%2==0)
		{
			even =even+i;
			System.out.println(i);
		}
		//else {
		else if (i%2==1){
			odd=odd+i;
			System.out.println("odd num :"+i);
	}
	}
	
	System.out.println ("odd number count : "+odd);
	System.out.println("even number count : "+even);
	
}
}
