package com.itwill.shop;

public class Member {
	String memName;
	String memPhoneNum;
	String memAddress;
	
	
	public Member(String memName, String memPhoneNum, String memAddress) {
		this.memName = memName;
		this.memPhoneNum = memPhoneNum;
		this.memAddress = memAddress;
	}
	public void print() {
		System.out.printf("이름 : %s , 전화번호 : %s , 주소 : %s\n",this.memName,this.memPhoneNum,this.memAddress);
	}
}
