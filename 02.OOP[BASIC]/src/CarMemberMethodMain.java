
public class CarMemberMethodMain {

	public static void main(String[] args) {
	
		// 입차시 데이타(번호,입차시간)를 대입해줄 메쏘드 호출
		
		Car car1= new Car();
		
		//car1.no="1111";
		//car1.inTime=12;
		car1.setIpChaData("1234", 12 );
		// 2.car1객체 16시출차
		// 2-1.출차시간대입
		//car1.outTime=16; 
		car1.setOutTime(16);

		// 2-2.주차요금계산
		//car1.fee=(car1.outTime-car1.inTime)*1000;
		car1.CalculateFee();
		// 2-3.주차요금영수증출력
		car1.headerPrint();
		car1.print();
		
		
	}

}
