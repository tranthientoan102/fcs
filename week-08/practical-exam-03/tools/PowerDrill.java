//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

public class PowerDrill extends PowerTool{

	/**
	 * PowerDrill's constructor
	 * @param weight: its weight
	 * @param value: its value
	 */
	public PowerDrill(float weight, float value) {
		super(weight, value, 800);
	}

	@Override
	void useTool(int usingTimes) {
		float tmp = (float) (this.value - 0.03 * usingTimes);
		this.value = (tmp <= 0) ? 0 : tmp;
		System.out.println("Zssh!");
	}
}
