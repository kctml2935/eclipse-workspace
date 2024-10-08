public class HourlyEmployee extends Employee {
	private int worksHour;//일한시간
	private int payPerHour;//시간당급여
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public HourlyEmployee(int no, String name, int worksHour, int payPerHour) {
		super(no,name);
		this.worksHour = worksHour;
		this.payPerHour = payPerHour;
	}

	@Override
	public void calculatePay() {
		this.setPay(this.worksHour*this.payPerHour);
		
	}
	@Override
	public void print() {
		super.print();
		System.out.println(worksHour + "\t"+ payPerHour);
	}

	public int getWorksHour() {
		return worksHour;
	}

	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [worksHour=" + worksHour + ", payPerHour=" + payPerHour + "]";
	}

}
