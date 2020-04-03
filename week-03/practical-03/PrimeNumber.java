import java.util.Scanner;

public class PrimeNumber {

	public String[] announcement = {
			"Your input is not a number",
			"Your number is not prime",
			"Your number is prime"
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrimeNumber primeNumber = new PrimeNumber();

		while (true) {
			System.out.print("\nPlease, insert a number: ");

			try {
				Double input = scanner.nextDouble();
				int resultCode = primeNumber.check(input);
				System.out.println(primeNumber.announcement[resultCode]);
			} catch (Exception e) {
				System.out.printf("%s (%s)\n", primeNumber.announcement[0], scanner.next());
			}

			System.out.println("\nType 'q' for aborting, anything else for continue : ");
			String textFromScanner = scanner.next();
			System.out.print("textFromScanner: " + textFromScanner);
			if (textFromScanner.equals("q")) {
				break;
			} else {
				System.out.println("... back to loop\n==========");
			}
		}
		System.out.println("Good day !!!\n");
	}

	public int check(Double input) {
		// default result code: prime
		int resultCode = 2;
		if (input % 1 != 0) {
			// input is not integer, so it's not prime
			resultCode = 1;
		} else if (input == 1 || input == 2) {
			// 1 and 2 are prime numbers
			// resultCode remain unchanged
			// do nothing
		} else {
			// check for other integers
			int intInput = input.intValue();
			// scan for all number from 2 to (intInput/2 + 1)
			// if there's no i from 2 to intInput/2 + 1 make intInput%i == 0,
			// then intInput is prime
			for (int i = 2; i < (intInput / 2 + 1); i++) {
				int remaining = intInput % i;
				if (remaining == 0) {
					// input is not prime
					// set resultCode to 1
					resultCode = 1;
					break;
				}
			}
		}
		return resultCode;
	}
}
