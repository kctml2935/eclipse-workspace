import java.awt.event.ActionListener;

public class AnonymousInnerClassCreateMain {

	public static void main(String[] args) {

		Object oc = new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}
			public void test() {
				
			}
		};
		
		System.out.println(oc);
		
		ParentInterface parentInterface = new ParentInterface() {

			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
			
		};
		System.out.println(parentInterface);
		
		
		ActionListener a1;
		
	}

}
