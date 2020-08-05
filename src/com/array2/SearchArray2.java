package com.array2;

import java.util.Scanner;

public class SearchArray2 {

	public static void main(String[] args) {
		
		int[] num = {1,4,23,7,45,5}; 
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter the number you want to search in array");
		
		int x = scanner.nextInt();
		
		//ArraySearch a1= new ArraySearch();
		
		boolean result=ArraySearch2.arsrchm(x,num);
		
		if(result== true) {System.out.println("Search found");}
		else {System.out.println("Search not found");}
		

		  
	}

}
