//constructors are special methods that run every time you create an instance of a class
//constructor will always have the same name as the class
//they are often used to initial object variables

class Machine {

	private String name;
	private int code;

	public Machine() {
		System.out.println("COnstructor running");

		name = "Arnie";

		System.out.println(name);
	}
	// that Method ran automatically when the object below was created.

	// you usually/often want multiple constructors
	// like other methods, they just need different parameters

	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name = name;
	}

	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("third constructor is running");
	}

	//constructors can call other constructors
	//the syntax is "this(parameters, if any);"
	//it must go on the first line of a constructor
}

public class Application {
	public static void main(String[] args) {
		// this instantiation will run the first constructor above.
		Machine machine1 = new Machine();

		// this one will run the second, because we pass a variable to it
		// and it's the second constructor that accepts a string variable
		Machine machine2 = new Machine("Auntie");
		
		//this one will run third constructor
		Machine machine3 = new Machine("Bella", 34);

	}
}
