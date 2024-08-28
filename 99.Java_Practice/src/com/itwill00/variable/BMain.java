package com.itwill00.variable;

public class BMain {

	public static void main(String[] args) {
		B a = new B();
		
		a.x = 7;
		a.y = 8;
		
		System.out.println(a.x + " " + a.y);
		
		a.m1();
		a.m2();
	}

}
