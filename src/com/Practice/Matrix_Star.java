package com.Practice;

public class Matrix_Star {
	
	public static void main(String[] args) {
		
		int i,j,c=1;
		for(i=1; i<=5;i++)
		{
			for(int k=c;k<5;k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
			{
				
				System.out.print(" "+j);
			} c++;
			System.out.print("\n");
		}
		
	}

}
