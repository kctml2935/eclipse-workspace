
public class variabletypes {

	public static void main(String[] args) {
		/*
		 * 숫자형
		 * 
		 * 	1.정수형변수타입(byte,short,int,long)
		 *     			int kor; 
		 *     			int eng;
		 *     			int math;
		 *     - 정수형변수: kor,eng,math 
		 *     - 정수형리터럴: 10,23,-90,2343242(int)
		 */
		int i1,i2,i3,i4,i5;
		i1=88;
		i2=99;
		i3=i1;
		i4=2147483647;
		i5=0b011111111111111111;
		System.out.println("-------int------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		long l1 = 232;
		//The literal 21474836470000 of type int is out of range
		long l2 = 2147483648l;
		System.out.println(l1);
		System.out.println(l2);
		/*
		 * 	2.실수형변수타입(float,double)
		 *     			float avg; 
		 *     			double height;
		 *     - 실수형변수: avg,height 
		 *     - 실수형리터럴: 1.23 , 78.25 , 100.0 (double)
		 */
		float f1 = 0.1f;
		System.out.println(f1);
		
		double d1,d2,d3;
		d1 = 3.14159;
		d2 = 123456781234567812345678.0;
		d3 = 1.234567812345678;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		/*
		 * 문자형(한개문자)- 2byte
		 *   char c1,c2,c3;
		 *   - 문자형변수(c1,c2,c3)
		 *   - 문자형리터럴: 'A','힣','a','1','★'
		 */
		float f2 = 12341234123l;
		
		char c1;
		c1 = 'a';
		char c2 = '가';
		char c3 = '힣';
		char c4 = '1';
		char c5 = c1;
		System.out.println("-----------char----------");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		char m1,m2,m3,m4,m5,m6,m7,m8,m9;
		m1 = 'A';
		m2 = 65;
		m3 = 0x0041;
		m4 = '\u0041';
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		m5 = '가';
		m6 = 44032;
		m7 = '\uAC00';
		m8 = 0xAC00;
		System.out.println(m5);
		System.out.println(m6);
		System.out.println(m7);
		System.out.println(m8);
		
		/*
		 *논리형
		 *  1.논리형변수타입(boolean)
		 *  	boolean b1;
		 *  	boolean b2;
		 *  	- 논리형변수 	: b1,b2
		 *  	- 논리형리터럴	: true,false
		 */
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		boolean bool4 = bool3;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		
		System.out.println("-----------문자열----------");
		String str1="오늘은";
		String str2="금요일";
		String str3="타입을 공부합니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		/*
		 * 문자열 결합연산자( + )
		 */
		String str4 = str1+" "+str2+" "+str3;
		System.out.println(str4);
		
		String name = "김찬영";
		int age = 26;
		char gender = 'M';
		double height = 163.0;
		double weight = 65.1;
		
		System.out.println("----------------------------");
		System.out.println("이름  나이  성별  키  몸무게");
		System.out.println("----------------------------");
		System.out.println(name+" "+age+"   "+gender+"   "+height+"   "+weight);
		
		
	}

}
