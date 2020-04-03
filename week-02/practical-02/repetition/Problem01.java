import java.util.Random;


public class Problem01{
		
	public static void main(String[] args){

		Random ran = new Random();
		int iter = 10;
		int bound = 20;



		for (int index=0 ; index < iter ; index ++){
			int value = ran.nextInt(bound);
			System.out.print(String.format("[%d] Number %d\t: %s\n", index, value, getStringSymbol(value, "*")));
		
		}


	}

	public static String getStringSymbol(Integer input, String symbol){
		int value = Math.abs(input);
		String result = "";
		for (int i=0; i< value; i++){
			result += symbol;
		}
		return result;


	}

}