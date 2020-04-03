class Number {
	public static void main(String[] args){
		Double n1=-1.0, n2=4.5, n3=-5.1, largestNumber;

		Double[] n = new Double[]{-1.0, 4.5, -5.1, 10.0, 1.0, 2.0, -20.2};

		largestNumber = n[0];
		for (Double x : n) {
			if (x>largestNumber) largestNumber = x;
		}
		System.out.print("the largest number is " + largestNumber);
	}



}