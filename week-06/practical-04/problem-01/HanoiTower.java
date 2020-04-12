//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Number: 04
//===================================


import java.util.ArrayList;
import java.util.Arrays;

public class HanoiTower {

	public static final int MAXHEIGHT = 3;
	public static final int SOURCEINDEX = 0;
	public static final int DESTINATIONINDEX = 2;

	final ArrayList<Integer> stackIndex = new ArrayList<>(Arrays.asList(0, 1, 2));
	private final String stringSucess = ConsoleColors.GREEN + "\tSUCCESS\t" + ConsoleColors.RESET;
	private final String stringFail =
			 ConsoleColors.RED + "\tFAIL\t" + ConsoleColors.RESET;
	private final int maxHeight;
	private final int sourceIndex;
	private final int destinationIndex;
	TohBlockStack[] stacks = new TohBlockStack[3];
	boolean stepPrinting = true;
	private int stepCount = 0;

	public HanoiTower() {
		maxHeight = HanoiTower.MAXHEIGHT;
		sourceIndex = HanoiTower.SOURCEINDEX;
		destinationIndex = HanoiTower.DESTINATIONINDEX;
		setup(maxHeight);
	}

	public HanoiTower(int dTmp) {
		maxHeight = dTmp;
		sourceIndex = HanoiTower.SOURCEINDEX;
		destinationIndex = HanoiTower.DESTINATIONINDEX;
		setup(maxHeight);
	}

	public HanoiTower(int maxHeight, int sourceIndex, int destinationIndex) {
		System.out.printf("Initing: maxHeight = %s , sourceIndex = %s , destinationIndex =%s\n",
						  maxHeight, sourceIndex, destinationIndex);
		this.maxHeight = maxHeight;
		this.sourceIndex = sourceIndex;
		this.destinationIndex = destinationIndex;
		setup(maxHeight);
	}

	public void setup(int towerHeight) {
		int counter = 0;

		while (counter < 3) {
			this.stacks[counter++] = new TohBlockStack();
		}
		int currentHeight = towerHeight;
		while (currentHeight > 0) {
			this.stacks[this.sourceIndex].push(new TohDisk(currentHeight--));
		}
		this.show();
	}

	public void solve() {
		try {
			moveGroup(maxHeight, sourceIndex, destinationIndex);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("Solved in %s steps\n", stepCount);
	}

	private boolean moveOne(int from, int to) throws Exception {
		TohDisk moving = this.stacks[from].pop();
		System.out.printf("Move disk %s from stack %s to stack %s (step %s) "
				 , moving.weight, from, to, ++stepCount);
		if (this.stacks[to].push(moving) != null) {
			System.out.println(stringSucess);
		} else {
			System.out.println(stringFail);
			throw new Exception("Fail to move disk");
		}
		if (stepPrinting) {
			this.show();
		}

		Thread.sleep(1000);
		return true;
	}

	private boolean moveTwo(int from, int to) throws Exception {
		int auxiliary = findAuxiliaryStack(from, to);
		return moveOne(from, auxiliary)
						&& moveOne(from, to)
						&& moveOne(auxiliary, to);
	}

	private Integer findAuxiliaryStack(int from, int to) {
		Integer result = null;
		for (Integer i : stackIndex) {
			if (!i.equals(from) && !i.equals(to)) {
				result = i;
				break;
			}
		}
		return result;
	}

	private boolean moveGroup(int amount, int from, int to) throws Exception {
		System.out.printf("Moving %s disk(s) from Pole%s to Pole%s\n", amount, from, to);
		if (from != to) {
			if (amount == 2) {
				moveTwo(from, to);
			} else {
				moveGroup(amount - 1, from, findAuxiliaryStack(from, to));
				moveOne(from, to);
				moveGroup(amount - 1, findAuxiliaryStack(from, to), to);
			}
		}
		return true;

	}

	private void show() {
		String result = "";
		String row = "";
		String tmpValue = "";
		int i = 0;
		while (i < maxHeight) {
			// access 3 stacks from the end
			row = "";
			for (TohBlockStack s : this.stacks) {
				tmpValue = (s.size() - 1 - i >= 0) ? String.valueOf(s.get(i).weight) : "-";
				row += tmpValue + "\t";
			}
			i++;
			row += "\n";
			result = row + result;
		}
		result = ConsoleColors.CYAN + "0\t1\t2\n" + ConsoleColors.RESET + result;
		System.out.println(result);
	}


}
