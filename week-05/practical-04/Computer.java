import java.util.Random;

public class Computer extends Player {


	Random random = new Random();


	public Computer() {
		// call Player constructor
		super(Referee.id == 0 ? "SKYNET" : "MATRIX", "COMPUTER");
		this.setWelcome(String.format("Activating %s ...\n%s is ready\n"
				 , this.getName(), this.getName()));
		this.setWinning(this.getName() + " are superiors");
		this.setLosing("Just this time ...");
	}

	@Override
	public String performMove() {
		// generate number randomly from 0 to 2
		// return enum value based on that number
		return EnumRSP.values()[random.nextInt(3)].toString();
	}
}
