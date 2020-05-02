package implement.abstraction.andEncapsulation;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(String employeeName, int perHourCharges) {
		super(employeeName, perHourCharges);
	}



	@Override
	public int employeeSalary() {
		return getPerHourCharges() * 8;
	}
	
	
}
