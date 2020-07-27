//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: Final
//===================================

public class Person {

	private String name;
	private int age;

	/**
	 * basic constructor
	 */
	public Person() {
		this.name = "anon";
		this.age = -1;
	}

	/**
	 * constructor with name and age
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person: " + this.name + " is age: " + this.age;
	}
}
