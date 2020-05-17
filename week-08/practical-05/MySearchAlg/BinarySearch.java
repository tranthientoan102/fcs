package MySearchAlg;

public class BinarySearch extends MySearchAlg {

	Comparable[] array;
	Comparable ref;

	@Override
	Comparable search(Comparable[] array, Comparable ref) {
		this.array = array;
		this.ref = ref;

		long startTime = System.currentTimeMillis();
		if (!isSort(array)) {
			this.array = new MergeSort().sort(array);
		}
		System.out.println("Finish sort in " + (System.currentTimeMillis() - startTime) + " ms");
		//		System.out.println("sorted: " + Arrays.toString(this.array));
		return searchSubArray(0, array.length - 1);


	}

	public boolean isSort(Comparable[] array) {
		boolean result = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].compareTo(array[i + 1]) > 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	private Comparable searchSubArray(int lowerIndex, int upperIndex) {

		Comparable result;

		int midIndex = (lowerIndex + upperIndex) / 2;
		int compareResult = this.array[midIndex].compareTo(this.ref);

		//		System.out.printf("lowerIndex = %d ; midIndex = %d ; upperIndex = %d ; %d vs %d = %d\n"
		//				 , lowerIndex, midIndex, upperIndex, this.array[midIndex], this.ref, compareResult);
		if (compareResult == 0) {
			result = this.array[midIndex];
		} else if (upperIndex <= lowerIndex) {
			result = null;
		} else if (compareResult < 0) {
			result = searchSubArray(midIndex + 1, upperIndex);
		} else {
			result = searchSubArray(lowerIndex, midIndex - 1);
		}

		return result;
	}

}
