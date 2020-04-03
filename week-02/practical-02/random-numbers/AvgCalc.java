import java.util.Random;


public class AvgCalc{
	public static void main(String[] args) {

		Random ran = new Random();
		int iter = 10;
		int bound = 100;
		int sum = 0;

		Integer[] data = new Integer[iter];	
		for (int index=0 ; index<iter; index ++){
			data[index] = ran.nextInt(bound) - bound/2;
			sum += data[index];
			System.out.print(String.format("data[%d] = %d\n", index, data[index]));
		}
		float result = (float)sum / iter;
		System.out.print(String.format("Sum of 10 numbers: %d\n", sum));
		System.out.print(String.format("Avg of 10 numbers: %f\n", result));

	}


}