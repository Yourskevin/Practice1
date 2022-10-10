package com.ipt2;
//Reversal of each word in sentence

public class Base {
	
	public static void main(String[] args) {
		
		String s = "I Am here for an Interview";
		
		String sp[]=s.split(" ");
		for(String a:sp)
		{
			char ch[]=new char[10];
			ch=a.toCharArray();			
			for(int j=a.length()-1;j>=0;j--)
				System.out.print(ch[j]);
			System.out.println();
		}
			
			
	}	
		
		
	}


