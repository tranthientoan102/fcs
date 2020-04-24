public class ShakingPartyConstrainted2 extends ShakingPartyConstrainted {

	/**
	 * basic constructor
	 */
	ShakingPartyConstrainted2() {
		super();
	}

	/**
	 * constructor with specify amount of people
	 */
	ShakingPartyConstrainted2(int nTmp) {
		super(nTmp);
	}

	@Override
	public int countMechanic() {
		return (super.countMechanic() + getCurrentState());
	}
}
