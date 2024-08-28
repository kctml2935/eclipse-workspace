
public class Car {
	/*
	 *  생산되는 차량객체의 수를 저장할변수
	 */
	public static int count;//차량전체생산대수
	private int no;//차량번호
	private String model;//모델번호
	private String color;//차량색상
	
	public Car(int no, String model, String color) {
		
		this.no = no;
		this.model = model;
		this.color = color;
		count++;
	}
	public static void headerPrint() {
		System.out.println("--------------");
		System.out.println("번호 모델 색상");
		System.out.println("--------------");
	}
	public void Print() {
		System.out.println(this.no+" "+this.model+" "+this.color);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	 
	
	
}
