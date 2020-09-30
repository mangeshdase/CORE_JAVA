import java.util.Scanner;
class A1_30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int sum =0;
		System.out.println("Enter the elements : ");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Sum of Diagonal elements: ");
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length; j++){
				if(i==j){
				 sum = sum + arr[i][j];
				}
			}
		}
		System.out.print(sum);
	}
}