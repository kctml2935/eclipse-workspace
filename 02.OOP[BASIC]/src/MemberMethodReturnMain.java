
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr = new MemberMethodReturn();
		int returnData1 = mmr.method1();
		System.out.println("main block --> returnData1: "+returnData1);
		boolean returnData2 = mmr.method2();
		System.out.println("main block --> returnData1: "+returnData2);
		if(mmr.method2()) {
			System.out.println("결혼했습니다");
		}else {
			System.out.println("결혼못했습니다");
			
		}
		System.out.println("main block --> mmr.add(1,2)반환데이타 : "+mmr.add(11, 22));
		String returnMessage1 = mmr.hello("김미숙");
		System.out.println("main block --> returnMessage1 : "+returnMessage1);
		System.out.println("main block --> mmr.hello(김수로)반환데이타 : "+mmr.hello("김수로"));
		mmr.hello("피오나공주");
		
		System.out.println("-----------setter 메소드 호출---------");
		mmr.setMemberField1(100);
		mmr.setMemberField2(200);
		mmr.setMemberField3(300);
		
		System.out.println("-----------setter 메소드 호출---------");
		int returnMemberField1 = mmr.getMemberField1();
		int returnMemberField2 = mmr.getMemberField2();
		int returnMemberField3 = mmr.getMemberField3();
		System.out.println(returnMemberField1);
		System.out.println(returnMemberField2);
		System.out.println(returnMemberField3);
		
	}

}
