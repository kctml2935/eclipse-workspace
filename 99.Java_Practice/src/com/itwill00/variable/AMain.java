package com.itwill00.variable;

public class AMain {

	public static void main(String[] args) {
		A a1 = new A();
		a1.x=10;
		a1.y="abc";
		a1.z=3.14;
		a1.k=true;
		
		System.out.println(a1.x + " " + a1.y + " "+ a1.z+" "+a1.k);
		a1.print();

	}

}
