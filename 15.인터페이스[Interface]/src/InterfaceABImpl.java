
public class InterfaceABImpl extends Object implements InterfaceA,InterfaceB{


	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceA.method1() 구현[재정의]");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceA.method2() 구현[재정의]");
	}
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceB.method3() 구현[재정의]");
	}
	
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceB.method4() 구현[재정의]");
	}

}
