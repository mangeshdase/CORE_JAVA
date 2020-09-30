import java.util.Scanner;
class Circle{
	Scanner sc = new Scanner(System.in);
	private float radius;
	private double Area;
	
	void init(){
		System.out.println("Enter the radius:");
		radius = sc.nextFloat();
		
	}
	void calculateArea(){
		Area = 3.14 * radius * radius;
	}
	void display(){
		System.out.println("Radius = "+radius+"  Area of Circle: "+Area);
	}
}
class CircleDemo{
	public static void main(String args[]){		
	Circle c = new Circle();
	c.init();
	c.calculateArea();
	c.display();
	}
}