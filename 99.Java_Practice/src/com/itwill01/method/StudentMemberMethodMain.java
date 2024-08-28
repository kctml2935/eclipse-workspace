package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();

		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.info(1, "김경호", 82, 56, 78);
		st2.info(2, "김경수", 72, 100, 76);
		st3.info(3, "김경민", 62, 76, 98);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.total();
		st2.total();
		st3.total();
		
		st1.average();
		st2.average();
		st3.average();
		
		st1.setGrade();
		st2.setGrade();
		st3.setGrade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint();
		
		st1.print();
		st2.print();
		st3.print();

	}

}
