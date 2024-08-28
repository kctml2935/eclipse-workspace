package com.itwill01.method;

public class Dvd {
	/*
	 * <<속성>>
	    Dvd 번호
		Dvd타이틀
		Dvd쟝르
	 */
	private int num;
	private String title;
	private String jenre;
	
	public Dvd() {
		
	}
	/* <<기능>>
	 *   - Dvd정보대입
	 */

	public Dvd(int num, String title, String jenre) {
		
		this.num = num;
		this.title = title;
		this.jenre = jenre;
	}   
	 
public void setDvd(int num, String title, String jenre) {
		
		this.num = num;
		this.title = title;
		this.jenre = jenre;
	}   
	/*   - Dvd정보출력
	 *   
	 */
	public void Print() {
		System.out.printf("%d번 DVD의 제목은 %s이고 장르는 %s 입니다.",this.num,this.title,this.jenre);
	}
}
