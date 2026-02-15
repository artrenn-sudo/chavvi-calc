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

		// main loop
		boolean running = true;
		while (running) {
			printMenu(); // call menu function
			if (command.equals("q")) {
				System.out.println("Quit ChavviCalc!");
				running = false; // Stop the loop (Dừng vòng lặp)
			}
			String command = scanner.nextLine().trim();
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
}
