
public class IfTest1 {

	public static void main(String[] args) {
		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = false;
		if(condition) {
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
			/*
			 * condition 변수의 값이 true일때 실행되는 코드블록(if블록)
			 */
		}
		
		
		System.out.println("stmt5");
		if(condition) {
			System.out.println("stmt6");
			System.out.println("stmt7");
			
		}else {
			/*
			 * condition 변수의 값이 false일때 실행되는 코드블록(else블록)
			 */
			System.out.println("stmt8");
			System.out.println("stmt9");
		}
		System.out.println("stmt10");
		if(condition)
			System.out.println("stmt11");
		System.out.println("stmt12");
		
		if(condition)
			System.out.println("stmt13");
		else
			System.out.println("stmt14");
		System.out.println("stmt15");
		System.out.println("main block end");
		
		/*
		 * return
		 * 	- 현재 return문을 실행하는 실행흐름을 만들어서 호출한 곳으로 반환
		 *	- JVM으로 반환
		 * 	- 생략가능
		 */
		return;
		
	}
	
}
 