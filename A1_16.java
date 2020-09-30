import java.util.Scanner;
class A1_16{
	static public void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no: ");
		int num = sc.nextInt();
		for(int i=1; i<=num;i++){
			for(int j=1; j<=num; j++){
				System.out.print(" "+j);
			}
		System.out.println("");
		}
	}
}