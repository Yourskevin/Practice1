package com.ipt2;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String name = "felixprabhu";
		
		StringBuilder n = new StringBuilder("mom");
		StringBuilder rev = new StringBuilder("mom");
		//StringBuilder rev = n.reverse();
		if(n==rev) {
			System.out.println("The string is palindrom");
		}
		int hashCode1= n.hashCode();
		int hashCode2= rev.hashCode();
		System.out.println(hashCode1);
		System.out.println(hashCode2);
	 
		if(n.equals(rev))
		{
			System.out.println("The string is palindrom");
		}
		else System.out.println("Not a palindrome");
		
		System.out.println(rev);
		
		for(int i=(name.length()-1); i>=0; i--)
		{
			System.out.print(name.charAt(i));
		}
	}

}
