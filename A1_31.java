import java.util.Scanner;
class Student{
	private int rno;
	private String name;
	
	void setData(int rno, String name){
		this.rno = rno;
		this.name = name;
	}
	void showData(){
		System.out.println("RollNo.:"+rno+"  Name :"+name);
	}
}
class A1_31{
	public static void main(String args[]){
		Student s = new Student();
		s.setData(101, "Mangesh");
		s.showData();
	}
}