
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1=new MemberMethod();
		mm1.member1=321472389;
		
		
		mm1.method();
		System.out.println("main stmt2");
		mm1.method2(2);
		System.out.println("main stmt3");
		mm1.method2(30);
		System.out.println("main stmt4");
		mm1.method3("안녕하세요", 2);
		System.out.println("main stmt5");
		mm1.method3("누구세요", 5);
		System.out.println("main stmt6");
		String name = "이효리";
		String msg = "안녕하세요";
		int count =3;
		mm1.method4(name, msg, count);
		System.out.println("main stmt7");
		mm1.method4("제임스", "멋져요", 10);
		

		return;
	}

}
