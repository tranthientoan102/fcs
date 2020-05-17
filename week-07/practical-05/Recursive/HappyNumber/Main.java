package Recursive.HappyNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	List<Integer> tracking = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your number please : ");
		int input = scanner.nextInt();
		Main happy = new Main();
		int result = happy.nextHappyNum(input);
		System.out.printf("%d ◑‿◐\n", result);

	}

	public int nextHappyNum(int input) {
		while (!checkHappyNum(++input)) {
			System.out.printf("%d T_T\n", input);
		}
		return input;
	}

	public boolean checkHappyNum(int input) {
		//		System.out.println("\nchecking " + input);
		tracking.clear();
		int result = input;

		while (true) {
			result = sumSquareDigits(result);
			//			System.out.print(result + ";");
			if (result == 1 || tracking.contains(result)) {
				break;
			} else {
				tracking.add(result);
			}
		}

		return (result == 1);
	}

	public int sumSquareDigits(int input) {
		int result = 0;
		if (input < 10) {
			result = input * input;
		} else {
			int tmpInput = input;
			while (tmpInput > 0) {
				int remaining = tmpInput % 10;
				result += remaining * remaining;
				tmpInput /= 10;
			}
		}
		return result;
	}
}
