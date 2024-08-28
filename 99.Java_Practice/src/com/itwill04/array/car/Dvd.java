package com.itwill04.array.car;


public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	  번호
	  타이틀
	  쟝르
	 */ 
	private int num;
	private String title;
	private String jenre;
	 /* <<기능>>
	 *   Dvd정보출력
	 *   
	 */
	public Dvd() {
		// TODO Auto-generated constructor stub
	}
	public Dvd(int num, String title, String jenre) {
		this.num = num;
		this.title = title;
		this.jenre = jenre;
	}
	public void print() {
		System.out.printf("의 번호는 %d이고 dvd의 제목은 %s이고 장르는 %s입니다.",num,title,jenre);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getJenre() {
		return jenre;
	}
	public void setJenre(String jenre) {
		this.jenre = jenre;
	}
	

	
	
	
}