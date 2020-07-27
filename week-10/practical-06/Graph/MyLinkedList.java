package Graph;

import java.util.LinkedList;

public class MyLinkedList extends LinkedList {

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Object o : this) {
			result.append(" -> ").append(o.toString());
		}
		return result.substring(4);
	}
}
