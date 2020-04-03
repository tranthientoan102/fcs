import java.util.Random;

public class Problem04 {
	public static void main(String[] args){

		Random ran = new Random();
		int iter = 10;
		int bound = 20;
		int sum = 0;
		float avg;


		for (int index=0 ; index < iter ; index ++){
			int value = ran.nextInt(bound);
			sum += value;
			String symbol = (value>=10) ? ">=" : "<";
			System.out.print(String.format("[%d] Number %d\t: %s\n", index, value, Problem01.getStringSymbol(value, symbol)));
		}

		avg = (float)sum/iter;
		int avgAsInt = Math.round(avg);
		System.out.print(String.format("Avg %f\t: %s\n", avg, Problem01.getStringSymbol(avgAsInt, "*")));




	}


}