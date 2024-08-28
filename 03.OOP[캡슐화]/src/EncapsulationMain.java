
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		/*encapsulation.memberField1=1;
		encapsulation.memberField2=false;
		encapsulation.memberField3='ㅗ';
		encapsulation.memberField4=3.14159;
		*/
		encapsulation.setMemberField1(1);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(3.14159);

		/*
		System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		*/
		int returnMemberField1 = encapsulation.getMemberField1();
		System.out.println(returnMemberField1);
		System.out.println(encapsulation.getMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
		
		encapsulation.print();
		
	}

}
