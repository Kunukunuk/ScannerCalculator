import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		String operation = "", type = "";
		String[] operands = new String[2];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your operation symbol");
		operation = sc.next();
		
		System.out.println("Enter the type of numbers");
		type = sc.next();
		
		System.out.println("Enter your operands separated by space");
		operands[0] = sc.next();
		operands[1] = sc.next();
		
		
		Calculator c = new Calculator();
		
		switch (operation) {
			case "+":
				System.out.println("The answer is " + c.add(type, operands));
				break;
			case "-":
				System.out.println("The answer is " + c.subtract(type, operands));
				break;
			case "*":
				System.out.println("The answer is " + c.multiply(type, operands));
				break;
			case "/":
				System.out.println("The answer is " + c.divide(type, operands));
				break;
		}
		
	}

}
