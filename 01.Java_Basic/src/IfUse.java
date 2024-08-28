
public class IfUse {

	public static void main(String[] args) {
		int no1=48;
		if(no1%2==0) {
			System.out.println(no1+"은 짝수");
		}else {
			System.out.println(no1+"은 홀수");
		}
		int no2 = 565;
		if(no2%4==0) {
			System.out.printf("%d는 4의 배수\n",no2);
		}else {
			System.out.printf("%d는 4의 배수아님\n",no2);
		}
		
		int kor = -34;
		if(kor >=0 && kor<=100) {
			System.out.printf("%d는 유효한점수\n",kor);
		}else {
			System.out.printf("%d는 안유효한점수\n",kor);
		}
		
		int year = 2024;
		if((year%4==0 && year%100!=0)||year%400==0) {
			System.out.printf("%d는 윤년입니다.\n",year);
		}else {
			System.out.printf("%d는 평년입니다.\n",year);			
		}
		
		char c = '9';
		if(c>='a' && c<='z') {
			System.out.printf("%c는 알파벳 소문자입니다.\n",c);
		}
		if(c>='A' && c<='Z') {
			System.out.printf("%c는 알파벳 대문자입니다.\n",c);
		}
		if(c>='0' && c<='9') {
			System.out.printf("%c는 숫자형태의 문자입니다.\n",c);
		}
		
		char idFirstLetter='&';
		if((idFirstLetter>='A'&& idFirstLetter<='Z')||(idFirstLetter>='a'&&idFirstLetter<='z')) {
			System.out.printf("%c는 유효한 아이디문자입니다.",idFirstLetter);
		}else {
			System.out.printf("%c는 유효하지않은 아이디문자입니다.",idFirstLetter);
			
		}
	}

}
