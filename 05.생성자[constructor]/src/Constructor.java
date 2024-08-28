
public class Constructor {
	private int member1;
	private int member2;
	private String member3;
	
	//생성자 메쏘드 : 객체생성후 최초로단한번 호출되는 메소드(???)
	public Constructor() {
		System.out.println("public Constructor() 기본생성자호출:"+this);
		//생성자 메쏘드 안에서는 생성된객체의 self참조변수 this를 사용할 수 있다
		return;
	}
	/*
	 * 생성자 메쏘드 오버로딩
	 */
	public Constructor(int member1, int member2, String member3) {
		System.out.println("public Constructor(int member1, int member2, String member3)생성자호출");
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
	}
	
	public void print() {
		System.out.println("member1:"+member1);
		System.out.println("member2:"+member2);
		System.out.println("member3:"+member3);
	}

}
