import java.util.Scanner;
class A1_9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Days:");
int D = sc.nextInt();
int year, month, days;
if (D >= 365){
 year = D/365;
System.out.println("Year :"+year);
int remdays = D%365;
	if ( remdays > 30){
	 month = remdays /30;
	 days = remdays%30;
System.out.println("Month :"+month);
System.out.println("Days :"+days);

	}
	else{
	 days = remdays;
System.out.println("Days :"+days);

	}
}
else{
month = D/30;
days = D%30;
System.out.println("Year : 0");

System.out.println("Month :"+month);
System.out.println("Days :"+days);

} 
}
}