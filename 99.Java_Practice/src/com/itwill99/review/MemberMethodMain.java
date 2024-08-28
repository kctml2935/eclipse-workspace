package com.itwill99.review;

public class MemberMethodMain {

	public static void main(String[] args) {
		
		/*
		 * MemberMethod객체생성
		 */
		MemberMethod m1 = new MemberMethod();
		m1.no=20;
		m1.s1 = "abc";
		m1.s2 = "def";
		/*
		 * MemberMethodr객체 method1 호출
		 */
		m1.method1();
		/*
		 * MemberMethodr객체 method2 호출
		 */
		m1.method2();
		/*
		 * MemberMethod객체 method3 호출
		 */
		m1.method3(m1.no);
		/*
		 * MemberMethodr객체 method4 호출
		 */
		m1.method4(m1.s1, m1.no);
		/*
		 * MemberMethodr객체 method5 호출
		 */
		m1.method5(m1.s1, m1.s2, m1.no);
		
		
		
		
	}

}