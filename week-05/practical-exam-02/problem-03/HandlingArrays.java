public class HandlingArrays {

	public static void printArray(double [] testArray) {
		String result = "[";
		for (double d: testArray){
			result += d + ",";
		}
		result = result.substring(0, result.length()-1) + "]";
		System.out.println("printing Array: " + result);
	}

	public static double[] sumElements(double [] firstArray, double [] secondArray) {
		if (firstArray.length != secondArray.length)
			throw new RuntimeException("Error - Arrays different shape");
		double[] result = new double[firstArray.length];
		for (int i  = 0 ; i < firstArray.length; i++){
			result[i] = firstArray[i] + secondArray[i];
		}
		return result;
	}

	public static double[] reverseArray(double [] testArray) {
		int length = testArray.length;
		double[] result = new double[length];
		for(int i = 0; i< testArray.length; i++){
			result[i] = testArray[length - 1 -i];
		}
		return result;
	}

}
