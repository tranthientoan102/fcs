package EmergencyServiceSystem;

public class WaitingList {
	protected Node head;
	protected int numNodes;

	public WaitingList(){
		this.head = null;
		this.numNodes = 0;
	}

	/**
	 * This method will pop the first patient from the waiting list
	 * @return the patient popped from the waiting list
	 */
	public Patient popPatient() {
		Patient patient;

		if (this.numNodes == 0) {
			// nothing in queue
			return null;
		}
		else {
			if (this.numNodes == 1){
				// pop head and set head to null
				patient = this.head.getPatient();
				this.head = null;
			}else{
				// traverse to the 2nd node
				// get 1st node
				// set 2nd node's next node to null
				Node secondNode = traverseToSecondNode();
				patient = secondNode.getNext().getPatient();
				secondNode.setNext(null);
			}
			// decrease queue's number of nodes
			this.numNodes -= 1;

		}
		return patient;
	}

	/**
	 * This method will add patient into the waiting list according to the triage level
	 * @param patient patient's data
	 */
	public void addToList(Patient patient) {

		if (this.numNodes == 0)
			this.head = new Node(patient);
		else {
			// create new head, set its next node to the old one
			Node newHead = new Node(patient);
			newHead.setNext(this.head);
			this.head = newHead;
		}
		// increase queue's number of nodes
		this.numNodes += 1;

	}

	/**
	 * traverse until reach the 2nd node
	 * @return 2nd node
	 */
	public Node traverseToSecondNode(){
		if (this.numNodes <= 1) return null;

		Node currentNode = head;

		for (int i = 1; i <= this.numNodes - 2; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	/**
	 * pop patiend by Id
	 * @param id
	 * @return patiend with expecting id
	 */
	public Patient popPatientById(int id) {
		Node result =  null;
		Patient patient = null;
		Node previousNode = null;
		Node currentNode = this.head;

		// checking nodes from head
		while(currentNode != null){
			if (currentNode.getPatient().getId()== id){
				// found patient with input id
				result = currentNode;
				Node newCurrentNode = currentNode.getNext();
				if (newCurrentNode != null){
					// setting up previous node to be new current node
					if (previousNode == null)
						this.head = newCurrentNode;
					else previousNode.setNext(newCurrentNode);
				}
				break;
			}else {
				// keep traverse and looking for expecting patiend id
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
		}

		if (result != null) {
			// found and pop this patiend out of queue
			this.numNodes -= 1;
			return result.getPatient();
		}
		else return null;	// couldnt find expecting id

	}

	/**
	 * print out the information for each patient in waiting list
	 */
	public void printList() {
		String result = "";
		Patient patient;
		Node currentNode = this.head;
		while (currentNode != null){
			patient = currentNode.getPatient();
			result = patient.toString() + "\n" + result;
			currentNode = currentNode.getNext();
		}
		System.out.println(result);

	}

	/**
	 * Check whether the patient is in this list or not
	 * @return
	 */
	public boolean isInList(Patient patient) {
		if (this.head == null) {
			return false;
		}
		Node temp = this.head;
		while(temp != null) {
			if(temp.getPatient().getName().equals(patient.getName())
						&& temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
}
