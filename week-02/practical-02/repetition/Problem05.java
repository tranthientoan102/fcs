import java.util.Random;

public class Problem05 {
	public static void main(String[] args){

		Random ran = new Random();
		int iter = 10;
		int bound = 20;
		int sum = 0;
		float avg;


		for (int index = 0 ; index < iter ; index ++){
			int value = ran.nextInt(bound);
			sum += value;
			String symbol = classifyValue(value);
			System.out.print(String.format("[%d] Number %d\t: %s\n", index, value, Problem01.getStringSymbol(value, symbol)));
		}

		avg = (float)sum / iter;
		int avgAsInt = Math.round(avg);
		System.out.print(String.format("Avg %f\t: %s\n", avg, Problem01.getStringSymbol(avgAsInt, "*")));




	}
	public static String classifyValue(int input){
		String result;

		switch (input){
			case 0:
				result = "";
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				result = "o";
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				result = "x";
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				result = "s";
				break;
			default:
				result = "*";
				break;
		}
		return result;
	}


}