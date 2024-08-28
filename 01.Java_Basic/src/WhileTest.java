
public class WhileTest {

	public static void main(String[] args) {
		System.out.println("stmt1");
		/*
		 * 논리형리터럴
		 * while(true){
		 * system.out.println("stmt2");
		 * }
		 */
		boolean isPlay = true;
		while (isPlay) {
			System.out.println("stmt2");
		}
		System.out.println("jvm return");
		return;
	}

}
