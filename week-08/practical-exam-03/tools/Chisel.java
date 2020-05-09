//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

public class Chisel extends HandTool {

	/**
	 * Chisel's constructor
	 * @param weight: its weight
	 * @param value: its value
	 */
	public Chisel(float weight, float value) {
		super(weight, value, true);
	}

	@Override
	void useTool(int usingTimes) {
		float tmp = (float) (this.value - 0.02 * usingTimes);
		this.value = (tmp <= 0) ? 0 : tmp;
		System.out.println("Scrape");
	}
}
