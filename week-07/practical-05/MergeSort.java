import java.util.ArrayDeque;

public class MergeSort {

	public Comparable[] sort(Comparable[] input) {

		// end condition
		if (input.length <= 1)
			return input;

		// divide input into 2 sub-arrays
		int firstLength = input.length / 2;
		int secondLength = input.length - firstLength;
		Comparable[] firstHalf = new Comparable[firstLength];
		Comparable[] secondHalf = new Comparable[secondLength];

		System.arraycopy(input, 0, firstHalf, 0, firstLength);
		System.arraycopy(input, firstLength, secondHalf, 0, secondLength);

		//		System.out.println("1st half = " + Arrays.toString(firstHalf));
		//		System.out.println("2nd half = " + Arrays.toString(secondHalf));

		// sort 2 sub-arrays recursively
		firstHalf = sort(firstHalf);
		secondHalf = sort(secondHalf);

		// merge and return
		return merge(firstHalf, secondHalf);

	}


	private Comparable[] merge(Comparable[] firstHalf, Comparable[] secondHalf) {
		int firstIndex = 0, secondIndex = 0, resultIndex = 0;
		Comparable[] result = new Comparable[firstHalf.length + secondHalf.length];

		// scan 2 sub arrays and take the smaller value to put into result
		while ((firstIndex < firstHalf.length) && (secondIndex < secondHalf.length)) {
			if (firstHalf[firstIndex].compareTo(secondHalf[secondIndex]) <= 0)
				result[resultIndex++] = firstHalf[firstIndex++];
			else
				result[resultIndex++] = secondHalf[secondIndex++];
		}

		if (firstIndex == firstHalf.length) {
			// all of object in first half array has been put into result
			// put remaining object of second half into result
			System.arraycopy(secondHalf, secondIndex, result, resultIndex,
					 secondHalf.length - secondIndex);
		} else {
			// all of object in second half array has been put into result
			// put remaining object of first half into result
			System.arraycopy(firstHalf, firstIndex, result, resultIndex,
					 firstHalf.length - firstIndex);
		}
		//		System.out.println("returning: "+ Arrays.toString(result));
		return result;
	}

}
