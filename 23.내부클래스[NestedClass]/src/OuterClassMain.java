class OuterClass{
	public int outer_member_field = 8888;
	
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	public void outer_inner_class_use() {
		InnerClass ic = this.new InnerClass();
		ic.inner_member_field=9090;
		ic.inner_member_method();
	}
	
	public class InnerClass{
		public int inner_member_field=3333;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		public void inner_outer_member_access() {
			outer_member_field=2321321;
			outer_member_method();
			
		}
	}
	
	
}
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.outer_member_field=2345;
		outerClass.outer_member_method();
		System.out.println(outerClass);
		OuterClass.InnerClass innerclass = outerClass.new InnerClass();
		System.out.println(innerclass);
		
		
		
		
		
		
		
		
		
	}

}
