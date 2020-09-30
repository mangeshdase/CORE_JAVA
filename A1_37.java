class Person{
String name;
int age=18;
Person(String name, int age){
	this.name=name;
	this.age=age;
}
Person(String name){
	this.name = name;
}
void display(){
	System.out.println("Name: "+name+ " Age: "+age);
}
}
class PersonDemo{
	public static void main(String args[]){
		Person obj = new Person("Mangesh",25);
		obj.display();
	}
}