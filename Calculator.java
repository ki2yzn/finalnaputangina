public class Calculator {
	static int addition(int x, int y) {
		return x + y;
	}

	static int multiplication(int x, int y) {
		return x * y;
	}

	static int subtraction(int x, int y) {
		return x - y;
	}

	static int division(int x, int y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		System.out.println("Subtraction result: " + subtraction(5, 8));
		System.out.println("Addition result: " + addition(5, 8));
		System.out.println("Multiplication result: " + multiplication(5, 8));
		System.out.println("Division result: " + division(5, 8));
	}
}