package people;

import java.util.Arrays;
import java.util.StringJoiner;
import people.Person;

public class Student extends Person {

	private double[] marks;
	private String[] disciplines;

	public Student(String[] baseInputs, int baseAge) {
		super(baseInputs, baseAge);
	}

	public Student() {
		super();
	}

	public Student(String[] baseInputs, int baseAge, double[] marks, String[] disciplines) {
		super(baseInputs, baseAge);
		this.marks = marks;
		this.disciplines = disciplines;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Student.class.getSimpleName() + "{", "}")
						.add("marks=" + Arrays.toString(marks))
						.add("disciplines=" + Arrays.toString(disciplines))
						.add("super=" + super.toString())
						.toString();
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public String[] getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines;
	}

	public double averageMarks(){
		double tmp =0;
		for (int i = 0; i < marks.length; i++) {
			tmp += i;
		}
		return tmp / marks.length;
	}

	public String displayDisciplines (){
		return Arrays.toString(disciplines);
	}
}
