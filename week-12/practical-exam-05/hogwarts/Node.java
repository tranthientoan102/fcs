public class Node {

	Student info;
	Node next;

	/**
	 * basic constructor
	 */
	public Node() {
	}

	/**
	 * constructor with Student info
	 * @param info existed student
	 */
	public Node(Student info) {
		this.info = info;
		this.next = null;
	}

	/**
	 * get node's student info
	 * @return
	 */
	public Student getInfo() {
		return info;
	}

	/**
	 * set node's student info
	 * @param info
	 */
	public void setInfo(Student info) {
		this.info = info;
	}

	/**
	 * get next node
	 * @return
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * set next node
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return this.getInfo().toString();
	}
}
