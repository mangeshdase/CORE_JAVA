import java.util.Scanner;
class A1_21{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	int sum =0;
	int avg = 0;
	System.out.print("Enter elements in array: ");
	for(int i=0;i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	for(int i =0; i < arr.length; i++){
		sum += arr[i];
	}
	System.out.println("Sum = " +sum);
	avg = sum /arr.length;
	System.out.println("Average = " +avg);
}
}