import java.util.Scanner;
class A1_28{
	public static void main(String args[]){
		String arr[] = new String [5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string element : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.next();
		}
		//arr[]= { "Mahesh", "Manoj", "Maya", "Mayuri", "Mangesh" };
		for( String a : arr)
		{
			System.out.print(" "+a+" ");
		}
	}
}