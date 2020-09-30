import java.util.Scanner;
class A1_12{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print ("Enter the employee salary =  ");
int  sal = sc.nextInt();
int HRA, DA,GS;
if (sal < 10000){
HRA = (10*sal)/100;
DA = (90*sal)/100;
GS = sal  + DA + HRA;
System.out.print("HRA= "+HRA);
System.out.print("DA= "+DA);

System.out.print("Gross Salary = "+GS);
}
else{
HRA = 2000;
DA = (98*sal)/100;
GS = sal + DA + HRA;
System.out.print("Gross Salary = "+GS);
}
}
}