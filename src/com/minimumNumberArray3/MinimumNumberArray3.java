package com.minimumNumberArray3;

import java.util.Scanner;

public class MinimumNumberArray3 {

	public static void main(String[] args) {
		//inty=num[0];
		//int[] num= {1,3,5,7,45,8,34,6,2};
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		
		int len=scanner.nextInt();
		int[] num = new int[len];
		
		for(int i=0; i<len; i++) {
			System.out.println("Enter element"+i);
			int y=scanner.nextInt();
			num[i] =y;
		}
		
		//MinArry m1= new MinArry();
		//m1.minCalc();
		System.out.println("Minimum is : "+minCalc(num));

	
	}

	private static Integer minCalc(int[] num) {
		int min = num[0];
		for (int i = 1; i < (num.length); i++) {
			if (min>num[i]) {
				min = num[i];}
		}
			return min;
	
	
}
}
