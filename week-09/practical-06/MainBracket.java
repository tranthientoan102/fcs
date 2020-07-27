public class MainBracket {

	public static void main(String[] args) {
		testStack();
		testBracket();
	}

	public static boolean bracketsMatching(String input){
		return false;
	}

	public static void testStack(){
		MyStack myStack = new MyStack();
		myStack.push(new MyNode("1111"));
		myStack.push(new MyNode("22222"));
		myStack.push(new MyNode("33333"));
		myStack.peek().printNode();
		myStack.pop().printNode();
		myStack.pop().printNode();
		System.out.println(myStack.isEmpty());

	}

	public static void testBracket(){
		BracketsMatcher matcher = new BracketsMatcher();
		String[] testcases = new String[]{"<{[(())]}>", "<{[(())]}", ")"
										,"<(a) + <b[{c}d]>>"
										};
		for (String test: testcases){
			System.out.println("Testing " + test);
			System.out.println(matcher.scan(test));
		}
	}
}
