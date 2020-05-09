//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Number: 04
//===================================

import java.util.Random;

public class ShakingPartyConstrainted extends ShakingParty {

	/**
	 * number of  couples in the party
	 */
	private final int nCouples;
	/**
	 * number people that already done shaking hand
	 */
	private int numberCouplesDone = 0;

	/**
	 * basic constructor
	 */
	ShakingPartyConstrainted() {
		nCouples = (new Random()).nextInt();
	}

	/**
	 * constructor with specify amount of people
	 */
	ShakingPartyConstrainted(int nTmp) {
		this.nCouples = nTmp;
	}


	@Override
	public int countMechanic() {
		// handshakes with remaining couples
		return super.countMechanic() * 2;
	}

	@Override
	public int getTotalMember() {
		return nCouples;
	}

	@Override
	public int getCurrentState() {
		return numberCouplesDone;
	}

	@Override
	public void setNextState() {
		numberCouplesDone++;
	}
}
