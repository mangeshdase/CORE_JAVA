class Employee{
static int empNo=0;
int salary;
static long totalSalary;
Employee(int salary){
	empNo+=1;
	this.salary=salary;
	totalSalary+=salary;
}
void display(){
	System.out.println("Total Employees="+empNo+" Total Salary : "+totalSalary);
}

}
class EmployeeDemo{
	public static void main(String args[]){
		Employee e = new Employee(10000);
		Employee e1 = new Employee(20000);
		Employee e2 = new Employee(30000);
		e2.display();
	}
}