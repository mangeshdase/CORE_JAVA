import java.util.Scanner;
class A1_27{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	int small, large;
	System.out.print("Enter elements in array: ");
	for(int i=0;i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	small = large = arr[0];
	for(int i=1; i<arr.length;i++){
			if(arr[i] > large){
				large = arr[i];
			}
			else if(arr[i] < small){
				small = arr[i];
			}
		}
	System.out.println("Smallest element : "+small);
	System.out.println("Greatest element : "+large);
	}
}