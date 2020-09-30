import java.util.Scanner;
class A1_26{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		//System.out.print("Enter the roe number: ");
		//int r = sc.nextInt();
		//int a[] = new int []
		int a[] = {1,2,3,4};
		int b[]={6,7,8,9};
		int c[] ={5,10,11,12};
		int d[] = {13,14,15,16};
		int e[] = {17};
		
		int arr[][] = new int[r][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				 sum = sum + arr[i][j];
			}
		}
		System.out.print("sum of all elements: " +sum);
	}
}