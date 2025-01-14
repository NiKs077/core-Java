package vom.java.inheritance;

public class SalariedEmployee extends Employee {
	private double annualSalary;
	private boolean isRetired;
	
	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
		super(name, birthDate, hireDate);
		this.annualSalary = annualSalary;
		this.isRetired = isRetired;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee [annualSalary=" + annualSalary + ", isRetired=" + isRetired + ", endDate=" + endDate
				+ "]";
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public boolean retire() {
		this.isRetired=true;
		this.terminate("28/12/2024");
		return isRetired;
	}

	@Override
	public double collectPay() {
		if(this.retire()) return (this.annualSalary * 0.9);
		return (this.annualSalary * 0.8) ;
	}


}
