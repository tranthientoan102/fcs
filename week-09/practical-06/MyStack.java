public class MyStack {

	private MyNode top;

	// Push a node into stack
	public void push(MyNode myNode){
		myNode.setNext(this.top);
		this.top = myNode;
	}

	// Get and remove the top node from this stack.
	// Return Null and print "Stack is empty" when the stack is empty.
	public MyNode pop(){
		if (!this.isEmpty()) {
			MyNode result = new MyNode(this.top);
			this.top = this.top.getNext();
			return result;
		}else {
			System.out.println("Stack is empty");
			return null;
		}
	}

	// Get the top node in this stack.
	// Return Null and print "Stack is empty" when the stack is empty.
	public MyNode peek(){
		if (!this.isEmpty()) {
			return new MyNode(this.top);
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}

	// Return TRUE when the stack is empty, otherwise, return FALSE.
	public boolean isEmpty(){
		return (this.top == null);
	}

}
