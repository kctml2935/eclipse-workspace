

public class SwitchUse {

	public static void main(String[] args) {
		/*
		 *  짝수,홀수판별후출력
		 */
		int num=34;
		switch (num%2) {
		case 0:
			System.out.println(num+"은 짝수입니다.");
			break;

		case 1:
			System.out.println(num+"은 홀수입니다.");
			break;
		}

		/*
		 * 입력되는 문자열에 따라 게임캐릭터이동
		 */
		char direction = 's';
		switch (direction) {
		case 's':
			System.out.println("stop");
			break;
		case 'a':
			System.out.println("move left~~");
			break;
		case 'd':
			System.out.println("move right~~");
			break;
		case 'w':
			System.out.println("move up~~");
			break;
		case 'z':
			System.out.println("move down~~");
			break;
		
		default:
			System.out.println("nothing~~~");
			break;
		}
	}

}
