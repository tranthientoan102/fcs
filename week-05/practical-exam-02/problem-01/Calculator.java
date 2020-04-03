//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 02
//===================================

public class Calculator{


	public int sum(int numA, int numB){
		return numA + numB;
	}

	public int sub(int numA, int numB){
		return numA - numB;
	}

	public float multiply(float numA, float numB){
		return numA * numB;
	}

	public float division(float numA, float numB){
		if (numB == 0.0) return -99.0f;
		else return numA / numB;
	}
}
