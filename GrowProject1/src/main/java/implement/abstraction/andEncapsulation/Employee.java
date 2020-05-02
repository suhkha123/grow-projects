package implement.abstraction.andEncapsulation;

public abstract class Employee 
{
	protected static String employeeName;
    protected static int perHourCharges;
    
    public Employee(String employeeName, int perHourCharges) {
		this.employeeName = employeeName;
		this.perHourCharges = perHourCharges;
	}

    public abstract int employeeSalary();
    
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getPerHourCharges() {
		return perHourCharges;
	}
	public void setPerHourCharges(int perHourCharges) {
		this.perHourCharges = perHourCharges;
	}
    
}
