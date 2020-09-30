import java.util.Scanner;
class A1_20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for range: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		for(int i = num1 ; i<= num2 ;i++){
			int flag = 0;
			for(int j=2 ; j<=i/2; j++){
				if(i%j == 0){
					flag = 1;
					break;
				}
				else{
					continue;
				}
			}
			if(flag == 0){
					System.out.println(i);
			}
		}
	}
}