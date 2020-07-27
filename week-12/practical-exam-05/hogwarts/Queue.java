public class Queue {

	Node back;
	Node head;

	public void enqueue(Student tmpStudent){
		Node newNode = new Node(tmpStudent);

		if (this.head == null) {
			// update new head
			this.head = newNode;
			this.back = this.head;
		}
		else if (this.head.getNext() == null) {
			// update 2nd node
			this.head.setNext(newNode);
			this.back = newNode;
		}
		else {
			// traverse to the last node, then add new node
			traverseToNextOfLastNode().getNext().setNext(newNode);
			this.back = newNode;
		}
//		System.out.printf("Add %s to queue\n", tmpStudent.toString());
	}

	public void dequeue(){
		Node lastNode;
		Node nextToLastNode = null;

		if (this.head == null) {
			// nothing to dequeue
			this.back = null;
		}
		else if (this.head.getNext() != null) {
			// traverse to the next of last node
			nextToLastNode = traverseToNextOfLastNode();
			// update dequeue result
			this.back = nextToLastNode;
			// remove last node
			nextToLastNode.setNext(null);
		} else {
			// queue only has 1 node
			// update dequeue result
			this.back = null;
			// remove last node
			this.head = null;
		}

	}

	/**
	 * traverse to to next of last node
	 * return null in case queue has only 1 node
	 * @return next of last node
	 */
	public Node traverseToNextOfLastNode(){
		Node lastNode = this.head;
		Node nextToLastNode = null;

		// this loop will end when reaching the last node
		while (lastNode.getNext() != null){
			nextToLastNode = lastNode;
			lastNode = lastNode.getNext();
		}
		return nextToLastNode;
	}
	public void displayQueue(){
		// #1 Cedric Diggory, 14 years old, 1st year in Hogwarts;
		String displayFormat = "#%d %s";
		String result = "";

		Node current = head;
		int index = 1;

		while (current != null){
			result += String.format(displayFormat, index++, current.getInfo().toString());
			current = current.getNext();
		}

		System.out.println(result);
	}

}
