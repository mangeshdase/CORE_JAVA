import java.util.Scanner;
class A1_6{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of circle: ");
float radius = sc.nextFloat();
double Area = 3.14 * radius * radius;
System.out.println("Area of circle : "+Area);
double cir = 2*3.14*radius;
System.out.println("Circumference of circle: "+cir);
}
}  