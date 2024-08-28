class OverridingParent{
	public void method1() {
  		System.out.println("OverridingParent.method1()");
  	}
  	public void method2() {
  		System.out.println("OverridingParent.method2()");
  	}
}
class OverridingChild extends OverridingParent{
	/*
	public void method1() {
  		System.out.println("OverridingParent.method1()");
  	}
  	//상속받은 method2() 는 은폐되서 외부에서 호출불가능
  	public void method2() {
  		System.out.println("OverridingParent.method2()");
  	}
  	*/
	//자식에서 재정의된 method2()만 호출된다
	@Override
	public void method2() {
  		System.out.println("----재정의된 method2 start-------");
  		System.out.println("OverringParent.method2()를 OverridingChild에서 재정의");
  		super.method2();
  		/*
  		* super
  		*   - this와 같은 self참조변수이다.
  		*   - this와 같은 주소를 가리킨다.
  		*   - 재정의에의해 은폐된메쏘드 호출시사용
  		*/
  		System.out.println("OverringChild.method2() 추가작업");
  		/*
  		 * 재정의하면
  		 * 		-상속받은 method2()는 은폐되서 외부에서 호출불가능
  		 * 		-자식에서 재정의된 method2()만 호출된다.
  		 */
  		System.out.println("----재정의된 method2 end----------");
  	}
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
}


public class OverridingParentChildMain {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.method1();
		/*
		 * oc.method2()호출시에 재정의된메쏘드만호출
		 */
		oc.method2();
		oc.method3();

	}

}
