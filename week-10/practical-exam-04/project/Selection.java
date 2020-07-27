//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: 3
//===================================

import java.util.Arrays;

/**
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
public class Selection extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		int i, j;
		int[] index = this.getIndex(arr.length);
//		System.out.println(Arrays.toString(index));

		for (i = 0; i < arr.length - 1; i++) {

			int jMin = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[jMin]) {
					jMin = j;
				}
			}

			if (jMin != i) {
				int tmp = arr[i];
				arr[i] = arr[jMin];
				arr[jMin] = tmp;

				tmp = index[i];
				index[i] = index[jMin];
				index[jMin] = tmp;

				System.out.println("value : " + Arrays.toString(arr));
				System.out.println("index: " + Arrays.toString(index));

			}

		}

		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}


	@Override
	public int [] sortStringByIndex(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public String [] sortString(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}
}
