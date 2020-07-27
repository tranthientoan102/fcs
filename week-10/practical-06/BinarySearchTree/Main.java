package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		int[] data = {4, 5, 1,5, 6, 10};

		MyBST bst = new MyBST();

		for (int i: data){
			bst.insert(i);
		}

		for (int i : data)
			System.out.printf("Find %d from bst: %s\n", i, bst.search(i));

		int i = 100;
		System.out.printf("Find %d from bst: %s\n", i, bst.search(i));

	}
}
