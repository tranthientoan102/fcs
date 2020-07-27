public class Student {


	String name;
	int age;
	int period;

	/**
	 * basic constructor
	 */
	public Student(){
		this.name = "unknown";
	}

	/**
	 * constructor with student info
	 * @param name student's name
	 * @param age student's age
	 * @param period student's period
	 */
	public Student(String name, int age, int period) {
		this.name = name;
		this.age = age;
		this.period = period;
	}

	/**
	 * get student name
	 * @return student name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set student's name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get student's age
	 *
	 * @return student age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * set student's age
	 *
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * get student's period
	 *
	 * @return student period
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * set student's age
	 *
	 * @param period
	 */
	public void setPeriod(int period) {
		this.period = period;
	}

	@Override
	public String toString() {
		// Cedric Diggory, 14 years old, 1st year in Hogwarts;
		return String.format("%s, %d years old, %s year in Hogwarts;\n",
				 this.name, this.age, periodToString());

	}

	/**
	 * adding postfix to student period
	 * @return
	 */
	private String periodToString(){
		String result = "" + this.period;
		switch (this.period%10){
			case 1:
				result += "st";
				break;
			case 2:
				result += "nd";
				break;
			case 3:
				result += "rd";
				break;
			default:
				result += "th";

		}
		return result;
	}
}
