import java.util.Scanner;

public class Referee {

	static int id = 0;
	Scanner scanner = new Scanner(System.in);
	Player[] competitors = new Player[2];
	EnumRSP[] moves = new EnumRSP[2];
	/**
	 * if there is a human competitor, input rules will be showed
	 */
	boolean explainInput = false;
	/**
	 * 1 when 1st competitor win<br/> -1 when 2nd competitor win<br/> 0 when draw
	 */
	int matchResult = 0;

	/**
	 * set up competitors for RSP game
	 */
	public void setup() {
		System.out.println("For chosing player type,");
		System.out.println("\tType \"1\" or \"h\" or \"human\" for HUMAN");
		System.out.println("\tType \"2\" or \"c\" or \"computer\" or anything else for COMPUTER");
		do {
			competitors[id] = setUpCompetitor(id == 0 ? "1st" : "2nd", scanner);
			id++;
		} while (id < 2);
		System.out.println("\n");
		System.out.printf("[%s] %s", competitors[0].getName(), competitors[0].getWelcome());
		System.out.printf("[%s] %s", competitors[1].getName(), competitors[1].getWelcome());
		if (explainInput) {
			// explain valid inputs
			System.out.println("In case you are new,");
			System.out.println("\tType \"1\", \"r\" or \"rock\" for choosing ROCK");
			System.out.println("\tType \"2\", \"s\" or \"scissors\" for choosing SCISSORS");
			System.out.println("\tType \"3\", \"p\" or \"paper\" for choosing PAPER");
		}
	}

	/**
	 * Let competitors make moves
	 */
	public void play() {
		int i = 0;
		System.out.println("\n");
		for (Player player : competitors) {
			try {
				moves[i] = EnumRSP.valueOf(player.performMove());
				System.out.printf("%s chose %s\n", player.getName(), moves[i]);
				i++;
			} catch (Exception ex) {
				moves[i] = null;
				System.out.println("Invalid input");
			}
		}

	}

	/**
	 * check match result
	 */
	public void checkResult() {
		if (moves[0] == null && moves[1] != null) {
			matchResult = -1;
		} else if (moves[0] != null && moves[1] == null) {
			matchResult = 1;
		} else if (moves[0] == null) {
			matchResult = 0;
		} else {
			matchResult = moves[0].resultAgainst(moves[1]);
		}
	}

	/**
	 * match result announcement
	 */
	public void announce() {
		if (matchResult == 0) {
			System.out.print("This is a draw. The match will continue\n\n");
		} else {
			int winnerIndex = matchResult == 1 ? 0 : 1;
			int loserIndex = (winnerIndex + 1) % 2;
			System.out.println(competitors[winnerIndex].getName() + " win the game");
			System.out.printf("[%s] %s\n", competitors[winnerIndex].getName(),
					 competitors[winnerIndex].getWinning());
			System.out.printf("[%s] %s\n", competitors[loserIndex].getName(),
					 competitors[loserIndex].getLosing());

		}
	}

	/**
	 * initialize competitor
	 * @param index competitor index
	 * @param scanner just scanner
	 * @return a competitor
	 */
	private Player setUpCompetitor(String index, Scanner scanner) {
		Player newPlayer;
		System.out.printf("Setting up %s competitor...\n", index);
		System.out.print("Select competitor's type: ");
		switch (scanner.nextLine().toLowerCase()) {
			case "1":
			case "h":
			case "human":
				System.out.print("What is your name?  ");
				String name = scanner.nextLine();
				newPlayer = new Human(name);
				explainInput = true;
				break;
			default:
				newPlayer = new Computer();
		}
		return newPlayer;
	}
}
