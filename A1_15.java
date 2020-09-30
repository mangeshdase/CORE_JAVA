import java.util.Scanner;
class A1_15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the person's gender m or f: ");
		char gender = sc.next().charAt(0);
		System.out.print("Enter the age of person : ");
		int age = sc.nextInt();
		if (gender == 'm' && age >= 21){
			System.out.print(" Male person is eligible for marriage");
		}
		else if (gender == 'f' && age >= 18)
			System.out.print("Female person is eligible for marriage");
		else
			System.out.print("person is not eligible for marriage");
	}
}