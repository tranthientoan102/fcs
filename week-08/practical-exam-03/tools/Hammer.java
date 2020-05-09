//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

public class Hammer extends HandTool {

	/**
	 * Hammer's constructor
	 * @param weight: its weight
	 * @param value: its values
	 */
	public Hammer(float weight, float value) {
		super(weight, value, false);
	}

	@Override
	void useTool(int usingTimes) {
		float tmp = (float) (this.value - 0.01 * usingTimes);
		this.value = (tmp <=0)? 0 : tmp;
		System.out.println("Bang!");
	}
}
