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
			System.out.print("\nEnter command (h for menu): ");
			String command = scanner.nextLine().trim().toLowerCase();

			if (command.equals("q")) {
				System.out.println("Quit ChavviCalc!");
				running = false; // Stop the loop (Dừng vòng lặp)
			} else if (command.equals("a")) {
				valA = getFloatInput("Enter a number for A: ");
			} else if (command.equals("b")) {
				valB = getFloatInput("Enter a number for B: ");
			} else if (command.equals("c")) {
				// clear variables
				valA = 0.0f;
				valB = 0.0f;
				System.out.println("Values cleared.");
			} else if (command.equals("+")) {
				float result = valA + valB;
				System.out.printf("%.3f + %.3f = %.3f%n", valA, valB, result);
			} else if (command.equals("-")) {
				float result = valA - valB;
				System.out.printf("%.3f - %.3f = %.3f%n", valA, valB, result);
			} else if (command.equals("*")) {
				float result = valA * valB;
				System.out.printf("%.3f * %.3f = %.3f%n", valA, valB, result);
			} else if (command.equals("/")) {
				if (valB == 0) {
					System.out.println("Error: Division by zero is not allowed.");
				} else {
					float result = valA / valB;
					System.out.printf("%.3f / %.3f = %.3f%n", valA, valB, result);
				}
			} else if (command.equals("h")) {
				printMenu(); // print menu on demand
			} else {
				System.out.println("Unknown command: " + command + " Try again.");
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
		System.out.print("Enter command: ");
	}

	/**
	 * Helper to get number from user
	 */
	private static float getFloatInput(String prompt) {
		float value = 0.0f;
		boolean valid = false;

		while (!valid) {
			try {
				System.out.print(prompt);
				String input = scanner.nextLine().trim();
				value = Float.parseFloat(input);
				valid = true; // exit if parsing succeeds
			} catch (NumberFormatException e) {
				System.out.println("Error: Invalid number.");
			}
		}
		return value;
	}
}
