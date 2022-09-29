package Assignment2;
public class Person {
	String firstName;
	String lastName;
	int age;

	public static void main(String[] args) {
		Person saurav = new Person();
		Person atharva = new Person();

		
		saurav.firstName = "Saurav";
		saurav.lastName = "Patil";
		saurav.age = 22;
		

		atharva.firstName = "Atharva";
		atharva.lastName = "Thakur";
		atharva.age = 21;

		System.out.println("FirstName -> " + saurav.firstName);
		System.out.println("LastName -> " + saurav.lastName);
		System.out.println("Age -> " + saurav.age);

		System.out.println("---------------------------------");

		System.out.println("FirstName -> " + atharva.firstName);
		System.out.println("LastName -> " + atharva.lastName);
		System.out.println("Age -> " + atharva.age);

	}
}
