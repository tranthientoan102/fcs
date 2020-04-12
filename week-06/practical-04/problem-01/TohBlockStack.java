//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Number: 04
//===================================

import java.util.Stack;

public class TohBlockStack extends Stack<TohDisk> {

	@Override
	public TohDisk push(TohDisk item) {
		if (this.size() == 0 || (this.get(0).weight > item.weight)) {
			return super.push(item);
		} else {
			return null;
		}
	}
}
