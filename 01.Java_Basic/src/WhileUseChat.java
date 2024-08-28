
public class WhileUseChat {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */
		/*char c1=0;
		while(c1<65535) {
			System.out.print(c1);
			c1++;
			if(c1%50==0) {
				System.out.println("");
			}
		}
		/*
		 * quiz
		 * - 영문소문자출력
		 *   a b c d e
		 *   f g h i j
		 *   k l m n o
		 *   p q r s t
		 *   u v w x y
		 *   z
		 */
		char c2 = 'a';
		//int charCount=0;
		while(c2 <= 'z') {
			System.out.print(c2+" ");
			//charCount++;
			if((c2-'a'+1)%5==0/*charCount%5==0*/) {
				System.out.println("");
			}
				c2++;
		}
			
	}

}
