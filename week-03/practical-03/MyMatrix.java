import java.util.Scanner;

public class MyMatrix {

	int[][] values;
	int scale = 1;

	public MyMatrix(int initM, int initN) {
//		System.out.println("init with dementions");
		values = new int[initM][initN];
	}

	public MyMatrix(int initDemention) {
//		System.out.println("init with dementions");
		values = new int[initDemention][initDemention];
	}

	public MyMatrix(int[][] inputValues) {
//		System.out.println("init with values");
		int tmpRow = inputValues.length;
		int tmpCol = inputValues[0].length;
		values = new int[tmpRow][tmpCol];

		for (int i = 0; i < tmpRow; i++) {
			System.arraycopy(inputValues[i], 0, values[i], 0, tmpCol);
		}
	}

	public static void main(String[] args) {

//		int[][] inputMatrix = {
////				{1,10},
////				{5,10},
//				{23 , 34 , 67} ,
//				{1 , 45 , 9} ,
//				{3 , 6 , 76} ,
//		};

		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to Matrix Determinant Calculator!");
			System.out.println("Would you like to calculate the determinant of a new matrix?");
			System.out.println("1: Yes, other: No");
			System.out.print("Option: ");
			if (scanner.nextInt() == 1) {
				System.out.println("\nWhat is the dimension of the matrix? ");
				int demension = checkSquareDemension(scanner.next());
				System.out.println("Great! Let's calculate this determinant then.");
				MyMatrix mm = manualCreateMatrix(demension, demension, scanner);

				System.out.println("Input matrix is: ");
				System.out.println(mm.toString());
				System.out.printf("%s = %s\n", "Determinant", mm.calcDet());

//				System.out.printf("%s = %s\n" , "sub matrix @ 0" , mm.subMatrix(0));
//				System.out.printf("%s = %s\n" , "sub matrix @ 1" , mm.subMatrix(1));
//				System.out.printf("%s = %s\n" , "sub matrix @ 2" , mm.subMatrix(2));
			}


		} catch (Exception e) {
			System.out.println("!!! Exception occurred !!!");
			e.printStackTrace();
		}


	}

	public static Integer checkSquareDemension(String input) {
		Integer result = null;
		try {
			String[] mxn = input.toLowerCase().split("x");
			Integer m = Integer.valueOf(mxn[0]);
			Integer n = Integer.valueOf(mxn[1]);
			if (m.equals(n)) {
				result = m;
			}
		} catch (Exception e) {
			System.out.println("!!! Exception occurred !!!");
			e.printStackTrace();
		}
		return result;
	}

	private static MyMatrix manualCreateMatrix(int m, int n, Scanner scanner) {

		System.out.println("Please insert all the values for your matrix.");
		MyMatrix mm = new MyMatrix(m, n);

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < m; y++) {
				System.out.printf("New matrix [%s][%s]: ", x, y);
				mm.values[x][y] = scanner.nextInt();
			}
		}
		return mm;
	}

	public Integer calcDet() {
		Integer result = null;
		if (this.values.length != this.values[0].length) {
			// input is not a spuare matrix
			// do nothing
		} else if ((this.values.length == 2)) {
			result = this.values[0][0] * this.values[1][1]
					         - this.values[0][1] * this.values[1][0];
		} else {
			result = 0;
			for (int i = 0; i < this.values.length; i++) {
				result += this.values[0][i] * (i % 2 == 0 ? 1 : -1) * subMatrix(i).calcDet();
			}
		}
		return result;
	}

	// get sub matrix of given one,
	// only apply for square matrix that demention are higher than 2x2
	private MyMatrix subMatrix(int anchorIndex) {
		int newDemention = this.values.length - 1;
		MyMatrix result = new MyMatrix(newDemention);

		int tmpSubRow = 0;
		int tmpSubCol = 0;
		// skip the 0th row, since this row is for anchoring
		for (int row = 1; row < this.values.length; row++) {
			for (int col = 0; col < this.values.length; col++) {
				if (col != anchorIndex) {
					//System.out.printf("checking position [%s][%s]\n", row, col);
					result.values[tmpSubRow][tmpSubCol] = this.values[row][col];
					tmpSubCol += 1;
				}
			}
			// go to next row, reset column index
			tmpSubRow += 1;
			tmpSubCol = 0;


		}
		return result;
	}

	public String toString() {
		String result = "[ ";
		for (int i = 0; i < this.values.length - 1; i++) {
			result += rowToString(i) + " , ";
		}
		result += rowToString(this.values.length - 1);
		result += " ]";
		return result;
	}

	public String rowToString(int row) {
		String result = "[ ";
		for (int i = 0; i < this.values[0].length - 1; i++) {
			result += this.values[row][i] + " , ";
		}
		result += String.format("%s ]", this.values[row][this.values[0].length - 1]);
		return result;
	}


}
