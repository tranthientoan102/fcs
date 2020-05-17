import java.util.ArrayList;
import java.util.List;

public class InsertionSort extends MySortAlg {

	List<Integer> result = new ArrayList<>();
//	List<Integer> tmpStack = new ArrayList<>();

	public int[] sort(int[] array) {
		result.clear();
		for (int item : array) {
			findPositionAndInsert(item);
		}
//		if (tmpStack.size()>0) {
//			for (int tmpRemaining : tmpStack) {
//				insertCorrectPosition(tmpRemaining);
//			}
//		}

		for (int index = array.length-1; index >= 0; index--) {
			array[index] = result.get(index);
		}


		return array;
	}

	/**
	 * find best positon i that resultSorting[i-1] <= input<= resultSorting[i]
	 * 
	 * @param input testing value
	 */
	private void findPositionAndInsert(int input) {
		int index = result.size() - 1;
		if (index == -1)
			insertPosition(0, input);
		else {
			for (; index >= 0; index--) {
				if (result.get(index) <= input) {
					insertPosition(index + 1, input);
					break;
				} else if (index == 0) {
					insertPosition(0, input);
				}
			}
		}
//		result.add(0, input);

	}
	private void insertPosition(int index, int value){
//		System.out.printf("Insert %d into index %d\n", value, index);
		result.add(index, value);
	}
}
