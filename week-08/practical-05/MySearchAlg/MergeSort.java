package MySearchAlg;

public class MergeSort {

	public Comparable[] sort(Comparable[] input) {

		if (input.length <= 1) {
			return input;
		}

		int firstLength = input.length / 2;
		int secondLength = input.length - firstLength;
		Comparable[] firstHalf = new Comparable[firstLength];
		Comparable[] secondHalf = new Comparable[secondLength];

		System.arraycopy(input, 0, firstHalf, 0, firstLength);
		System.arraycopy(input, firstLength, secondHalf, 0, secondLength);

		//		System.out.println("1st half = " + Arrays.toString(firstHalf));
		//		System.out.println("2nd half = " + Arrays.toString(secondHalf));

		firstHalf = sort(firstHalf);
		secondHalf = sort(secondHalf);

		return merge(firstHalf, secondHalf);

	}

	//	private void sortRecursion(Comparable[] input ) {
	//		int firstLength = input.length/2;
	//		int secondLength = input.length - firstLength;
	//		Comparable[] firstHalf = new Comparable[firstLength];
	//		Comparable[] secondHalf = new Comparable[secondLength];
	//
	//		System.arraycopy(input, 0, firstHalf, 0, firstLength);
	//		System.arraycopy(input, firstLength, secondHalf, 0, secondLength);
	//
	//		sortRecursion(firstHalf);
	//		sortRecursion(secondHalf);
	//		merge(firstHalf, secondHalf, input);
	//
	//	}

	private Comparable[] merge(Comparable[] firstHalf, Comparable[] secondHalf) {
		int firstIndex = 0, secondIndex = 0, resultIndex = 0;
		Comparable[] result = new Comparable[firstHalf.length + secondHalf.length];

		while ((firstIndex < firstHalf.length) && (secondIndex < secondHalf.length)) {
			if (firstHalf[firstIndex].compareTo(secondHalf[secondIndex]) <= 0) {
				result[resultIndex++] = firstHalf[firstIndex++];
			} else {
				result[resultIndex++] = secondHalf[secondIndex++];
			}
		}
		if (firstIndex == firstHalf.length) {
			System.arraycopy(secondHalf, secondIndex, result, resultIndex,
					 secondHalf.length - secondIndex);
		} else {
			System.arraycopy(firstHalf, firstIndex, result, resultIndex,
					 firstHalf.length - firstIndex);
		}
		//		System.out.println("returning: "+ Arrays.toString(result));
		return result;
	}

}
