package MySearchAlg;

import java.util.Arrays;
import java.util.Random;

public class Main {

	static Integer ref = 20;
	static Integer[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20};
	static Integer[] test2 = {40, 8, 2, 9, 4, 5, 20, 6, 7, 1, 3};
	static Integer[] test3 = {40, 8, 2, 9, 400, 5, 20, 6, 7, 1, 3};
	static int largeAmount = 10000000;
	static int largeRef;
	static Integer[] largeInput;

	public static void setupLargeTest(){
		Random random = new Random();

//		largeRef = random.nextInt(largeAmount);

		largeInput = new Integer[largeAmount];
		for (int i = 0; i < largeAmount; i++) {
			largeInput[i] = random.nextInt(largeAmount);
		}
		largeRef = largeInput[largeAmount-1];
	}

	public static void main(String[] args) {
		setupLargeTest();

		MySearchAlg<Integer> searchAlg = new LinearSearch();
		testCombo(searchAlg, "\n\nRunning test for linear search");

		searchAlg = new BinarySearch();
		testCombo(searchAlg,"\n\nRunning test for Binary search");

		System.out.println("\n\n" + Arrays.toString(test1));
		System.out.println("index of max value: " + findMaxVal(test1));
		System.out.println(Arrays.toString(test2));
		System.out.println("index of max value: " + findMaxVal(test2));
		System.out.println(Arrays.toString(test3));
		System.out.println("index of max value: " + findMaxVal(test3));

	}

	public static void testCombo(MySearchAlg searchAlg, String msg){
		System.out.println(msg);
		test(searchAlg, test1, ref);
		test(searchAlg, test2, ref);
		test(searchAlg, largeInput, largeRef);

	}

	public static void test(MySearchAlg searchAlg, Comparable[] input, Comparable ref) {
		long startTime = System.currentTimeMillis();

//		System.out.println("input : " + Arrays.toString(input));
		System.out.println(searchAlg.search(input, ref));
		System.out.println(String.format("Finish search in %d ms",
				 System.currentTimeMillis() - startTime));

	}


	public static int findMaxVal(Comparable[] input){
		int maxValIndex=0;
		Comparable max = input[maxValIndex];
		for (int i=0; i < input.length; i++){
			if (input[i].compareTo(max)>0){
				maxValIndex = i;
			}
		}
		return maxValIndex;
	}


}
