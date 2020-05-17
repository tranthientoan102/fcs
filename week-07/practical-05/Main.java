import java.util.Arrays;
import java.util.Random;

public class Main {

	static int[] input1 = new int[]{2, 7, 4, 3, 8, 9, 1};
	static int[] sorted1 = new int[]{1, 2, 3, 4, 7, 8, 9};
	static int[] input2 = new int[]{2, 2, 7, 4, 3, 8, 9, 4, 4, 4, 5};
	static int[] sorted2 = new int[]{2, 2, 3, 4, 4, 4, 4, 5, 7, 8, 9};
	static int[] input3 = new int[]{5};
	static int[] sorted3 = new int[]{5};

	public static void main(String[] args) {

		System.out.println("\n\n-------InsertionSort-------");
		testWrapper(new InsertionSort());
		System.out.println("\n\n-------MergeSort-------");
		testWrapper(new MergeSort());
		System.out.println("\n\n-------QuickSort-------");
		testWrapper(new QuickSort());

		System.out.println("\n\n-------min in array-------");
		System.out.println(findSmallestSum(input1));
		System.out.println(findSmallestSum(input1) == 1);


	}
	public static void testWrapper(MySortAlg sortAlg){
		System.out.println(test(sortAlg.sort(input1), sorted1));
		System.out.println(test(sortAlg.sort(input2), sorted2));
		System.out.println(test(sortAlg.sort(input3), sorted3));
	}

	public static boolean test(int[] result, int[] ans) {
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(ans));
		if (result.length != ans.length) {
			return false;
		} else {
			for (int i = 0; i < result.length; i++) {
				if (result[i] != ans[i]) {
					return false;
				}
			}
			return true;
		}

	}
	public static int findSmallestSum(int[] array){
		return new InsertionSort().sort(array)[0];

	}

	public static void devTest() {

		int max = 1000000;
		int[] inputsRandom = new int[max];
		Random random = new Random();
		for (int i = 0; i < inputsRandom.length; i++) {
			inputsRandom[i] = random.nextInt(max);
		}

		//		MySortAlg a = new InsertionSort2();
		//		MySortAlg a = new MergeSort();
		MySortAlg a = new QuickSort();
		long start = System.currentTimeMillis();

		System.out.printf("Start sorting %d... Please wait ...\n", inputsRandom.length);
		int[] result = a.sort(inputsRandom);

		long end = System.currentTimeMillis();

		//		for (int i : result) System.out.print(i + ";");
		System.out.printf("Done sorting %d in %d miliseconds\n", inputsRandom.length, end - start);
		System.out.print("checking sorted result ...");
		System.out.println(checkSorted(result));
	}

	public static boolean checkSorted(int[] sorted) {
		for (int i = 0; i < sorted.length - 1; i++) {
			if (sorted[i] > sorted[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
