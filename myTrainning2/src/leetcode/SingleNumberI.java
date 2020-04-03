package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberI {

	Map<Integer, Integer> collection = new HashMap<>();

	public Integer check(int[] input) {
		int result;
		Arrays.stream(input).forEach(x -> {
			if (!collection.containsKey(x)) {
				collection.put(x, 1);
			} else {
				collection.replace(x, collection.get(x) + 1);
			}
		});
		int tmp;
		for (Integer i : collection.keySet()) {
			tmp = collection.get(i);
			if (tmp == 1) {
				return i;
			}
		}
		return null;
	}

	public Integer check(int[] input, int solutionIndex) {
		int result = 0;
		for (int i : input) {
			result ^= i;
		}
		return result;
	}


	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int length = 1000000;
		int[] a = new int[length];
		int value = 0, i = 0;
		while (i < length - 2) {
			a[i++] = value;
			//			System.out.printf("a[%s] = %s\n", i , a[i]);
			a[i++] = value++;
			//			System.out.printf("a[%s] = %s\n", i , a[i]);
		}
		a[length - 1] = length - 1;
		System.out.printf("%s = %s\n", "init time", System.currentTimeMillis() - startTime);
		//		System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
		startTime = System.currentTimeMillis();
		SingleNumberI sn = new SingleNumberI();

		System.out.println("sn.check(a) = " + sn.check(a));
		;
		//		System.out.println("sn.check(a) = " + sn.check(a,1));;

		System.out.printf("%s = %s\n", "checking time", System.currentTimeMillis() - startTime);

	}

}
