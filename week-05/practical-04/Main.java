public class Main {

	public static void main(String[] args) {

		Referee referee = new Referee();
		referee.setup();
		do {
			referee.play();
			referee.checkResult();
			referee.announce();
		} while (referee.matchResult == 0);
	}
}
