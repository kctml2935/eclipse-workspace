package com.itwill01.method;

public class BookLibraryMain {

	public static void main(String[] args) {
/*
		
		/*
		 * 책객체생성
		 */
		Book b1 = new Book();
		/*
		 * 책정보대입메쏘드호출
		 */
		b1.setBook(1, "혼공자", "학습책", "혼자해도 충분한 프로그래밍 자습서");
		/*
		 * 책정보출력메쏘드호출
		 */
		b1.print();

	}

}
