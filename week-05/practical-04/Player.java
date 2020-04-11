public abstract class Player {

	// help specify each of player from another
	private String name;
	private String type;
	private String welcome;
	private String winning;
	private String losing;

	public Player() {
		name = "???";
		type = "???";
		welcome = "...";
	}

	public Player(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	public String getWinning() {
		return winning;
	}

	public void setWinning(String winning) {
		this.winning = winning;
	}

	public String getLosing() {
		return losing;
	}

	public void setLosing(String losing) {
		this.losing = losing;
	}

	/**
	 * every player is able to make a move
	 *
	 * @return player's next move
	 */
	public abstract String performMove();

}


