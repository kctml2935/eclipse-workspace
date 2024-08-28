
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 10회 반복실행
		 */
		int i=0;
		while(i<10) {
			System.out.println("stmt i-->"+i);
			i++;
		}
		System.out.println(">> 1~10 사이의 정수출력");
		i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println(">> 1~10 사이의 정수중 홀수만 출력");
		i=1;
		while(i<=10) {
			if(i%2==1) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println(">> 1~100 사이의 정수중 4의배수만 출력");
		i=1;
		while(i<=100) {
			if(i%4==0) {
				System.out.println(i);
			}
		i++;
		}
		System.out.println("[Quiz] 1900년도부터 2024년까지 윤년인연도를 출력");
		i=1900;
		while(i<=2024) {
			if((i%4==0 && i%100!=0)||i%400==0) {
				System.out.println(i);
			}
		i++;
		}
		
		System.out.println(">> 1~100사이의 정수의합[누적]");
		i=1;
		int tot=0;//누적합
		int eventot=0;//짝수합
		int oddtot=0;//홀수합
		while(i<=100) {
			tot = tot + i;
			if(i%2==0) {
				eventot+=i;
			}else {
				oddtot+=i;
			}
			i++;
		}
		System.out.println("1~100사이의 정수합 : "+tot);
		System.out.println("1~100사이의 짝수합 : "+tot);
		System.out.println("1~100사이의 홀수합 : "+tot);
	}
	
	

}
