package people;

import java.util.Arrays;
import java.util.StringJoiner;

public class Lecturer extends Person {

	private double salary;
	private String[] disciplines;

	public Lecturer() {
		super();
	}

	public Lecturer(String[] inputs, int age) {
		super(inputs, age);
	}

	public Lecturer(String[] inputs, int age, double salary, String[] disciplines) {
		super(inputs, age);
		this.salary = salary;
		this.disciplines = disciplines;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Lecturer.class.getSimpleName() + "{", "}")
						.add("salary=" + salary)
						.add("disciplines=" + Arrays.toString(disciplines))
						.add("super=" + super.toString())
						.toString();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String[] getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines;
	}

	public double annualSalary() {
		return salary * 12;
	}

	public String displayDisciplines() {
		return Arrays.toString(disciplines);
	}
}
