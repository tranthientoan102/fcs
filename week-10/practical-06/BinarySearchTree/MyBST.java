package BinarySearchTree;


public class MyBST {

	private Node root; // The reference to the root node in this tree

	public MyBST(){
		this.root = null;
	}


	/**
	 * Insert a new value into the tree. This method calls insertRec()

	 * @param value
	 */
	public void insert(int value){
		if (this.root == null) {
			this.root = new Node(value);

		}else
			insertRec(this.root, value);
	}

	/**
	 * 	This is a recursive function to insert a new value in the tree.
	 *
	 * @param current
	 * @param value
	 */
	private void insertRec(Node current, int value){
		if (value > current.getData()) {
			if (current.getRight() != null)
				insertRec(current.getRight(), value);
			else
				current.setRight(new Node(value));
		}else {
			if (current.getLeft() != null)
				insertRec(current.getLeft(), value);
			else
				current.setLeft(new Node(value));
		}
	}

	/**
	 * Search a node in the tree. This method calls searchRec()
	 *
	 * @param value
	 * @return true if value is found in BST, otherwise false
	 */
	public boolean search(int value){
		return searchRec(this.root, value);
	}

	/**
	 * This is a recursive function to search a node in the tree.
	 *
	 * @param current
	 * @param value
	 * @return true if value is found in BST, otherwise false
	 */
	private boolean searchRec(Node current, int value){
		boolean result = false;
		if (current != null) {
			if (current.getData() == value) {
				result = true;
			} else if (current.getData() < value) {
				result = searchRec(current.getRight(), value);
			} else {
				result = searchRec(current.getLeft(), value);
			}
		}
		return result;
	}


}
