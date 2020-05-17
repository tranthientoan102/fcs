import java.util.ArrayDeque;

public class MergeSort extends MySortAlg {

	@Override
	int[] sort(int[] array) {
		return mergeSortRecursion(array);
	}

	private int[] mergeSortRecursion(int[] inputs) {
		if (inputs.length == 1) {
			return inputs;
		}

		int[] result = new int[inputs.length];

		int middleIndex = inputs.length / 2;
		int[] lower = new int[middleIndex];
		int[] upper = new int[inputs.length - middleIndex];
		for (int index = 0; index < inputs.length; index++) {
			if (index < middleIndex) {
				lower[index] = inputs[index];
			} else {
				upper[index - middleIndex] = inputs[index];
			}
		}
		lower = mergeSortRecursion(lower);
		upper = mergeSortRecursion(upper);

		ArrayDeque<Integer> lowerQueue = new ArrayDeque<>();
		for (int lowerElement : lower) {
			lowerQueue.add(lowerElement);
		}
		ArrayDeque<Integer> upperQueue = new ArrayDeque<>();
		for (int upperElement : upper) {
			upperQueue.add(upperElement);
		}

		ArrayDeque<Integer> mergeQueue = (ArrayDeque<Integer>) merge(lowerQueue, upperQueue);
		for (int i = 0; i < inputs.length; i++) {
			result[i] = mergeQueue.poll();
		}

		//		System.out.println("inputs: " + Arrays.toString(inputs));
		//		System.out.println("sorted: " + Arrays.toString(result));
		return result;
	}


}
