package leetcode;

public class HappyNumber {
	public boolean isHappy(int n) {
		return sumSquareDigits(n)%10==1;
 	}

	public int sumSquareDigits(int input){
		System.out.println("\n\ninput = " + input);
		int result = 0;
		if (input < 10) result = input * input;
		else {
			int tmpInput = input;
			while (tmpInput > 0){
				System.out.printf("processing %s\n", tmpInput % 10);
				result += tmpInput % 10 * tmpInput % 10;
				tmpInput /= 10;
			}
		}
		if (result >= 10) return sumSquareDigits(result);
		else {
			System.out.println("result = " + result);
			return result;
		}
	}

	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
//		System.out.println("CharArray = " + Arrays.asList(
//				 ("123123123").toCharArray()));
//		Arrays.asList(("123123123").toCharArray()).forEach(x -> System.out.println(x + ","));
//		System.out.println("hn.isHappy(14) = " + hn.isHappy(13));

//		int shit = 15;
		int shit = 19;
		System.out.printf("hn.isHappy(%s) =%s\n", shit, hn.isHappy(shit));
	}

}
