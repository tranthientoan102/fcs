//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Number: 04
//===================================

public interface IShaking {

	/**
	 * recursively count the number of hand shakes from the 1st person to the last
	 *
	 * @return total handshakes
	 */
	default int countHandShakes() {
		if (getTotalMember() <= 1) {
			return 0;
		} else if (getCurrentState() < getTotalMember() - 1) {
			// this is not the last person
			// count for this person and for the remaining people
			return countCurrent() + countHandShakes();
		} else {
			// this is the last person
			// already shake hand with everyone else
			return countCurrent();
		}
	}

	/**
	 * count handshake based on current state
	 *
	 * @return number of handshake at current state
	 */
	default int countCurrent() {
		int tmp = countMechanic();
		//		System.out.printf("State %d: countCurrent = %d\n", getCurrentState(), tmp);
		setNextState();
		return tmp;
	}

	/**
	 * count handshakes based on specific mechanic
	 *
	 * @return number of handshakes
	 */
	int countMechanic();

	/**
	 * get total party member
	 *
	 * @return total party member
	 */
	int getTotalMember();

	/**
	 * get current state
	 *
	 * @return current state
	 */
	int getCurrentState();

	/**
	 * update to next state
	 */
	void setNextState();

}
