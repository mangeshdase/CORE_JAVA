import java.util.Scanner;
class A1_4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first value: ");
byte a = sc.nextByte();
System.out.println("Enter second value: ");
byte b = sc.nextByte();
int c = a+b;
byte d = (byte)c;
System.out.println("Sum= "+d);
}
}
