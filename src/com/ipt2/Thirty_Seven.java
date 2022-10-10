package com.ipt2;
public class Thirty_Seven {
	
	private void inputNumber(int number) {

		for(int i=1;i<number;i++)
		{
			for(int j=1; j<number; j++)
				
		if(i+j==number)
		
System.out.println("value of i and value of j :" + i+" "+j);
	
		}
	}
	public static void main(String[] args) {
	
		Thirty_Seven obj = new Thirty_Seven();
		obj.inputNumber(20);
		}
	
	}
