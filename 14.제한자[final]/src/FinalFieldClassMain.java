class FinalFieldClass{
	public final int PORT_NUMBER=80;
	public final double INCENTIVE_RATE;
	public static final double PI=3.14;
	public static final int EARTH_RADIUS=6400;
	public FinalFieldClass(double INCENTIVE_RATE) {
		this.INCENTIVE_RATE=INCENTIVE_RATE;
	}
	public FinalFieldClass() {
		this.INCENTIVE_RATE=0.1;
		
		/*this.PORT_NUMBER=90;
		this.INCENTIVE_RATE=0.3;
		this.PI=3.15;
		this.EARTH_RADIUS=1200;
		*/
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
	}
}
public class FinalFieldClassMain {

	public static void main(String[] args) {
		System.out.println("---------FinalFieldClass 객체1-------------");
		FinalFieldClass ffc1 = new FinalFieldClass();
		/*
		ffc1.PORT_NUMBER=9090;
		ffc1.INCENTIVE_RATE=9.0;
		ffc1.PI=3.3;
		ffc1.EARTH_RADIUS=9000;
		*/
		System.out.println(ffc1.PORT_NUMBER);
		System.out.println(ffc1.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		
		
		
		System.out.println("---------FinalFieldClass 객체2-------------");
		FinalFieldClass ffc2 = new FinalFieldClass();
		
		System.out.println(ffc2.PORT_NUMBER);
		System.out.println(ffc2.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		
	}

}
