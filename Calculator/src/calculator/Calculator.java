package calculator;

import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to Tyocean's Calculator.");
		int num1 = 0;
		int num2 = 0;
		String input = null;
		System.out.println("Please enter the corrosponding number:");
		System.out.println("1. Addition | 2. Subtraction | 3. Multiplication | 4. Division");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter here: ");
		input = scanner.next();
		
		System.out.println("Enter first number: ");
		num1 = Integer.parseInt(scanner.next());
		System.out.println("Enter second number: ");
		num2 = Integer.parseInt(scanner.next());
		
		switch(Integer.parseInt(input)) {
		case 1: System.out.println(num1 + " plus " + num2 + " = " + add(num1, num2)); break;
		case 2: System.out.println(num1 + " minus " + num2 + " = " + subtract(num1, num2)); break;
		case 3: System.out.println(num1 + " times " + num2 + " = " + multiply(num1, num2)); break;
		case 4: System.out.println(num1 + " divided by " + num2 + " = " + divide(num1, num2)); break;
		default: System.out.println("Your input is invalid");
		}
	}
	public static int add(int first, int second) {
		return first + second;
	}
	public static int subtract(int first, int second) {
		return first - second;
	}
	public static int multiply(int first, int second) {
		return first * second;
	}
	public static int divide(int first, int second) {
		return first / second;
	}
}
