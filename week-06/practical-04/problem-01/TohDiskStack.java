//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Number: 04
//===================================

import java.util.Stack;

/**
 * ToH's stack of disks
 */
public class TohDiskStack extends Stack<TohDisk> {

	@Override
	public TohDisk push(TohDisk item) {
		//implement rule for not allow putting bigger disk on top of smaller one
		if (this.isEmpty() || (this.get(0).weight > item.weight)) {
			return super.push(item);
		} else {
			return null;
		}
	}
}
