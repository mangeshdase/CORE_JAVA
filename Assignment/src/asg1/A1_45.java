package asg1;

import java.util.Scanner;

class Student{
	int rollno;
	int percentage;
	
	Student(int rollno, int percentage){
		this.rollno = rollno;
		this.percentage = percentage;
	}
	
	void show() {
		System.out.println("rollno :"+rollno);
		System.out.println("percentage");
	}
}

class CollegeStudent extends Student{
	int semester;
	CollegeStudent(int rollno, int percentage, int semester){
		super(rollno, percentage);
		this.semester = semester;
	}
	void show() {
		super.show();
		System.out.println("Semester :"+semester);
	}
}
class SchoolStudent extends Student{
	String className;
	SchoolStudent(int rollno, int percentage, String className){
		super(rollno, percentage);
		this.className = className;
		// TODO Auto-generated constructor stub
	}
	void show() {
		super.show();
		System.out.println("Class Name :"+className);
	}
	
}
public class A1_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeStudent arrCollegeStudent[] = new CollegeStudent[2];
		SchoolStudent arrSchoolStudent[] = new SchoolStudent[3];
		
		int gradeCollegeStudent = 0;
		int gradeSchoolStudent = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arrCollegeStudent.length; i++) {
			System.out.println("Enter the rollno off college student : ");
			int rollno =sc.nextInt();
			System.out.println("Enter the percentage of college student :");
			int percentage = sc.nextInt();
			System.out.println("Enter the semester of college student :");
			int semester = sc.nextInt();
			
			CollegeStudent cs = new CollegeStudent(rollno, percentage, semester);
			arrCollegeStudent[i] = cs;
			
			if(percentage >= 75)gradeSchoolStudent++;
		}
		for(int j=0; j<arrSchoolStudent.length; j++) {
			System.out.println("Enter the Roll no. of school student ;");
			int rollno = sc.nextInt();
			System.out.println("Enter the percentage of school student :");
			int percentage = sc.nextInt();
			System.out.println("Enter the class name of school student :");
			String className = sc.next();
			
			SchoolStudent ss = new SchoolStudent(rollno, percentage, className);
			arrSchoolStudent[j]=ss;
			if(percentage >= 75) gradeSchoolStudent++;
		}
		for(CollegeStudent p : arrCollegeStudent)p.show();
		for(SchoolStudent q : arrSchoolStudent)q.show();
		
		System.out.println("Enter the roll no for searchong: ");
		int searchRollno = sc.nextInt();
		byte flag = 1;
		for(int i=0; i<arrCollegeStudent.length ; i++){
            if(searchRollno == arrCollegeStudent[i].rollno){
                System.out.println("Student is of College Student !!");
                flag = 0;
                break;
            }
            else{
                for(int j=0 ; j< arrSchoolStudent.length ; j++){
                    if(searchRollno == arrSchoolStudent[i].rollno){
                        System.out.println("Student is of Scholl Student !!");
                        flag = 0;
                        break;
                    }
                   
                }
            }
        }
        if(flag == 1) System.out.println("Student Roll Number is Not Valid !!");
        int greadAStudent = gradeCollegeStudent+gradeSchoolStudent;
        System.out.println("Students are having A grade : "+greadAStudent);
    }


	}
