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

		// set range for loop
		int start = 101;
		int end = 89;

		// init ouput with prefix
		String output = "[";
		for (int i = start; i > end; i--) {
			// update output with repeating format
			output += i + ", ";
		}

		// update output with last number and suffix
		output += end + "]";

		System.out.println(output);
	}
}
