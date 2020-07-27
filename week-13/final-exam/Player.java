//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: Final
//===================================
public class Player extends Person{

	/**
	 * store latest number of players
	 */
	private static int currentId = 1;
	private int id = 1;
	private int numWins;
	private int numPlayed;


	public Player(String name, int age,int numWins , int numPlayed) {
		super(name, age);
		this.id = currentId++;
		this.numWins = numWins;
		this.numPlayed = numPlayed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumWins() {
		return numWins;
	}


	public int getNumPlayed() {
		return numPlayed;
	}


	/**
	 * update player stats when winning a game
	 */
	public void win(){
		play();
		this.numWins += 1;
	}

	/**
	 * update player stats when lossing a game
	 */
	public void lose(){
		play();
	}

	/**
	 * update player stats when playing a game
	 */
	private void play(){
		this.numPlayed += 1;
	}

	/**
	 * calculate player's ranking
	 * @return player's ranking
	 */
	public int getRanking(){
		if (this.getNumPlayed() == 0)
			return 0;
		else return this.numPlayed * (this.numWins / this.numPlayed);
	}

	@Override
	public String toString() {
		return super.toString() + " Id: " + this.id +
						" Ranking: " + this.getRanking();
	}
}
