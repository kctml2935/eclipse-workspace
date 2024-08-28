
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("-------------c1------------");
		Car c1 = new Car();
		c1.setIpChaData("1234", 12);
		c1.setOutTime(14);
		c1.CalculateFee();
		c1.headerPrint();
		c1.print();
		System.out.println("-------------c2------------");
		Car c2 = new Car("4567",13);
		c2.setOutTime(15);
		c2.CalculateFee();
		c2.headerPrint();
		c2.print();
		System.out.println("------오늘주차장이용차량출력-------");
		Car cara = new Car("1234", 12, 13, 1000);
		Car carb = new Car("3425", 4, 5, 1000);
		Car carc = new Car("1211", 3, 6, 3000);
		Car card = new Car("4467", 14, 16, 2000);
		Car care = new Car("8980", 1, 9, 9000);
		cara.headerPrint();
		cara.print();
		carb.print();
		carc.print();
		card.print();
		care.print();
		
		
		
	}

}
