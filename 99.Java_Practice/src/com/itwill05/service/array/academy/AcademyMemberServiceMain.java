package com.itwill05.service.array.academy;

import java.util.ArrayList;

public class AcademyMemberServiceMain {

	public static void main(String[] args) throws Exception {
		AcademyMemberService ac = new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		ac.academyPrint();
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		ac.findbyNo(1);
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		ac.findbyOwner("KIM");
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		ArrayList student = ac.findStudent();
		for (Object object : student) {
			AcademyMember tempmember = (AcademyMember) object;
			tempmember.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		ArrayList staff = ac.findStaff();
		for (Object object : staff) {
			AcademyMember tempmember = (AcademyMember) object;
			tempmember.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		ArrayList gangsa = ac.findGangsa();
		for (Object object : gangsa) {
			AcademyMember tempmember = (AcademyMember) object;
			tempmember.print();
		}
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] javaMember = ac.findByBan();
		for (AcademyMember academyMember : javaMember) {
			academyMember.print();
		}
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] staffMember = ac.findByDepart();
		for (AcademyMember academyMember : staffMember) {
			academyMember.print();
		}
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] javaGangsa = ac.findBySubject();
		for (AcademyMember academyMember : javaGangsa) {
			academyMember.print();
		}
		System.out.println("---------------------------------------------");
		System.out.println(
				"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		
	}

}