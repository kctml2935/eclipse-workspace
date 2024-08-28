package com.itwill04.array.car;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember();
		/*
		 * Dvd객체생성
		 */
		Dvd d1 = new Dvd(3,"위대한 쇼맨","뮤지컬");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		m1.setMemnum(222);
		m1.setMemname("KIM");
		m1.setMemphone("010-1111-8888");
		m1.setRentDvd(d1);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		m1.print();
	}

}