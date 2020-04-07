package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SingleNumberIII {

	Map<Integer, Integer> collection = new HashMap<>();

	public int[] check(int[] input) {
//		SingleNumberI sn1 = new SingleNumberI();
//		sn1.check(input);
		Arrays.stream(input).forEach(x -> {
			if (!collection.containsKey(x)) {
				collection.put(x, 1);
			} else {
				collection.replace(x, collection.get(x) + 1);
			}
		});
		int tmp;

		List<Integer> result = new ArrayList<>();
		for (Integer i : collection.keySet()) {
//			System.out.println("checking key " + i);
			tmp =  collection.get(i);
			if (tmp == 1) {
//				System.out.printf("%s = %s\n", "add to result", i);
				result.add(i);
			}
		}
		return result.stream().mapToInt(i -> i).toArray();
	}

	public int[] check(int[] input, int solutionIndex) {
		int xor = 0;
		HashSet<Integer> result = new HashSet<>();
		for (int i : input) {
			xor ^= i;
		}
		for (int i : input) {
			if ((i & xor) !=0){
				result.add(i);
			}
		}
		return result.stream().mapToInt(i -> i).toArray();
	}


	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int length = 1000000;
		int[] a = new int[length];
		int value = 0, i = 0;
		while (i < length - 3) {
			a[i++] = value;
			//			System.out.printf("a[%s] = %s\n", i , a[i]);
			a[i++] = value++;
			//			System.out.printf("a[%s] = %s\n", i , a[i]);
		}
		a[length - 1] = length - 1;
		a[length - 2] = length - 2;
		System.out.printf("%s = %s\n", "init time", System.currentTimeMillis() - startTime);
		//		System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
		startTime = System.currentTimeMillis();
		SingleNumberIII sn3 = new SingleNumberIII();

//		System.out.println("sn3.check(a) = " + Arrays.toString(sn3.check(a)));
				System.out.println("sn3.check(a) = " + Arrays.toString(sn3.check(a, 1)));;

		System.out.printf("%s = %s\n", "checking time", System.currentTimeMillis() - startTime);

	}

}
