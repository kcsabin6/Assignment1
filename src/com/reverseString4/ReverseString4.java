package com.reverseString4;

public class ReverseString4 {
	public static void main(String[] args) {
		String str= "Hello how are you";
		String reverse="";
		
		for(int i=(str.length()-1);i>=0;i--) {
			reverse= reverse+ str.charAt(i);
		}
	System.out.println("Reverse string is : "+reverse);
	}
	

}
