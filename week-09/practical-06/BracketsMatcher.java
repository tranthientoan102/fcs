
public class BracketsMatcher {

	private final String PARENTHESES = "()";
	private final String SQUARES = "[]";
	private final String BRACES = "{}";
	private final String ANGLES = "<>";

	private final String ALL = PARENTHESES + SQUARES + BRACES + ANGLES;
	private final String ALLCLOSE = "" + PARENTHESES.charAt(1)+ SQUARES.charAt(1)
											 + BRACES.charAt(1) + ANGLES.charAt(1);

	public MyStack bracketsStack = new MyStack();


	public boolean scan(String input){
		//clean old data
		while (!bracketsStack.isEmpty()){
			//keep popping
			bracketsStack.pop();
		}

		boolean result = false;

		String charStr;
		for (char c : input.toCharArray()){
			charStr = "" + c;

			// this char is one of brackets
			if (ALL.contains(charStr)){
				// this  char is a closing bracket
				if (ALLCLOSE.contains(charStr)){
					// closing bracket dont match with nearest ones
					// break and return false
					if (!pairing(charStr)) {
						return false;
					}
				}
				// this  char is a opening bracket
				else{
					bracketsStack.push( new MyNode(charStr));
				}
			}
		}
		// things look good so far
		// stack is empty means all brackets are matched
		return bracketsStack.isEmpty();
	}

	/**
	 * check stack and if input and stack's top are matched brackets,
	 * remove stack's top and return true
	 * @return true if input and stack's top are matched brackets, otherwise false
	 */
	public boolean pairing(String input){
		String expectOpening;
		String pair;
		boolean result = false;

		MyNode topMyNode = bracketsStack.pop();
		expectOpening = (topMyNode != null) ? topMyNode.getData(): "";
		pair = expectOpening + input;
//		System.out.print(pair);

		if (pair.equals(PARENTHESES) || pair.equals(SQUARES) || pair.equals(BRACES)
					 || pair.equals(ANGLES)) {
			result = true;
		}
//		System.out.print(";"+result);
		return result;
	}
}
