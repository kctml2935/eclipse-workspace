	/*
	 리터럴(값,데이타)
		- 문자  : 김 , A , z
		- 문자열: "김경호", "JAMES" , "Student"
		- 숫자  : 1, 2 , 3 , 3.14159
		- 논리  : true,false
	
	변수의선언
     	   - 의미:JVM 에게메모리를할당해달라고 요청하는작업
	   - 형태:
	        데이타타입 이름(식별자);
	         ex> int number;


	   - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
		   - 영문이나,한글로시작
		   - 특수문자사용불가(_,$ 는 사용가능)
		   - 키워드 사용금지
	*/

public class VariableDeclare2 {
	
	public static void main(String[] args) {
	int score1=78;
	System.out.println("score1 --> "+score1);
	int score2=90;
	System.out.println("score2 --> "+score2);
	
	int _number=333;
	int $number=555;
	int 번호=444;
	
	//int 7up=67;
	
	System.out.println("_number --> "+_number);
	System.out.println("$number --> "+$number);
	System.out.println("번호 --> "+번호);
	
	int kor,eng,math;
	kor=90;
	eng=89;
	math=97;
	
	System.out.println("kor --> "+kor);
	System.out.println("eng --> "+eng);
	System.out.println("math --> "+math);
	System.out.println("점수총합은 : "+(kor+eng+math));
	
	String name;
	name="제임스건";
	System.out.println("name="+name);
	}

}
