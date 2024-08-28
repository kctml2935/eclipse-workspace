package com.itwill01.method;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * Dvd객체생성
		 */
		Dvd d1 = new Dvd();
		/*
		 * Dvd정보대입메쏘드호출
		 */
		d1.setDvd(1, "신세계", "느와르");
		/*
		 * Dvd정보출력메쏘드호출
		 */
		d1.Print();
	}

}
