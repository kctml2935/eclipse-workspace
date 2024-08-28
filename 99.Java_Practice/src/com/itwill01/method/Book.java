package com.itwill01.method;

public class Book {
/*
	
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */
	private int num;
	private String title, jenre, explain;
	
	public Book() {
		
	}
	 /* <<기능>>
	 *   
	 *   - 책정보출력
	 *   - 책정보대입
	 *   
	 */

	public void setBook(int num, String title, String jenre, String explain) {
		
		this.num = num;
		this.title = title;
		this.jenre = jenre;
		this.explain = explain;
	}
	
	public void print() {
		System.out.printf("%d번 책의 제목은 %s이며 종류는 %s, 설명은 %s\n", this.num,this.title,this.jenre,this.explain);
	}
}
