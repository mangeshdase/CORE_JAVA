import java.util.Scanner;
class A1_23{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter elements in array: ");
	for(int i=0;i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	System.out.println("Array in reverse order : ");
	for(int i=arr.length-1; i>=0;i--){
		System.out.println(arr[i]);
	}
	}
}