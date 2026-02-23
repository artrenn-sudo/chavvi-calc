package chavvidemo.example;

import java.util.Scanner;

/**
 * Chavvi Calc - Menu Implementation
 *
 */
public class ChavviCalcApp {

	// Global variables:
	private static float valA = 0.0f;
	private static float valB = 0.0f;
	private static final String BREAK = "------------------------------------------------";
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Chavvi's Calculator:");
		printMenu(); // call menu function

		// main loop
		boolean running = true;
		while (running) {

			// read input
			System.out.print("\nEnter command: ");
			String command = scanner.nextLine().trim().toLowerCase();

			switch (command) {
				case "q":
					System.out.println("Quit ChavviCalc!");
					running = false; // Stop the loop
					break;

				case "h":
					printMenu(); // print menu on demand
					break;

				case "a":
					valA = getFloatInput("Enter a number for A: ");
					valA = (float) (Math.floor(valA * 1000) / 1000);
					System.out.printf("A = %.3f%n", valA);
					break;

				case "b":
					valB = getFloatInput("Enter a number for B: ");
					valB = (float) (Math.floor(valB * 1000) / 1000);
					System.out.printf("B = %.3f%n", valB);
					break;

				case "c":
					valA = 0.0f;
					valB = 0.0f;
					System.out.printf("Values cleared: A = %.3f  B = %.3f%n", valA, valB);
					break;

				case "+":
					float sum = valA + valB;
					System.out.printf("%.3f + %.3f = %.3f%n", valA, valB, sum);
					break;

				case "-":
					float diff = valA - valB;
					System.out.printf("%.3f - %.3f = %.3f%n", valA, valB, diff);
					break;

				case "*":
					float prod = valA * valB;
					System.out.printf("%.3f * %.3f = %.3f%n", valA, valB, prod);
					break;

				case "/":
					if (valB == 0) {
						System.out.println("Error: Division by zero.");
					} else {
						float quot = valA / valB;
						System.out.printf("%.3f / %.3f = %.3f%n", valA, valB, quot);
					}
					break;

				default:
					System.out.println("Unknown command: " + command + ". Try again.");
					break;
			}
		}
	}

	/**
	 * Print menu UI
	 * Show current values of A and B and format to 3 decimals
	 */
	private static void printMenu() {
		System.out.println(BREAK);
		System.out.printf("A = %.3f    B = %.3f%n", valA, valB);
		System.out.println(BREAK);
		System.out.println("a : Enter a number for A");
		System.out.println("b : Enter a number for B");
		System.out.println("+ : Add");
		System.out.println("- : Subtract");
		System.out.println("* : Multiply");
		System.out.println("/ : Divide");
		System.out.println("c : Clear A and B");
		System.out.println("q : Quit");
		System.out.println("h : Home");
	}

	/**
	 * Helper to get number from user
	 */
	private static float getFloatInput(String prompt) {
		float value = 0.0f;
		boolean valid = false;

		while (!valid) {
			System.out.print(prompt);
			String input = scanner.nextLine().trim().toLowerCase();

			if (input.equals("pi")) {
				value = (float) Math.PI;
				valid = true;
			} else if (input.equals("e")) {
				value = (float) Math.E;
				valid = true;
			} else {
				try {
					value = Float.parseFloat(input);
					valid = true;
				} catch (NumberFormatException ex) {
					System.out.println("Error: Invalid number. (Tip: you can type 'pi' or 'e')");
				}
			}
		}
		return value;
	}
}
