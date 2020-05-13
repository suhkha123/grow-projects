package implement.corejava.advanced;

/*The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.
The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create.
If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException
The clone() method saves the extra processing task for creating the exact copy of an object. 
If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.
*/
public class EmployeeClone implements Cloneable{
	
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
	
	public EmployeeClone(String empName, int rollNo, int age) {
		super();
		this.empName = empName;
		this.empId = rollNo;
		this.age = age;
	}
	
	String empName;
	int empId;
	int age;
	
	public Object clone() throws CloneNotSupportedException{  
		return super.clone();  
		}  

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpName()+"-"+getRollNo()+"-"+getAge();
	}
	
}
