package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField m1 = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		m1.a = 10;
		m1.b = "가나다";
		m1.c = 12.34;
		m1.d = false;
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		m1.print();
	}

}