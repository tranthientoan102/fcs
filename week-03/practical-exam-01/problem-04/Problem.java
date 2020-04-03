//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 1
//===================================

public class Problem {

	public static void main(String[] args) {

		// init array of symbol:
		//                    [0]  [1]  [2]  [3]  [4]  [5]
		String[] allSymbol = {"*", "=", "x", "o", "o", "o"};

		for (int i = 50; i >= 3; i--) {
			String symbol = "";

			// decide line symbol based on its index i
			// for example
			// if i = 5 -> i/10 = 0 -> symbol = allSymbol[0] = "*"
			// if i = 31 -> i/10 = 3 -> symbol = allSymbol[3] = "o"
			// if i = 33 -> i/10 = 3 -> special case
			// if i = 44 -> i/10 = 4 -> symbol = allSymbol[4] = "o"
			// if i = 50 -> i/10 = 5 -> symbol = allSymbol[5] = "o"
			if (i != 33) {
				symbol = allSymbol[i / 10];
			}

			// special case handling
			else {
				symbol = "3";
			}
			System.out.println(problemPrintln(i, symbol));
		}

	}

	// customize the println 
	// print a line with specified length using given symbol
	public static String problemPrintln(int length, String symbol) {
		String result = "";
		for (int i = 0; i < length; i++) {
			result += symbol;
		}
		return result;
	}

}
