//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

public abstract class PowerTool extends Tool{

	/**
	 * indicate how much power it have
	 */
	int power;

	/**
	 * indicate how much power it have
	 */
	public PowerTool(float weight, float value, int power) {
		super(weight, value);
		this.power = power;
	}

	/**
	 * get tool's power
	 * @return tool's power
	 */
	public int getPower() {
		return power;
	}
}
