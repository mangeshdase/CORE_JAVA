import java.util.Scanner;
class A1_24{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter elements in array: ");
	for(int i=0;i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	System.out.print("Enter the element to search:");
	int ele = sc.nextInt();
	int flag =0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==ele){
			System.out.print("Element is found:"+arr[i]);
			flag =1;
			break;
		}
		else{
		continue;
		}
	}
	if(flag ==0){
		System.out.print("Element is not present in list");
	}
	}
}