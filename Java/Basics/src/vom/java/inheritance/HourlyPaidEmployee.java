package vom.java.inheritance;

public class HourlyPaidEmployee extends Employee{
	private double hourlyPaidRate;
	public double getHourlyPaidRate() {
		return hourlyPaidRate;
		
	}
	@Override
	public double collectPay() {
		return 1000;
	}
	
	
	
}
