package com.itwill02.constructor;
public class StudentConstructorMain {
	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
			  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1 = new Student();
		st1.setStudentData(1,"김경호",77,99,65);
		
		Student st2 = new Student(2,"asd",46,88,33);
		Student st3 = new Student(3,"afs",97,72,63);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculateTotal();
		st2.calculateTotal();
		st3.calculateTotal();
		
		st1.calculateAvg();
		st2.calculateAvg();
		st3.calculateAvg();
		
		st1.calculateGrade();
		st2.calculateGrade();
		st3.calculateGrade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		st1.setName("dda");
		st1.print();
		System.out.println("총점 : "+st1.getTot());
		System.out.println("학점 : "+st1.getGrade());
	}
}