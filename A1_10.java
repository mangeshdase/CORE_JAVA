import java.util.Scanner;
class A1_10{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the temperature in Fahrenheit:");
int f = sc.nextInt();
float C = 5*((float)f-32)/9;
System.out.print("Temperature in Celsius : "+C);
}
}