//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

public abstract class Tool implements Asset {

	/**
	 * tool's weight
	 */
	float weight;

	/**
	 * tool's value
	 */
	float value;

	/**
	 * Tool's constructor
	 * @param weight: its weight
	 * @param value: its value
	 */
	public Tool(float weight, float value) {
		this.weight = weight;
		this.value = value;
	}

	/**
	 * get tool's weight
	 * @return its weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * get tool's value
	 *
	 * @return its value
	 */
	@Override
	public float getValue() {
		return value;
	}


	/**
	 * call to use a tool
	 *
	 * @param usingTimes: how many times using it
	 */
	abstract void useTool(int usingTimes);


}
