public class ArrayAndForLoop {

	public static void main(String[] args) {
		ArrayAndForLoop aafl = new ArrayAndForLoop();
		String[] stringArray = {"alice", "bob", "cenna", "donal", "eli"};
		aafl.printArray(stringArray);

		Float[] floatArray = {1.004f, -2.900000f, 10000f, 80.80808f, -2019.12f};
		aafl.printArray(floatArray);

		int[] intArray = {1, 2, 10, 2020, -2019};
		aafl.printArray(intArray);


	}

	public void printArray(int[] array) {
		int arrayLength = array.length;
		String[] convert = new String[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			convert[i] = "" + array[i];
		}
		printArray(convert);
	}

	public void printArray(String[] array) {
		String result = "[";
		int arrayLength = array.length;
		for (int i = 0; i < arrayLength - 1; i++) {
			result += array[i] + ",";
		}
		result += array[arrayLength - 1] + "]";
		System.out.println(result);

	}

	public void printArray(Float[] array) {
		int arrayLength = array.length;
		String[] convert = new String[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			convert[i] = array[i].toString();
		}
		printArray(convert);
	}


}
