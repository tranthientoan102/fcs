import java.util.Scanner;

public class Comparison2 {

	// public Double getBigger(Double input1, Double input2){
	// 		Double result = input1;
	// 		if (input2>input1) result = input2;
	// 		return result;
	// }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Comparison comparison = new Comparison();
		Double number1, number2;
		Double result;
		String status = "";

		while (!status.equals("q")) {
			try {
				System.out.println("\n----------");
				System.out.print("Please, insert 1st number: ");
				number1 = Double.parseDouble(scanner.nextLine());
				System.out.print("Please, insert 2nd number: ");
				number2 = Double.parseDouble(scanner.nextLine());
				result = (number1.compareTo(number2) >= 0) ? number1 : number2;

				System.out.printf("The bigger number is %s;\n", result.toString());
				System.out
						.print("----------\nType 'q' for aborting, anything else for continue...");
				status = scanner.next();
			} catch (Exception e) {
				System.out.printf("Your input is not a number (%s)\n", scanner.next());
			}
		}

		System.out.println("Good day !!!\n");
	}
}
