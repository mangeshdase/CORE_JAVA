package asg1;

import java.util.Arrays;
import java.util.Scanner;

class Product{
	int pid;
	int price;
	int quantity;
	
	
	static int a[] = new int[5];
	static int i=0;
	Product(int pid,int price,int quantity){
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	void show(){
		System.out.println("Pid : "+pid+" Price : "+price+" Quantity : "+quantity);
	}
	static void amount(int price, int quantity) {
		a[i] = price * quantity;
		i++;
	}
}
public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[5];
		int arrPrice[] = new int[5];
		for(int i=0; i<arr.length ; i++) {
			System.out.println("Enter the pid of product : ");
			int pid = sc.nextInt();
			System.out.println("Enter the price of Product :");
			int price = sc.nextInt();
			System.out.println("Enter the quantity of product : ");
			int quantity = sc.nextInt();
			
			Product p = new Product(pid,price,quantity);
			arr[i]=p;
			arrPrice[i] = arr[i].price;
			Product.amount(arr[i].price, arr[i].quantity);
		}
		
		int highestPrice = Arrays.stream(arrPrice).max().getAsInt();
		
		System.out.println("Highest Price is  "+highestPrice);
		for(int k =0 ; k<arrPrice.length; k++) {
			if(arrPrice[k] == highestPrice) {
				System.out.println("Pid of highest Price is : "+arr[k].pid);
			}
		}
		
		for(Product j : arr) {
			j.show();
		}
		for(int l=0; l<5; l++) {
			System.out.println("Total amount of "+l+ " : "+Product.a[l]);;
		}
		sc.close();
	}

}
