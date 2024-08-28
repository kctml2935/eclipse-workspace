package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int num1, num2;
		String name1, name2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		int tot1, tot2;
		double avg1 , avg2;
		char grade1, grade2;
		int score1, score2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		num1 = 1; num2 = 2;
		name1 = "김경호"; name2 = "김경수";
		kor1 = 42; kor2 = 45;
		eng1 = 56; eng2 = 53;
		math1 = 78; math2 = 76;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if ((kor1 > 100 || kor1 < 0) || (eng1 > 100 || eng1 < 0) || (math1 > 100 || math1 < 0)){
		 System.out.print("다시 입력하세요");
		 return; }
		System.out.println("유효성체크 완료");
		 
		if ((kor2 > 100 || kor2 < 0) || (eng2 > 100 || eng2 < 0) || (math2 > 100 || math2 < 0)){
		 System.out.print("다시 입력하세요");
		 return; }
		System.out.println("유효성체크 완료");
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1 + eng1 + math1;
		tot2 = kor2 + eng2 + math2;
		avg1 = (double)tot1/3;
		avg2 = (double)tot2/3;
		grade1 = 'A'; grade2 = 'A';
		score1 = 3; score2 = 2;
		
		if(avg1>=90 && avg1<=100) {
			grade1='A';
		}else if(avg1>=80 && avg1<90) {
			grade1='B';
		}else if(avg1>=70 && avg1<80) {
			grade1='C';
		}else if(avg1>=60 && avg1<70) {
			grade1='D';
		}else {
			grade1='F';	
		}
		if(avg2>=90 && avg2<=100) {
			grade2='A';
		}else if(avg2>=80 && avg2<90) {
			grade2='B';
		}else if(avg2>=70 && avg2<80) {
			grade2='C';
		}else if(avg2>=60 && avg2<70) {
			grade2='D';
		}else {
			grade2='F';	
		}
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.printf("%2d %5s %3d %4d %4d %5d %5.1f %2c %4d\n",num1,name1,kor1,eng1,math1,tot1,avg1,grade1,score1);
		System.out.printf("%2d %5s %3d %4d %4d %5d %5.1f %2c %4d\n",num2,name2,kor2,eng2,math2,tot2,avg2,grade2,score2);
		System.out.println("-----------------------------------------------");
		

	}

}
