//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Number: 04
//===================================

import java.util.Scanner;

public class TohMain {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer tmpInput;
		int initIndex = 0;
		int[] initValue = new int[]{
				 HanoiTower.MAXHEIGHT
				 , HanoiTower.SOURCEINDEX
				 , HanoiTower.DESTINATIONINDEX
		};

		tmpInput = setTowerValue(scanner, "How height is your Tower ? ", true);
		if (tmpInput != null) initValue[initIndex] = tmpInput;
		initIndex++;
		tmpInput = setTowerValue(scanner, "Which stack your Tower is located ? ", false);
		if (tmpInput != null) initValue[initIndex] = tmpInput;
		initIndex++;
		tmpInput = setTowerValue(scanner, "Which stack your Tower will be moved to ? ", false);
		if (tmpInput != null) initValue[initIndex] = tmpInput;

		HanoiTower toh = new HanoiTower(initValue[0], initValue[1], initValue[2]);

		toh.solve();
	}
	public static Integer setTowerValue(Scanner scanner, String question, boolean isHeight){
		String msg = "%sInvalid input : %s%s\n";
		Integer result = null;
		try {
			System.out.print(question);
			int in = scanner.nextInt();
			if (isHeight || (in >=0 && in <=2))
				result = in;
			else
				System.out.printf(msg, ConsoleColors.RED, in, ConsoleColors.RESET);
		} catch (Exception e) {
			// input is not a valid integer
			System.out.printf(msg, ConsoleColors.RED, scanner.nextLine(), ConsoleColors.RESET);
		}
		return result;
	}
}
