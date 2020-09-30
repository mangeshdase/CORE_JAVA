import java.util.Scanner;
import java.lang.Math;
class MathOperation{
	
	
	static int add(int a, int b){
		return a+b;
	}
	static int subtract(int a, int b){
		return a-b;
	}
	static int multiply(int a, int b){
		return a*b;
	}
	static double power(int a, int b){
		return Math.pow(a,b);
	}
}
class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2 = sc.nextInt();
		int sum = MathOperation.add(num1,num2);
		int sub = MathOperation.subtract(num1,num2);
		int multi = MathOperation.multiply(num1,num2);
		double pow = MathOperation.power(num1,num2);
		int powe = (int)pow;
		System.out.println("Sum:"+sum+" Subtraction:"+sub+" Multiplication: "+multi+" Power:"+powe);
	}
}