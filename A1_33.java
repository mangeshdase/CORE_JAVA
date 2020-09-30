class Student{
	private int rno;
	private String name;
	private static int count = 0;
	
	void setData(int rno, String name){
		this.rno = rno;
		this.name = name;
		count ++;
	}
	void showData(){
		System.out.println("RollNo.:"+rno+"  Name :"+name);
	}
	void countObject(){
		System.out.println("Object count :" +count);
	}		
}
class A1_32{
	public static void main(String args[]){
		Student s = new Student();
		s.setData(101, "Mangesh");
		s.showData();
		s.setData(101, "Mahesh");
		s.showData();
		s.countObject();
	}
}