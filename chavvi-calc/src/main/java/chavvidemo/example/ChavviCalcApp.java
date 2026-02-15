package chavvidemo.example;

/**
 * Chavvi Calc - Menu Implementation
 *
 */
public class ChavviCalcApp {

	// Global variables:
	private static float valA = 0.0f;
	private static float valB = 0.0f;

	public static void main(String[] args) {
		System.out.println("Chavvi's Calculator:");

		// call menu function
		printMenu();
	}

	/**
	 * Print menu UI
	 * Show current values of A and B and format to 3 decimals
	 */
	private static void printMenu() {
		System.out.println("-----------------------------------------------");
		System.out.printf("A = %.3f    B = %.3f%n", valA, valB);
		System.out.println("-----------------------------------------------");
		System.out.println("a : Enter a number for A");
		System.out.println("b : Enter a number for B");
		System.out.println("+ : Add");
		System.out.println("- : Substract");
		System.out.println("* : Multiply");
		System.out.println("/ : Divide");
		System.out.println("c : Clear A and B");
		System.out.println("q : Quit");
		System.out.print("Enter command: ");
	}
}
