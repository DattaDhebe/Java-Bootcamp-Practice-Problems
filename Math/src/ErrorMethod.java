

// Write a program to produce runtime error java.lang.NoSuchMethodError

public class ErrorMethod {

	public void foo() {
		System.out.println("foo");
	}
	
	public void bar() {
 		System.out.println("bar");
 	}
}
	class Temp {

	public static void main(String[] args) {

		ErrorMethod d = new ErrorMethod();
		d.foo();
		d.bar();

	}

}
