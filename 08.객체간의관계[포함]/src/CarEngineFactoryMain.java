
public class CarEngineFactoryMain {

	public static void main(String[] args) {
		Engine x6Engine = new Engine("A",5000);
		
		Car car1 = new Car();
		car1.setNo(1234);
		car1.setModel("X6");
		car1.setEngine(x6Engine);
		car1.Print();
		
		System.out.println("----------차량엔진검사----------");
		Car gumsaCar = car1;
		Engine returnEngine = gumsaCar.getEngine();
		returnEngine.Print();
		System.out.println();
		
		Car car2 = new Car(5678,"Mustang", new Engine("N",3000));
		car2.Print();
		System.out.println("----------차량엔진검사---------");
		car2.getEngine().Print();
		
	}

}
