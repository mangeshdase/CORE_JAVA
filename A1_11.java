import java.util.Scanner;
class A1_11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of x = ");
int x = sc.nextInt();
System.out.println("Enter the value of y = ");
int y = sc.nextInt();
System.out.println("Value of x = "+x+ " Value of y = "+y);
x = x+y;
y = x-y;
x = x-y;
System.out.println("Value of x = "+x+ " Value of y = "+y);
}
}