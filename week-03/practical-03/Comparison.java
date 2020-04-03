import java.math.BigDecimal;
import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Comparison comparison = new Comparison();
		BigDecimal number1, number2;
		BigDecimal result;
		String status = "";
		while (!status.equals("q")) {
			try {
				System.out.println("----------");
				System.out.print("Please, insert 1st number: ");
				number1 = scanner.nextBigDecimal();
				System.out.print("Please, insert 2nd number: ");
				number2 = scanner.nextBigDecimal();
				// result = (number1.compareTo(number2)>= 0)? number1 : number2;
				System.out.printf("The bigger number is %s;\n",
						comparison.getBiggerNumber(number1, number2));
			} catch (Exception e) {
				System.out.printf("Your input is not a number (%s)\n", scanner.next());
			}

			System.out.print("----------\nType 'q' for aborting, anything else for continue...");
			status = scanner.next();
		}

		System.out.println("Good day !!!\n");
	}

	public String getBiggerNumber(BigDecimal number1, BigDecimal number2) {
		return ((number1.compareTo(number2) >= 0) ? number1 : number2).toString();
	}
}
