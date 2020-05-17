package implement.java8.advanced;

public class Employee{
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getempType() {
		return empType;
	}
	public void setempType(String empType) {
		this.empType = empType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee(String empName, String empType, int age) {
		this.empName = empName;
		this.empType = empType;
		this.age = age;
	}
	
	String empName;
	String empType;
	int age;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpName()+"-"+getempType()+"-"+getAge();
	}

	
}
