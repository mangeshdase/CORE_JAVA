import java.util.Scanner;
class A1_17{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		while(num !=0){
			int a = num%10;
			System.out.print(a);
			num=num/10;
		}
	}
}