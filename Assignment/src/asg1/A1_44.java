package asg1;
class Faculty{
	int facultyId;
	int salary;
	void input(int facultyId){
		this.facultyId =facultyId;
	}
	void printSalary(){
		System.out.println("Salary :"+salary);
	}
}
class FullTimeFaculty extends Faculty{
	int basicSalary;
	int allowance;
	void input(int facultyId, int basicSalary, int allowance){
		super.input(facultyId);
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.salary = basicSalary + allowance;
	}
}

class PartTimeFaculty extends Faculty{
	float workingHours;
	int ratePerHours;
	void input(int facultyId, float workingHours, int ratePerHours) {
		super.input(facultyId);
		this.workingHours = workingHours;
		this.ratePerHours = ratePerHours;
		this.salary = (int)workingHours * ratePerHours;
	}
}
public class A1_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeFaculty ff = new FullTimeFaculty();
		ff.input(1,10000,2000);
		ff.printSalary();
		
		PartTimeFaculty pf = new PartTimeFaculty();
		pf.input(2, 10.34f, 50);
		pf.printSalary();
	}

}
