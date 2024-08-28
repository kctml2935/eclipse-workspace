public abstract class Employee {
	public final static double INCENTIVE_RATE=0.1; //인센티브율
	public final static int INCENTIVE_PAY= 1000000; //인센티브 페이
	
	private int no;//번호
	private String name;//이름
	private int pay;//급여
	
	public Employee() {
	}
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	/*
	 * 급여계산
	 *   - 실제구현작업 불가능 
	 *   - 자식클래스에서 반드시 재정의해야하는메쏘드
	 *   - 재정의강제(규칙,specification)
	 */
	public abstract void calculatePay();
	/*
	 * 인센티브계산(급여가100만원이 넘으면 10%인센티브 지급
	 * 		- 모든사원들의 인센티브계산법 동일
	 * 		- 재정의 금지(변경 금지) : 회장님의 방침
	 */
	public double calculateIncentive() {
		double incentive=0.0;
		if(this.pay>=INCENTIVE_PAY) {
			incentive=this.pay*INCENTIVE_RATE;
		}
		return incentive;
	}
	
	public void print() {
		System.out.print(this.no + "\t" + this.name + "\t" + this.pay);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", pay=" + pay + "]";
	}
	

}
