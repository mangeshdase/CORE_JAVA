import java.util.Scanner;
class A1_25{
	
	
	public static void main(String args[]){
	int oddsum =0,evensum=0 ;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter elements in array: ");
	for(int i=0;i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<arr.length; i++){
		if(arr[i] % 2 == 0 ){
			evensum += arr[i];
		}
		else{
			oddsum += arr[i];
		}
	}
	System.out.println("Even element sum : "+evensum);
	System.out.println("Odd element sum : "+oddsum);
	}
}
	