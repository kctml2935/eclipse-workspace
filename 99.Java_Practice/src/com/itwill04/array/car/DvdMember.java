package com.itwill04.array.car;


public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private int memnum;
	private String memname;
	private String memphone;
	private Dvd rentDvd;//빌린dvd
	public DvdMember() {
		
	}
	public DvdMember(int memnum, String memname, String memphone, Dvd rentDvd) {
		this.memnum = memnum;
		this.memname = memname;
		this.memphone = memphone;
		this.rentDvd = rentDvd;
	}
	public void print() {
		System.out.printf("%d번 회원의 이름은 %s이고 전화번호는 %s이며, 빌린DVD",memnum,memname,memphone);
		rentDvd.print();
	}
	public int getMemnum() {
		return memnum;
	}
	public void setMemnum(int memnum) {
		this.memnum = memnum;
	}
	public String getMemname() {
		return memname;
	}
	public void setMemname(String memname) {
		this.memname = memname;
	}
	public String getMemphone() {
		return memphone;
	}
	public void setMemphone(String memphone) {
		this.memphone = memphone;
	}
	public Dvd getRentDvd() {
		return rentDvd;
	}
	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	
	
}