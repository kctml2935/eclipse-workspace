/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형데이타이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false

		*/
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1, b2, b3, b4;
		boolean result;
		b1 = true;
		b2 = true;
		b3 = false;
		b4 = false;
		/*
		 * 논리합(logical or) || --> false || false 인경우에만 false를 반환
		 */
		result = b1 || b2;
		System.out.println("true  || true  -->" + result);
		result = b1 || b3;
		System.out.println("true  || false -->" + result);
		result = b3 || b1;
		System.out.println("false || true  -->" + result);
		result = b3 || b4;
		System.out.println("false || false -->" + result);
		
		/*
		 * 논리곱(logical and) && --> true || true 인경우에만 true를 반환
		 */
		result = b1 && b2;
		System.out.println("true  && true  -->" + result);
		result = b1 && b3;
		System.out.println("true  && false -->" + result);
		result = b3 && b1;
		System.out.println("false && true  -->" + result);
		result = b3 && b4;
		System.out.println("false && false -->" + result);
		
		/*
		 * 점수의 유효성체크
		 */
		int kor=78;
		int eng=90;
		
		boolean condition1 = kor >=0;
		boolean condition2 = kor <=100;
		
		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수 유효성체크 : "+isValidScore);
		
		System.out.println("A대학 국어,영어점수중에 하나라도 90점 이상이면 합격");
		boolean ispass1 = (kor >= 90) || (eng >=90);
		System.out.println("\tA대학합격여부 : "+ispass1);
		
		System.out.println("B대학 국어,영어점수모두 90점 이상이면 합격");
		boolean ispass2 = (kor >= 90) && (eng >=90);
		System.out.println("\tB대학합격여부 : "+ispass2);

		System.out.println("-------배수판별-------");
		int number=12;
		
		boolean isMultiple3 = number%3 ==0;
		System.out.println("3의 배수여부 : "+isMultiple3);
		boolean isMultiple4 = number%4 ==0;
		System.out.println("4의 배수여부 : "+isMultiple4);
		
		System.out.println("3과 4의 공통배수여부 : "+(isMultiple3 && isMultiple4));
		/*
		 * Quiz: 윤년여부판단
		 * - 4의배수(4로 나누어떨어지는 수)이면서
		 * 	 100의배수가아닌수(100으로 나누어떨어지지않는수) 이거나
		 * 	 400의배수(400으로 나누어 떨어지는수)가 윤년
		 */
		int year =1980;
		boolean isLeapYear = (year%4==0)&&(year%100!=0)||(year%400==0);
		
		System.out.println("윤년여부 : "+isLeapYear);
		/*
		 * Quiz: 한글여부판단
		 * 유니코드 한글 범위안에 있는지 판단하면 될듯
		 */
		char c = '힣';
		boolean isHangul = c >= 44032 && c <= 55203;
		System.out.println("한글여부 : "+isHangul);
		
		/*
		 *	Quiz: 아이디의첫글자는영문대문자나 소문자이여야한다.
		 *	'A'~'Z' 'a~z' 
		 */
		char idFirstLetter='A';
		boolean isValidId= (idFirstLetter >=65) && (idFirstLetter <=122);
		System.out.println("아이디의 적합성여부 : "+isValidId);
		
		
		
	}

}
