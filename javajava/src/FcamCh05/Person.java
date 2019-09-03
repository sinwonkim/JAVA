package FcamCh05;

public class Person {
	int age;
	String name;
	Boolean married;
	int child;
	
	public static void main(String[] args) {
		
		 Person person = new Person();
		 person.age = 40;
		 person.name = "James";
		 person.married = true;
		 person.child = 3;
		 
		 System.out.println("He is age is "+person.age+" and name is "+person.name+" and He is married is"+person.married+"and he's child is"+person.child);
		 
	}
}
