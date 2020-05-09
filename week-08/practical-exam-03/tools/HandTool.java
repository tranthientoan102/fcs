//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

public abstract class HandTool extends Tool{

	/**
	 * indicate handtool's sharpness
	 * true: sharp ; false: not sharp
	 */
	boolean sharp;

	/**
	 * Handtool's constructor
	 * @param weight: tool's weight
	 * @param value: tool's value
	 * @param sharp: true: sharp ; false: not sharp
	 */
	public HandTool(float weight, float value, boolean sharp) {
		super(weight, value);
		this.sharp = sharp;

	}

	/**
	 * check whether handtool sharp or not
	 * @return true: sharp ; false: not sharp
	 */
	public boolean isSharp() {
		return sharp;
	}
}
