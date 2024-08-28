/*
 출력예시
--------------학생 성적출력-------------------
학번  이름   국어 영어 수학 총점 평균 평점 석차
-----------------------------------------------
 1   김경호   42   56   78   334  34.8  A   3  
 2   김경수   45   53   76   334  34.8  A   2  
-----------------------------------------------
 */
public class StudentPrintMain {

	public static void main(String[] args) {
		int no=1 , no2=2;
		String name = "김경호", name2= "김경수";
		int kor = 42, kor2 = 45;
		int eng = 56, eng2 = 53;
		int math = 78, math2 = 76;
		int tot = 334, tot2 = 334;
		double avg = 34.8, avg2 = 34.8;
		char grade='A';
		int rank = 3, rank2 = 2;
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.printf(" %d  %5s  %3d  %3d  %3d %4d %4.1f %3c %5d\n",no,name,kor,eng,math,tot,avg,grade,rank);
		System.out.printf(" %d  %5s  %3d  %3d  %3d %4d %4.1f %3c %5d\n",no2,name2,kor2,eng2,math2,tot2,avg2,grade,rank2);
		System.out.println("-----------------------------------------------");
		

	}

}
