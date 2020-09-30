import java.util.Scanner;
class A1_18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2; i <= num/2;i++){
			if(num%i == 0){
				System.out.print(num+" is not prime number");
				flag =1;
				break;
			}
		}
		if(flag == 0){
			System.out.print( num+" is prime number");
		}
	}
}