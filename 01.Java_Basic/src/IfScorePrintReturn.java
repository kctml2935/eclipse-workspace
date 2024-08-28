
public class IfScorePrintReturn {

	public static void main(String[] args) {
		
		int kor = -90;
		/*
		 * 1.입력되는 점수의 유효석체크
		 * -100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (kor<0 || kor >100) {
			System.out.println(kor+"은 유효한점수가 아닙니다.");
			/*
			 * return문
			 * 	- 현재실행흐름을 JVM에 반환한다(프로그램종료)
			 */
			return;
		}
			/*
			 * 2.학점계산
			 */
		char hakjum='F';
		
		System.out.println("학점은 "+hakjum+"입니다");
			
		
		return;
	}

}
