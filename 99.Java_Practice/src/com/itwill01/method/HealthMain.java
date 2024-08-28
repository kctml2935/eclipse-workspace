package com.itwill01.method;

public class HealthMain {

	public static void main(String[] args) {
		Health h1 = new Health();
		Health h2 = new Health();

		h1.info(180, 78, '남', "Tomas", 37, "PT담당");
		h2.info(170, 50, '여', "Alice", 26, "요가담당");
		
		h1.print();
		h2.print();
	}

}
