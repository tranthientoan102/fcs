import java.util.ArrayDeque;


public class QuickSort extends MySortAlg {

	@Override
	int[] sort(int[] array) {
		return sortRecursion(array);
	}

	private int[] sortRecursion(int[] inputs) {
		if (inputs.length == 1) {
			return inputs;
		}
		if (inputs.length == 0) {
			return new int[0];
		}
		if (checkDuplicateValue(inputs)) {
			return inputs;
		}

		ArrayDeque<Integer> lowerQueue = new ArrayDeque<>();
		ArrayDeque<Integer> upperQueue = new ArrayDeque<>();

		int pivot = inputs[inputs.length - 1];
		for (int i : inputs) {
			if (i < pivot) {
				lowerQueue.add(i);
			} else if (i > pivot) {
				upperQueue.add(i);
			}
		}
		//		System.out.println(Arrays.toString(convertFromQueueToArray(lowerQueue)));
		int[] lowerSort;
		if (lowerQueue.isEmpty()) {
			lowerSort = new int[0];
		} else {
			lowerSort = sortRecursion(convertFromQueueToArray(lowerQueue));
		}
		int[] upperSort;
		if (upperQueue.isEmpty()) {
			upperSort = new int[0];
		} else {
			upperSort = sortRecursion(convertFromQueueToArray(upperQueue));
		}

		lowerQueue = (ArrayDeque<Integer>) convertFromArrayToQueue(lowerSort);
		lowerQueue.add((Integer.valueOf(pivot)));
		upperQueue = (ArrayDeque<Integer>) convertFromArrayToQueue(upperSort);
		return convertFromQueueToArray(merge(lowerQueue, upperQueue));

	}

	private boolean checkDuplicateValue(int[] input) {
		boolean result = true;
		for (int i = 1; i < input.length; i++) {
			if (input[i - 1] != input[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
