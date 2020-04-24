//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Number: 04
//===================================

import java.util.Random;

public class ShakingParty implements IShaking {

	/**
	 * amount of people in the party
	 */
	private final int nPeople;
	/**
	 * number people that already done shaking hand
	 */
	private int numberPeopleDone = 0;

	/**
	 * basic constructor
	 */
	ShakingParty() {
		nPeople = (new Random()).nextInt();
	}

	/**
	 * constructor with specify amount of people
	 */
	ShakingParty(int nPeople) {
		this.nPeople = nPeople;
	}

	@Override
	public int countMechanic() {
		// the 1st person will shake hand with n-1 other people in the party
		// after this round, increase numberPeopleDone
		// the 2nd person will shake hand with n-2 other people in the party
		// and so on
		return getTotalMember() - getCurrentState() - 1;
	}

	@Override
	public int getTotalMember() {
		return nPeople;
	}

	@Override
	public int getCurrentState() {
		return numberPeopleDone;
	}

	@Override
	public void setNextState() {
		numberPeopleDone++;
	}
}
