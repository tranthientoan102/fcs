import java.util.HashMap;

public class Fib {

	public HashMap<Integer, Long> fibResult = new HashMap<>();

	public static void main(String[] args) {
		Fib fib = new Fib();
//		for (int i = 0; i < 100; i++) {
//			System.out.println(String.format("%s = %s", i, fib.calc(i)));
//		}
		int i = 100;
		System.out.println(String.format("%s = %s", i, fib.calc(i)));
	}

	public long calc(int n) {
		long result = 0;
		if (fibResult.containsKey(n)) {
			result = fibResult.get(n);
		} else if (n == 0 || n == 1) {
			result = 1L;
		} else {
			result = calc(n - 1) + calc(n - 2);
		}
//		fibResult.putIfAbsent(n, result);
		return result;
	}
}
