import java.util.Scanner;
class A1_29{
	public static void main(String args[]){
		int a[] = {1,3,4,67,78};
		int b[] = {4,45,67,87,98}; 
		int arr[][] = new int[2][];
		arr[0] = a;
		arr[1] = b;
		for(int i=0; i<arr.length; i++){
			for(int j=0;j<arr[i].length; j++){
				System.out.print(" "+arr[i][j]+" ");
			}
		}
	}
}
		