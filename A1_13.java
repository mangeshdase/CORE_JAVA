import java.util.Scanner;
class A1_13{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
	System.out.print("Enter any Three Numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	/*if(a>=b && a>=c)
	{
		System.out.print(a+ " is greatest value");
	}
	else if (b>=a && b>=c)
	{
		System.out.print(b+ " is greatest value");
	}
	else
	{
		System.out.print(c+" is greatest value");
	}*/
	
	int d =(a>=b && a>=c)?a:((b>=c && b>=a)?b:c);
	System.out.print(d+ " is greatest number");
 }
}