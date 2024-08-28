
public class OperatorArithmetic {

	public static void main(String[] args) {
		/*
		int a =1;
		int b =2;
		
		int result=0;
		result = a+b;
		System.out.println("a + b는 "+result);
		result = a-b;
		System.out.println("a - b는 "+result);
		result = a*b;
		System.out.println("a * b는 "+result);
		double dresult;
		dresult = (double)a/b;
		System.out.println("a / b는 "+dresult);
		*/
		/*
		 * 나머지연산자
		 * %
		 */
		/*
		int number = 13;
		result = number % 4;
		System.out.println("result변수값이 0 이면 4의배수"+result);
		
		int year = 2024;
		result = year%4;
		System.out.println("2024 % 4 = "+result);
		result = year%100;
		System.out.println("2024 % 100 = "+result);		
		result = year%400;
		System.out.println("2024 % 400 = "+result);
		
		System.out.println("----------문자연산---------");
		char ca='A';
		char cz='Z';
		int numOfAlphabet = cz-ca;
		System.out.println("알파벳대문자수 : "+numOfAlphabet);
		int numOfHangul='힣'-'가'+1;
		System.out.println("한글 글자수 : "+numOfHangul);
		
		char hangul1='가';
		System.out.println(hangul1);
		char hangul2='가'+2;
		System.out.println(hangul2);
		*/
		int kor, eng, math;
		kor = 45;
		eng = 89;
		math = 78;
		
		int tot = kor+eng+math;
		double avg = tot/3.0;
		
		System.out.printf("%d %d %d %d %.2f \n" , kor, eng, math, tot ,avg);
		

	}

}
