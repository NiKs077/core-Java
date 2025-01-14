package vom.java.inheritance;

public class Employee extends Worker {
	private int employeeId;
	private String hireDate;
	
	public static int employeeId_gen=1;
	public Employee(){};

	public int getEmployeeId(){
		return this.employeeId;
	}




	public Employee(String name, String birthDate, String hireDate) {
		super(name, birthDate);
		this.employeeId = Employee.employeeId_gen++ ;
		this.hireDate = hireDate;
	}

	
	@Override
	public void terminate(String endDate) {
		
		if(Integer.parseInt(endDate.substring(6))-Integer.parseInt(this.hireDate.substring(6))>2) {
		}else {
			System.out.println("Could not terminate employee early");
		}
		
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", hireDate=" + hireDate + ", endDate=" + endDate + "]";
	}

	
	}
