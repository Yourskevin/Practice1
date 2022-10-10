package com.ipt;

import java.util.Scanner;

public class Marks_Ifelse {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Marks :");
		int number = obj.nextInt();

		System.out.println("=====FIND YOUR GRADE======");
		if (number >= 90) {
			System.out.println("For the Marks :" + number + "The Grade is 'A'");
		}

		else if (number < 90 && number >= 80) {
			System.out.println("For the Marks :" + number + "The Grade is 'B'");
		}

		else if (number < 80 && number >= 70) {
			System.out.println("For the Marks :" + number + "The Grade is 'C'");
		}

		else if (number < 70 && number >= 60) {
			System.out.println("For the Marks :" + number + "The Grade is 'D'");
		} else if (number < 60 && number >= 50) {
			System.out.println("For the Marks :" + number + "The Grade is 'E'");
		} else {
			System.out.println("For the Marks :" + number + "The Grade is 'F'");
		}
	}

}
