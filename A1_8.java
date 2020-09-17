import java.util.Scanner;
class A1_8{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
	System.out.println("Enter Princilpe Amount :");
	int P = sc.nextInt();
	System.out.println("Enter Rate of Interest : ");
	int r = sc.nextInt();
	float R = (float)r/100;
	System.out.println(R);
	System.out.println("Enter Time in year:");
	float T = sc.nextFloat();
	float A = P *(1+(R*T));
	System.out.println("Simple Interest :"+A);
	}
}	