
package president.korea;

import president.america.Trump;

public class YS {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS public method1()");
	}
	protected void method2() {
		System.out.println("YS protected method2()");
	}
	void method3() {
		System.out.println("YS (default) method3()");
	}
	private void method4() {
		System.out.println("YS private method4()");
	}
	
	public void access() {
		/****************YS와 같은패키지 클래스멤버(필드,메쏘드)접근*************************/
		DJ dj=new DJ();
		dj.member1=1;
		dj.member2=2;
		dj.member3=3;
		//dj.member4=4;
		dj.method1();
		dj.method2();
		dj.method3();
		//dj.method4();
		/****************YS와 다른패키지 클래스멤버(필드,메쏘드)접근*************************/
		Trump trump=new Trump();
		trump.member1=1;
		/*
		trump.member2=2;
		trump.member3=3;
		trump.member4=4;
		*/
		trump.method1();
		/*
		trump.method2();
		trump.method3();
		trump.method4();
		*/
	}
	
}
