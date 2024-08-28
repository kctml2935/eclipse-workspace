
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		//AcademyMember m1 = new AcademyMember(0,"ASd");
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "Linux");
		AcademyStudent st2 = new AcademyStudent(2, "LEE", "JAVA");
		
		AcademyGangsa gs1 = new AcademyGangsa(3, "SIM", "ANDROID");
		AcademyGangsa gs2 = new AcademyGangsa(4, "JIM", "IOS");
		
		AcademyStaff sf1 = new AcademyStaff(5, "HIM", "SALES");
		AcademyStaff sf2 = new AcademyStaff(6, "GIM", "ACCOUNT");
		
		System.out.println("--------Student---------");
		st1.print();
		st2.print();
		
		st1.print();
		System.out.println(st1.getNo());
		System.out.println(st1.getName());
		
		System.out.println("--------Gangsa---------");
		gs1.print();
		gs2.print();
		
		System.out.println("--------Staff---------");
		sf1.print();
		sf2.print();
		
	}

}
