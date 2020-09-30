import java.util.Scanner;
class MathOperation{
	void multiply(int a, int b){
		int mul = a*b;
		System.out.println("Multiplicatiion of two Integers: "+mul);
	}
	void multiply(float a, float b, float c){
		float mul = a*b*c;
		System.out.println("Float multiplication: "+mul);
	}
	void multiply(int arr[]){
		int mul =1;
		for(int i=0;i<arr.length; i++){
			 mul = mul*arr[i];
		}
		System.out.println("Array multiplication:" +mul);
	}
	void multiply(double a, int b){
		double mul = a * b;
		System.out.println("Double INt multiplication: "+mul);
	}
}
class MathDemo{
	public static void main(String args[]){
		MathOperation m = new MathOperation();
		m.multiply(12,12);
		m.multiply(5.0f,5.0f,5.0f);
		int ar[] ={ 1,2,3,4,5,6};
		m.multiply(ar);
		m.multiply(5.35,5);
	}		
}