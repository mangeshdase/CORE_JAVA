package asg1;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	String name;
	int rollno;
	int age;
	int score;
	public Student(String name, int rollno, int age, int score) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
}
class Main{
	public static void main(String[] args) {
		Student arr[]=new Student[5];
		Scanner sc = new Scanner(System.in);
		int arrScore[] = new int[5];
		for(int i=0;i<arr.length; i++) {
			System.out.println("Enter the Name: ");
			String name = sc.next();
			
			System.out.println("Enter the Roll no : ");
			int rollno = sc.nextInt();
			
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			System.out.println("Enter the score :");
			int score = sc.nextInt();
			
			Student s = new Student( name, rollno, age, score);
			arr[i]= s;
			arrScore[i] = arr[i].score;
	}
		Arrays.sort(arrScore);
		for(int j=0; j<arrScore.length; j++) {
			if(arrScore[j]>=0 && arrScore[j]<=50) {
				for(int m=0; m<arr.length ; m++) {
					if(arrScore[j] == arr[m].score) {
						System.out.println("\n\n Group of 0 - 50 : Score "+arrScore[j]);
						System.out.println("Name : "+arr[m].name);
						System.out.println("Roll no :"+arr[m].rollno);
						System.out.println("Age : "+arr[m].age);
					}
				}
			}
				if(arrScore[j]>50 && arrScore[j]<=65) {
					for(int m=0; m<arr.length ; m++) {
						if(arrScore[j] == arr[m].score) {
							System.out.println("\n\n Group of 50 - 65 : Score "+arrScore[j]);
							System.out.println("Name : "+arr[m].name);
							System.out.println("Roll no :"+arr[m].rollno);
							System.out.println("Age : "+arr[m].age);
						}
					}
				}
					if(arrScore[j]>65 && arrScore[j]<=80) {
						for(int m=0; m<arr.length ; m++) {
							if(arrScore[j] == arr[m].score) {
								System.out.println("\n\n Group of 65 - 80 : Score "+arrScore[j]);
								System.out.println("Name : "+arr[m].name);
								System.out.println("Roll no :"+arr[m].rollno);
								System.out.println("Age : "+arr[m].age);
							}
						}
					}
						if(arrScore[j]>80 && arrScore[j]<=100) {
							for(int m=0; m<arr.length ; m++) {
								if(arrScore[j] == arr[m].score) {
									System.out.println("\n\n Group of 80 - 100 : Score "+arrScore[j]);
									System.out.println("Name : "+arr[m].name);
									System.out.println("Roll no :"+arr[m].rollno);
									System.out.println("Age : "+arr[m].age);
								}
							}
						}
		}
		sc.close();
	}
}