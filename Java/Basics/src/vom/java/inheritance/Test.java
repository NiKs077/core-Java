package vom.java.inheritance;

public class Test {

	public static void main(String[] args) {
		
//		Employee employee=new Employee("Nikhil","27/01/2000","27/01/2021");
		SalariedEmployee employee=new SalariedEmployee("Nikhil", "27/01/2000", "28/12/2021",400000.0, false);
		System.out.println(employee.getAge());
		employee.retire();
		System.out.println(employee.collectPay());
		System.out.println(employee);
	}
}
