package day3;

public class ArithmaticOperation {

	public void add(int a, int b) {
		System.out.println("Addition is " + (a + b));
	}

	public void subtract(int a, int b) {
		System.out.println("Subtraction is " + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication is " + (a * b));
	}

	public void division(int a, int b) throws Exception {
		System.out.println("Division is " + (a / b));
	}
}