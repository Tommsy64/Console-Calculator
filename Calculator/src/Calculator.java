

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to Programming Club's Calculator.");
		evilConsoleCalculate();
	}
	public static void brokenAlert() {
		System.out.println("Program bugged");
		System.out.println("Terminating the program...");
		System.exit(1);
	}
	
	public static void evilConsoleCalculate() {
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
			default: System.out.println("Your input is invalid"); brokenAlert();
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
	public static float autoCalc(String input) {
		char[] equation = input.toCharArray();
		int variables = countNumbers(equation);
		int signs = countSigns(equation);
		int operators = countOperators(equation);
		String[] equationInString = new String[signs];
		if (variables > 26) {
			System.out.println("Too many numbers.");
			brokenAlert();
		}
		int counting = 0;
		int endcounting = 0;
		int declareCounting = 0;
		int declareEndcounting = 0;
		char current;
		String currentVar = "0";
		float result = 0;
		//Declaring the variables, currently a maximum of 26 numbers in the equation
		//TODO improve variable declaration
		float a = 0;
		float b = 0;
		float c = 0;
		float d = 0;
		float e = 0;
		float f = 0;
		float g = 0;
		float h = 0;
		float i = 0;
		float j = 0;
		float k = 0;
		float l = 0;
		float m = 0;
		float n = 0;
		float o = 0;
		float p = 0;
		float q = 0;
		float r = 0;
		float s = 0;
		float t = 0;
		float u = 0;
		float v = 0;
		float w = 0;
		float x = 0;
		float y = 0;
		float z = 0;
		boolean inNumber = false;
		endcounting = equation.length;
		declareEndcounting = variables;
		declareCounting = 1;
		//Set all the variables to the correct values
		//TODO make the program able to handle decimals
		//TODO make the program able to handle parenthesis
		setVars:
			while (counting != endcounting) {
				current = equation[counting];
					if (current == '0' || current == '1' || current == '2' || current == '3' || current == '4' ||
						current == '5' || current == '6' || current == '7' || current == '8' || current == '5') {
							if (inNumber == true) {
								currentVar = currentVar + current;
							} else if (inNumber == false) {
								inNumber = true;
								currentVar = Character.toString(current);
							}
					} else if (current == ' ' || current == '+' || current == '-' || current == '*' || current == '/') {
						if (declareCounting == declareEndcounting) {
							break setVars;
						} else if (declareCounting != declareEndcounting) {
							switch (declareCounting) {
								case 1: a = Float.parseFloat(currentVar);
								case 2: b = Float.parseFloat(currentVar);
								case 3: c = Float.parseFloat(currentVar);
								case 4: d = Float.parseFloat(currentVar);
								case 5: e = Float.parseFloat(currentVar);
								case 6: f = Float.parseFloat(currentVar);
								case 7: g = Float.parseFloat(currentVar);
								case 8: h = Float.parseFloat(currentVar);
								case 9: i = Float.parseFloat(currentVar);
								case 10: j = Float.parseFloat(currentVar);
								case 11: k = Float.parseFloat(currentVar);
								case 12: l = Float.parseFloat(currentVar);
								case 13: m = Float.parseFloat(currentVar);
								case 14: n = Float.parseFloat(currentVar);
								case 15: o = Float.parseFloat(currentVar);
								case 16: p = Float.parseFloat(currentVar);
								case 17: q = Float.parseFloat(currentVar);
								case 18: r = Float.parseFloat(currentVar);
								case 19: s = Float.parseFloat(currentVar);
								case 20: t = Float.parseFloat(currentVar);
								case 21: u = Float.parseFloat(currentVar);
								case 22: v = Float.parseFloat(currentVar);
								case 23: w = Float.parseFloat(currentVar);
								case 24: x = Float.parseFloat(currentVar);
								case 25: y = Float.parseFloat(currentVar);
								case 26: z = Float.parseFloat(currentVar);
							}
						}
					inNumber = false;
					currentVar = "0";
					} else {
						System.out.println("Invalid character");
						brokenAlert();
					}
				counting++;
			}
		counting = 0;
		endcounting = equation.length;
		declareCounting = 0;
		declareEndcounting = equationInString.length;
		String currentSign = null;
		int currentNumber = 1;
		int currentMaxNumber = variables;
			while (counting != endcounting) {
				switch (equation[counting]) {
					case '0': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '1': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '2': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '3': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '4': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '5': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '6': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '7': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '8': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case '9': currentNumber = (inNumber) ? currentNumber : currentNumber++; inNumber = true; currentSign = currentSign + Character.toString(equation[counting]); break;
					case ' ': inNumber = false; equationInString[declareCounting] = currentSign; declareCounting++; currentSign = null; break;
					case '+': inNumber = true; currentSign = "addition"; break;
					case '-': inNumber = true; currentSign = "subtraction"; break;
					case '*': inNumber = true; currentSign = "multiplication"; break;
					case '/': inNumber = true; currentSign = "division"; break;
					default: System.out.println("Invalid input - please only use numbers, spaces and +-*/"); brokenAlert(); break;
				}
				counting++;
			}
		if (currentMaxNumber < 0) {
			System.out.println("Proccessing error");
			brokenAlert();
		}
		return result;
	}
	public static int countNumbers(char[] input) {
		int count = 0;
		int timing = 0;
		int endtiming = input.length;
		boolean inNumber = false;
		while (timing != endtiming) {
			switch (input[timing]) {
				case '0': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '1': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '2': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '3': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '4': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '5': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '6': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '7': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '8': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case '9': count = (inNumber==false) ? count++ : count; inNumber = true; break;
				case ' ': inNumber = false; break;
				case '+': inNumber = false; break;
				case '-': inNumber = false; break;
				case '*': inNumber = false; break;
				case '/': inNumber = false; break;
				default: System.out.println("Invalid input - please only use numbers, spaces and +-*/"); brokenAlert(); break;
			}
			timing++;
		}
		return count;
	}
	
	public static int countSigns(char[] input) {
		int count = 0;
		int timing = 0;
		int endtiming = input.length;
		boolean inSign = false;
		while (timing != endtiming) {
			switch (input[timing]) {
				case '0': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '1': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '2': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '3': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '4': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '5': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '6': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '7': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '8': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '9': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '+': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '-': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '*': count = (inSign==false) ? count++ : count; inSign = true; break;
				case '/': count = (inSign==false) ? count++ : count; inSign = true; break;
				case ' ': inSign = false; break;
				default: System.out.println("Invalid input - please only use numbers, spaces and +-*/"); brokenAlert(); break;
			}
		}
		return count;
	}
	
	public static int countOperators(char[] input) {
		int count = 0;
		int timing = 0;
		int endtiming = input.length;
		boolean inOperator = false;
		while (timing != endtiming) {
			switch (input[timing]) {
			case '+': count = (inOperator==false) ? count++ : count; inOperator = true; break;
			case '-': count = (inOperator==false) ? count++ : count; inOperator = true; break;
			case '*': count = (inOperator==false) ? count++ : count; inOperator = true; break;
			case '/': count = (inOperator==false) ? count++ : count; inOperator = true; break;
			case ' ': inOperator = false; break;
			case '0': inOperator = false; break;
			case '1': inOperator = false; break;
			case '3': inOperator = false; break;
			case '4': inOperator = false; break;
			case '5': inOperator = false; break;
			case '6': inOperator = false; break;
			case '7': inOperator = false; break;
			case '8': inOperator = false; break;
			case '9': inOperator = false; break;
			default: System.out.println("Invalid input - please use only numbers, spaces and +-*/"); brokenAlert(); break;
			}
		}
		return count;
	}
	
	public static int findInStringArray(String[] input, String searchFor) {
		int counting = 0;
		int endcounting = input.length;
		search:
		while (counting != endcounting) {
			if (input[counting] == searchFor) {
				break search;
			}
		}
		if (counting == endcounting) {
			counting = -1;
		}
		return counting;
	}
	
	public static float solveByOrderOfOperations(String[] input, int operators) {
		float result = 0;
		int counting = 0;
		int endcounting = operators;
		int searchIn = 0;
		while (counting != endcounting) {
			while (searchIn != -1) {
				searchIn = findInStringArray(input, "multiplication");
				if (input[searchIn] == "multiplication") {
					if (searchIn == 0) {
						System.out.println("Processing error");
						brokenAlert();
					}
				
				}
			}
		}
		return result;
	}
}