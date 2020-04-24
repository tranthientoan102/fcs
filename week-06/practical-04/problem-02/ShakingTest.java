public class ShakingTest {

	static String ANNOUNCEMENT = "Problem %s\nTotal handshakes in party of %d %s is %d\n";

	public static void main(String[] args) {

		//		Scanner scanner = new Scanner(System.in);

		for (int nTmp = 0; nTmp <= 10; nTmp++) {
			testCase(nTmp);
		}


	}

	public static void testCase(int nTmp) {
		IShaking party;

		party = new ShakingParty(nTmp);
		System.out.printf(ANNOUNCEMENT, "2", nTmp, "people", party.countHandShakes());
		party = new ShakingPartyConstrainted(nTmp);
		System.out.printf(ANNOUNCEMENT, "3 example 1", nTmp, "couples", party.countHandShakes());
		party = new ShakingPartyConstrainted2(nTmp);
		System.out.printf(ANNOUNCEMENT, "3 example 2", nTmp, "couples", party.countHandShakes());
		System.out.println();

	}

}
