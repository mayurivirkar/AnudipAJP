import java.util.Scanner;

interface ans {
	void m1(int a, int b);
}

public class lambda_expressions_arithmetic {

	public static void main(String[] args) {

		ans sum = (int a, int b) -> {
			System.out.println(a + "+" + b + " : " + (a + b));
		};

		ans mul = (int a, int b) -> {
			System.out.println(a + "*" + b + " : " + (a * b));
		};

		ans sub = (int a, int b) -> {
			System.out.println(a + "-" + b + " : " + (a - b));
		};

		ans div = (int a, int b) -> {
			System.out.println(a + "/" + b + " : " + (a / b));
		};

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter frist number:");
			int x = sc.nextInt();
			System.out.println("Enter second number:");
			int y = sc.nextInt();

			System.out.println("Enter the wich (+,-,*,/)operation are Profrom:");
			String ch = sc.next();

			switch (ch) {
				case "+": {
					sum.m1(x, y);
					break;

				}
				case "*": {
					mul.m1(x, y);
					break;

				}
				case "-": {
					sub.m1(x, y);
					break;

				}
				case "/": {
					div.m1(x, y);
					break;

				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed!");
		}

	}

}
