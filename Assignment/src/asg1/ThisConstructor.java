package asg1;
class Employee{
	int empNo;
	String empName;
	Employee(){
		System.out.println("no arg Parameter");
	}
	Employee(int empNo, String empName){
		this();
		this.empNo = empNo;
		this.empName = empName;
	}
	void show() {
		System.out.println("Emp no is :"+empNo+"\nEmp Name : "+empName);
	}
}
public class ThisConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1, "Mangesh");
		e.show();

	}

}
