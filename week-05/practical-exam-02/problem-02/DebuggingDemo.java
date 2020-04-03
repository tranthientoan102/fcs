//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 02
//===================================

public class DebuggingDemo{

	public void bugMethod() {
		int[] num = {1, 2, 3, 4};
//		original exception occurred since index 5 is out of bounds
//		System.out.println(num[5]);
//		fix by using valid array index
		System.out.println(num[3]);
  }

 public int  bugMethod2() {
//		original exception occurred becuase data type mismatch: expected int, actual float
//		float ans = 0.0;
//		fix by initializing an integer
		int ans = 0;
		System.out.println("This method had a bug!");
		return ans;
  }
}
