package implement.abstraction.andEncapsulation;

public class Contractor extends Employee{
	
	private int workinghours;

	public Contractor(int workinghours, String employeeName, int perHourCharges) {
		super(employeeName, perHourCharges);
		this.workinghours = workinghours;
	}



	@Override
	public int employeeSalary() {
		return getPerHourCharges() * workinghours;
	}
	
}
