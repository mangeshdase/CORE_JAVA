import java.util.Scanner;
class A1_14{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year to check leap year or not : ");
		int year = sc.nextInt();
		if((year%400==0)||((year%4==0) && (year%100!=0)))
			System.out.print( year+ " is leap year");
		else
			System.out.print( year+ " is not leap year");
	}
}