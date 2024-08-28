
public class ForTest {

	public static void main(String[] args) {
		System.out.println("-----------------while-------------");
		int k = 0;
		while(k<10) {
			System.out.println("k="+k);
			k++;
		}
		
		System.out.println("---------------for-------------");
		for(int i=0; i<10;i++) {
			System.out.println("i="+i);
		}
		System.out.println("------------for i감소---------");
		for(int i=10; i>0;i--) {
			System.out.println("i="+i);
		}
		System.out.println(">>홀수만 출력[1~100]");
		for(int i=1; i<=100;i++) {
			if(i%2==1) {
				System.out.print(i+" ");				
			}
		}
		System.out.println();
		System.out.println(">>4의배수만 출력[1~100]");
		for(int i=1; i<=100;i++) {
			if(i%4==0) {
				System.out.print(i+" ");				
			}
		}
		System.out.println();
		System.out.println(">>3과4의 공통배수만 출력[1~100]");
		for(int i=1; i<=100;i++) {
			if(i%4==0 && i%3==0) {
				System.out.print(i+" ");				
			}
		}
	/*
	 * break문
	 * 	1. 반복문에서 사용
	 * 	2. break문이 실행되면 반복블럭을 빠져나온다.
	 */
		System.out.println();
		System.out.println(">>3과4의 공통배수만 출력[1~100]");
		for(int i=1; i<=100;i++) {
			if(i%4==0 && i%3==0) {
				System.out.print(i+" ");				
				if(i==72) {
					break;
				}
			}
		}
		/*
		 * continue문
		 * 	1. 반복문에서 사용
		 * 	2. continue문이후의 반복코드를 실행하지않는다.
		 * 	3. 다음회수의 반복블록을 실행한다
		 */
			System.out.println();
			System.out.println(">>4의 배수가 아닌 수만 출력[1~100](continue)");
			for(int i=1; i<=100;i++) {
				if(i%4==0) {
					/*
					 4의배수조건을 만족하면 continue문이 실행되고
					 현재실행중인 for블록의 continue문이후코드를 실행하지않고
					 다음횟수의의 블록을실행한다.  
					 */
					
					continue;
					/*
					 0.반복 블록에서만 사용가능하다.
					 1.continue문이후의  for블록코드를 실행하지 않는다.
					 2.다음반복을 계속실행한다(continue)
					 */
				}
				System.out.print(i+" ");					
			}
			System.out.println();
			System.out.println(">>홀수,짝수 합[1~100]");
			int evenTot=0;
			int oddTot=0;
			for(int i=0; i<=100;i++) {
				if(i%2==1) {
					evenTot+=i;
				}
				if(i%2==0) {
					oddTot+=i;
				}
			}
			System.out.println("짝수합 : "+oddTot);
			System.out.println("홀수합 : "+evenTot);
			
			System.out.println("---영문소문자출력[continue]---");
			
			for(char c = 'a'; c<='z';c++) {
				System.out.print(c);
				if(c=='z') {
					continue;
				}
				System.out.print(",");
				
			}
			
	
	}
	

}
