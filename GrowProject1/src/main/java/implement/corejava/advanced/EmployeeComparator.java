package implement.corejava.advanced;

import java.util.Comparator;

/*Comparator interface provides a compare() method to compare two objects of the same class. 
 * Here it provides the flexibility as we can create n number of comparators for each property 
 * of an object which we want to compare.
*/
public class EmployeeComparator implements Comparator<EmployeeComparator>{
	
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
	
	public EmployeeComparator(String empName, int rollNo, int age) {
		super();
		this.empName = empName;
		this.empId = rollNo;
		this.age = age;
	}
	
	String empName;
	int empId;
	int age;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpName()+"-"+getRollNo()+"-"+getAge();
	}
	@Override
	public int compare(EmployeeComparator arg0, EmployeeComparator arg1) {
			if (arg0.empId > arg1.empId)
				return 1;
			if (arg0.empId < arg1.empId)
				return -1;
			return 0;
	}
	
}
