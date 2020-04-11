import java.util.Scanner;

public class Human extends Player {

	public Human(String name) {
		// call Player constructor with name = COMPUTER
		super(name, "HUMAN");
		this.setWelcome(String.format("I'm %s and I'm ready!!!\n", this.getName()));
		this.setWinning("I did it !");
		this.setLosing("Hmm, well played");

	}

	@Override
	public String performMove() {
		String result = null;
		Scanner scanner = new Scanner(System.in);

		System.out.print(this.getName() +", what's your move?  ");
		switch (scanner.nextLine().toLowerCase()) {
			// type 1 or r or rock for chosing ROCK
			case "1":
			case "r":
			case "rock":
				result = EnumRSP.ROCK.toString();
				break;

			// type 2 or s or scissors for chosing SCISSORS
			case "2":
			case "s":
			case "scissors":
				result = EnumRSP.SCISSORS.toString();
				break;

			// type 3 or p or paper for chosing PAPER
			case "3":
			case "p":
			case "paper":
				result = EnumRSP.PAPER.toString();
				break;
			default:
				// input is incorrect
				// return null
		}
		return result;
	}
}
