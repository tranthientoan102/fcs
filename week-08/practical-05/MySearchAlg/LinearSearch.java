package MySearchAlg;

public class LinearSearch extends MySearchAlg {


	@Override
	Comparable search(Comparable[] array, Comparable ref) {
		for (Comparable c : array) {
			if (c.equals(ref)) {
				return c;
			}
		}
		return null;
	}
}
