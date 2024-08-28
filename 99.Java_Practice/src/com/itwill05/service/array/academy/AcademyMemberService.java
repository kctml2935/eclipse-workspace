package com.itwill05.service.array.academy;

import java.util.ArrayList;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void academyPrint() {
		for (int i = 0; i < members.length; i++) {
			AcademyMember academyMember = members[i];
			academyMember.print();
		}
	}
	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public void findbyNo(int no) {
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==1) {
				AcademyMember academyMember = members[i];
				academyMember.print();
				break;
			}
		}
	}
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public void findbyOwner(String name) {
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				AcademyMember academyMember = members[i];
				academyMember.print();
			}
		}
	}
	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */ 
	public ArrayList<AcademyMember> findStudent() {
		ArrayList<AcademyMember> student = new ArrayList();
		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStudent) {
				student.add(academyMember);
			}
		}
		return student;
	}
	/* 
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public ArrayList<AcademyMember> findStaff() {
		ArrayList<AcademyMember> staff = new ArrayList();
		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStaff) {
				staff.add(academyMember);
			}
		}
		return staff;
	}
	/* 
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public ArrayList<AcademyMember> findGangsa() {
		ArrayList<AcademyMember> gangsa = new ArrayList();
		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyGangsa) {
				gangsa.add(academyMember);
			}
		}
		return gangsa;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 */
	public AcademyMember[] findByBan() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStudent) {
				AcademyStudent tempstudent = (AcademyStudent)academyMember;
				if (tempstudent.getBan().equals("자바")) {
					count++;
				}
			}
		}

		
		int j = 0;
		AcademyStudent[] javaMember = new AcademyStudent[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent)members[i];
				if (tempStudent.getBan().equals("자바")) {
					javaMember[j++] = tempStudent;
				}
			}
		}
		return javaMember;
	}
	
	public AcademyMember[] findBySubject() throws Exception{
		int count = 0;
		try {
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa)academyMember;
				if (tempGangsa.getSubject().equals("자바")) {
					count++;
				}
			}
		}

		
		int j = 0;
		AcademyGangsa[] Gangsa = new AcademyGangsa[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa)members[i];
				if (tempGangsa.getSubject().equals("자바")) {
					Gangsa[j++] = tempGangsa;
				}
			}
		}
		return Gangsa;
		}
		catch(Exception e){
			System.out.println("자바반을 맡은 강사는 없습니다.");
		}
		return members;
	}
		
	public AcademyMember[] findByDepart() {
		int count = 0;
		for (AcademyMember academyMember : members) {
			if (academyMember instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff)academyMember;
				if (tempStaff.getDepart().equals("영업")) {
					count++;
				}
			}
		}

		
		int j = 0;
		AcademyStaff[] staffMember = new AcademyStaff[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff)members[i];
				if (tempStaff.getDepart().equals("영업")) {
					staffMember[j++] = tempStaff;
				}
			}
		}
		return staffMember;
		
	}
	 /* 
	  * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 */
	
	 /* 
	  * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	  */
	 

	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

}