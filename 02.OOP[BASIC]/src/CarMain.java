
public class CarMain {

	public static void main(String[] args) {
		/*
		 * 1.차량번호 1234번 차량 12시입차
		 */
		
		Car car1;
		//차 객체의 데이터를 저장할 수 있는 Car클래스타입의 변수 선언
		car1 = new Car();
		//car 클래스를 이용해서 차 객체를 생성한 후 차 객체 데이타가  car1변수에 대입
		

		car1.no = "1234";
		//차객체(car1)의 멤버필드 no에 "1234"값을 대입
		car1.inTime=12;
		//차객체(car1)의 멤버필드 inTime에 12값대입
	
		/*
		 * 2.car1 객체 16시 출차
		   2-1.출차시간 대입
		 */
		
		car1.outTime=16;
		//차객체(car1)의 멤버필드 outTime에 16을 대입
		/*
		 * 2-2.요금계산
		 */
		car1.fee = (car1.outTime-car1.inTime)*1000;
		//차객체(car1)의 멤버필드 fee에 차객체(car1)의
		//outTime,inTime멤버필드를 사용해서 주차요금을 계산한 후 대입
		
		// 2-3.주차요금 영수증 출력
		System.out.printf("------------------------------------\n");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("------------------------------------\n");
		System.out.printf("%6s\t %5d\t %6d\t %8d",car1.no,car1.inTime,car1.outTime,car1.fee);
		
		
	}

}
