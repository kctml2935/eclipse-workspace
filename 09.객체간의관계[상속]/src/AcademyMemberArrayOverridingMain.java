/**
 * 
 */

public class AcademyMemberArrayOverridingMain {

	public static void main(String[] args) {
		
		
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "KIM", "JAVA"); 
		students[1] = new AcademyStudent(2, "LIM", "IOS"); 
		students[2] = new AcademyStudent(3, "SIM", "AI"); 

		gangsas[0] = new AcademyGangsa(4,"김강사","웹디자인");
		gangsas[1] = new AcademyGangsa(5,"정강사","빅데이터");
		
		staffs[0] = new AcademyStaff(6, "심팀장", "마케팅");
		staffs[1] = new AcademyStaff(7, "나대리", "회계");
		
		System.out.println("------------AcademyMember전체출력------------");
		System.out.println("---------student--------");
		for (AcademyStudent student : students) {
			student.print();
		}
		
		for(AcademyGangsa gangsa : gangsas) {
			gangsa.print();
		}
		
		for(AcademyStaff staff : staffs) {
			staff.print();
		}
		
	}

}
