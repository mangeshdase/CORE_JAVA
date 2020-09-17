class  Casting{
public static void main(String args[]){
byte b= 12;
int i = b;  //up casting
System.out.print(i);
int j =  127;
byte b1 = (byte) j;  //down casting
System.out.print(b1);
}
}