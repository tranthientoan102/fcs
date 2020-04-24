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

	/**
	 * default values
	 */
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

	TohDiskStack[] stacks = new TohDiskStack[3];
	boolean stepPrinting = true;
	private int stepCount = 0;

	/**
	 * basic constructor
	 */
	public HanoiTower() {
		maxHeight = HanoiTower.MAXHEIGHT;
		sourceIndex = HanoiTower.SOURCEINDEX;
		destinationIndex = HanoiTower.DESTINATIONINDEX;
		setup();
	}

	/**
	 * constructor with custom maxHeight
	 */
	public HanoiTower(int dTmp) {
		maxHeight = dTmp;
		sourceIndex = HanoiTower.SOURCEINDEX;
		destinationIndex = HanoiTower.DESTINATIONINDEX;
		setup();
	}

	/**
	 * constructor with custom values
	 */
	public HanoiTower(int maxHeight, int sourceIndex, int destinationIndex) {
		System.out.printf("Initing: maxHeight = %s , sourceIndex = %s , destinationIndex =%s\n",
				 maxHeight, sourceIndex, destinationIndex);
		this.maxHeight = maxHeight;
		this.sourceIndex = sourceIndex;
		this.destinationIndex = destinationIndex;
		setup();
	}

	/**
	 * setup disks into stacks before TOH game begin
	 */
	public void setup() {
		int counter = 0;

		while (counter < 3) {
			this.stacks[counter++] = new TohDiskStack();
		}
		int currentHeight = this.maxHeight;
		while (currentHeight > 0) {
			this.stacks[this.sourceIndex].push(new TohDisk(currentHeight--));
		}
		this.show();
	}

	/**
	 * solve TOH game
	 */
	public void solve() {
		try {
			moveGroup(maxHeight, sourceIndex, destinationIndex);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("Solved in %s steps\n", stepCount);
	}

	/**
	 * move a disk from one stack to another
	 *
	 * @param from old stack index
	 * @param to   new stack index
	 * @throws Exception when violating TOH's rule of moving disk
	 */
	private void moveOne(int from, int to) throws Exception {
		TohDisk moving = this.stacks[from].pop();
		System.out.printf("Move disk %s from Pole%s to Pole%s (step %s) "
				 , moving.weight, from, to, ++stepCount);
		if (this.stacks[to].push(moving) != null) {
			System.out.println(stringSucess);
		} else {
			System.out.println(stringFail);
			throw new Exception("Fail to move disk");
		}

		if (stepPrinting) {
			// print stack info to console
			this.show();
		}

		Thread.sleep(1000);
	}

	/**
	 * find the auxiliary stack
	 *
	 * @param from old stack index
	 * @param to   new stack index
	 * @return auxiliary stack index
	 */
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

	/**
	 * move group of disks from a stack to another
	 *
	 * @param amount number of moving disks
	 * @param from   old stack index
	 * @param to     new stack index
	 * @throws Exception when violating TOH's rule of moving disk
	 */
	private void moveGroup(int amount, int from, int to) throws Exception {
		System.out.printf("Moving %s disk(s) from Pole%s to Pole%s\n", amount, from, to);
		if (from != to) {
			if (amount == 1) {
				moveOne(from, to);
			} else {
				moveGroup(amount - 1, from, findAuxiliaryStack(from, to));
				moveOne(from, to);
				moveGroup(amount - 1, findAuxiliaryStack(from, to), to);
			}
		}

	}

	/**
	 * gather stacks info
	 */
	private void show() {
		String result = "";
		String row = "";
		String tmpValue = "";
		int i = 0;
		while (i < maxHeight) {
			// access 3 stacks from the end
			row = "";
			for (TohDiskStack s : this.stacks) {
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
