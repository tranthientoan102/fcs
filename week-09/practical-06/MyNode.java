public class MyNode {

	private String data; // the data saved in this node
	private MyNode next; // the reference to another node

	public MyNode(String data) {
		this.data = data;
		this.next = null;
	}

	public MyNode(MyNode ref){
		this.data = ref.data;
		this.next = null;
	}

	public void printNode(){
		System.out.printf("%s is saved in this node.\n", this.data);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
}
