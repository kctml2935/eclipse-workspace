public class SalaryEmployee extends Employee {
	private int annualSalary;//연봉
	
	public SalaryEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public SalaryEmployee(int no, String name,  int annualSalary) {
		super(no,name);
		this.annualSalary = annualSalary;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("\t"+this.annualSalary);
	}
	@Override
	public void calculatePay() {
		this.setPay(this.annualSalary/12);
		
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
}