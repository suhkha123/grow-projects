package implement.corejava.advanced;

/*Comparable interface is used when we want to compare objects using one of their property. 
 * It is considered a natural sorting of objects. Consider a list of employees and we want 
 * them to be sorted by name as a default sorting order. The comparable interface has compareTo() 
 * method which the target class has to implement.
*/
public class EmployeeComparable implements Comparable<EmployeeComparable>{
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getRollNo() {
		return empId;
	}
	public void setRollNo(int rollNo) {
		this.empId = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public EmployeeComparable(String empName, int rollNo, int age) {
		super();
		this.empName = empName;
		this.empId = rollNo;
		this.age = age;
	}
	
	String empName;
	int empId;
	int age;
	
	@Override
	public int compareTo(EmployeeComparable o) {
		// TODO Auto-generated method stub
		return empName.compareTo(o.empName);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpName()+"-"+getRollNo()+"-"+getAge();
	}
	
}
