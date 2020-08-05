package com.methodOverloading9;

public class MethodOverloadingMain9 {

	public static void main(String[] args) {
		MethodOverloading9 m1=new MethodOverloading9();
		
		m1.move();
		m1.dance();
		
		m1=new Overloading9();
		m1.move();
		m1.dance();
		m1.jump();

	}

}
