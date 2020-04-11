/*
			|		ROCK	|	SCISSORS	|		PAPER
	--------|---------------|---------------|------------
	ROCK	|		0		|		1		|		-1
	SCISSORS|		-1		|		0		|		1
	PAPER	|		1		|		-1		|		0
 */
public enum EnumRSP {
	// predefine values according to RSP rules
	ROCK(0, 1, -1),
	SCISSORS(-1, 0, 1),
	PAPER(1, -1, 0);

	private final int againstRock;
	private final int againstScissors;
	private final int againstPaper;

	// constructor
	EnumRSP(int againstRock, int againstScissors, int againstPaper) {
		this.againstRock = againstRock;
		this.againstScissors = againstScissors;
		this.againstPaper = againstPaper;

	}
	// just a getter
	public int againstRock() {
		return this.againstRock;
	}
	// just a getter
	public int againstScissors() {
		return this.againstScissors;
	}
	// just a getter
	public int againstPaper() {
		return this.againstPaper;
	}

	// return desirable predefine values
	public int resultAgainst(EnumRSP move) {
		int result = 0;
		switch (move) {
			case ROCK:
				result = this.againstRock();
				break;
			case SCISSORS:
				result = this.againstScissors();
				break;
			case PAPER:
				result = this.againstPaper();
				break;
		}
		return result;
	}

}
