package com.itwill00.variable;

public class DuoMemberInfoPrint {
/*
*************************
회원번호 : 236514   
이    름 : 홍길동   
주민번호 : 201212-3495039   
성    별 : 남   
결혼횟수 : 0   
흡연여부 : true   
키       : 178.3   
학    점 : A   
용    모 : 상(중)   
**************************
 */
	public static void main(String[] args) {
		int 회원번호 = 236514;
		String name = "홍길동";
		String 주민번호 = "201212-3495039";
		char gender = '남';
		int 결혼횟수 = 0;
		boolean 흡연여부 = true;
		double height = 178.3;
		char grade = 'A';
		String 용모 = "상(중)";
		System.out.println("*************************");
		System.out.println("회원번호 : " +회원번호);
		System.out.println("이    름 : " +name);
		System.out.println("주민번호 : " +주민번호);
		System.out.println("성    별 : " +gender);
		System.out.println("결혼횟수 : " +결혼횟수);
		System.out.println("흡연여부 : " +흡연여부);
		System.out.println("키       : " +height);
		System.out.println("학    점 : " +grade);
		System.out.println("용    모 : " +용모);
		System.out.println("*************************\n");
/*
************************************************************************************************
회원번호  	이름 	   주민번호		  성별	   결혼횟수	     흡연여부	   키	  학점	   용모 
************************************************************************************************
12345	   김경호     235584-2631542     남          1         true       187.3      A       하
 */
		int 회원번호1 = 12345;
		String name1 = "김경호";
		String 주민번호1 = "235584-2631542";
		char gender1 = '남';
		int 결혼횟수1 = 1;
		boolean 흡연여부1 = true;
		double height1 = 187.3;
		char grade1 = 'A';
		String 용모1 = "하";
		System.out.println("************************************************************************************************");
		System.out.println("회원번호  	이름 	   주민번호	  성별	   결혼횟수	     흡연여부	   키	  학점	   용모");
		System.out.println("************************************************************************************************");
		System.out.println(회원번호1+"	       "+name1+"     "+주민번호1+"      "+gender1+"           "+결혼횟수1+"          "+흡연여부1+"       "+height1+"      "+grade1+"       "+용모1);
		
	}

}
