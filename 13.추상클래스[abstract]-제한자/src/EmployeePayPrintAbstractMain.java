
public class EmployeePayPrintAbstractMain {

	public static void main(String[] args) {
		Employee e1 = new SalaryEmployee(1,"KIM",5000000);
		Employee e2 = new HourlyEmployee(2,"SIM",100,15000);
		
		Employee[] employees= {
				new SalaryEmployee(1,"김미진",500000000),
				new SalaryEmployee(2,"김민섭",100000000),
				new SalaryEmployee(3,"김수환",1200000000),
				new HourlyEmployee(4,"최인호",100,20000),
				new HourlyEmployee(5,"최기창",200,30000)
		};
		
		for (Employee employee : employees) {
			employee.calculatePay();
			System.out.println("--------"+employee.getName()+"님 급여명세표");
			employee.print();
			System.out.println("-----------------------------");
			System.out.println();
		}
		
		
	}

}
