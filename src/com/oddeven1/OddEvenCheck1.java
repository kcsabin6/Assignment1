package com.oddeven1;

import java.util.Scanner;

public class OddEvenCheck1 {
	
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the number");
	int x= scanner.nextInt();
	
	boolean result=CheckOddEven1.calculate(x);
	
	if (result==true) {
		System.out.println("The given no. is  Even");
	}
		
		else {
			System.out.println("The given no. is  Odd");
		}
	}
	
	

	}


