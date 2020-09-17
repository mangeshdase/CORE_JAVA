import java.util.Scanner;
class A1_3{
public static void main(String args[]){
int x=5;
int y = x*x + 3*x - 7;
System.out.println("y = "+y);
y = x++ + ++x;
System.out.println("x= "+x+"y= "+y);

int z = x++  - --y - --x + x++;
System.out.println("x = "+x+ "y= "+y+ "z = "+z);


Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a as true or false: ");
boolean a = sc.nextBoolean();
System.out.println("Enter the value of b true or false: ");
boolean b = sc.nextBoolean();
boolean c = a && b || !(a||b);
System.out.println("value of c:" +c);
}
}