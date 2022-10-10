package com.ipt2;

public class Aswin {

	public void  ishu(String name, String qualification, String dob, double  age) {
		
		System.out.println("Name : "+ name);
		System.out.println("Qualification :"+qualification);
		System.out.println("DOB :"+ dob);
		System.out.println("Age :"+age);
		
	}
	public static void main(String[] args) {
		Aswin obj = new Aswin();
		obj.ishu("felix", "M.Tech", "11/04/94", 12.435 );
	}

}
