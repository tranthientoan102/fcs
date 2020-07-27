package Graph;

public class Node {

	private int index; // the data saved in this node

	public Node(int index) {
		this.index = index;

	}



	@Override
	public String toString() {
		return String.format("Node <%d>", this.index);
	}

	/**
	 * Print the data saved in the node.
	 *
 	 */
	public void printNode(){
		System.out.println(this.toString());
	}

}
