import java.util.ArrayDeque;
import java.util.Queue;

public abstract class MySortAlg {

	abstract int[] sort(int[] array);

	public Queue<Integer> merge(Queue<Integer> lower, Queue<Integer> upper) {
		Queue<Integer> mergeResult = new ArrayDeque<>();
		while (true) {
			Integer stepMerge = popSmaller(lower, upper);
			if (stepMerge != null) {
				mergeResult.add(stepMerge);
			} else {
				break;
			}
		}
		return mergeResult;
	}

	private Integer popSmaller(Queue<Integer> queueLower, Queue<Integer> queueUpper) {
		Integer lower = queueLower.peek();
		Integer upper = queueUpper.peek();
		if (lower == null && upper == null) {
			return null;
		} else if (lower == null) {
			return queueUpper.poll();
		} else if (upper == null) {
			return queueLower.poll();
		} else {
			return (lower < upper) ? queueLower.poll() : queueUpper.poll();
		}
	}

	public Queue<Integer> convertFromArrayToQueue(int[] inputs) {
		ArrayDeque<Integer> result = new ArrayDeque<>();
		for (int i : inputs) {
			result.add(i);
		}
		return result;
	}

	public int[] convertFromQueueToArray(Queue<Integer> input) {
		if (input.isEmpty()) {
			return new int[0];
		}
		return input.stream().mapToInt(Integer::intValue).toArray();
	}
}
