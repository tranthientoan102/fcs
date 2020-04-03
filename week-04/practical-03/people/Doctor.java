package people;

import java.util.StringJoiner;

public class Doctor extends Person {

	private String speciality;

	public Doctor() {
		super();
	}

	public Doctor(String[] inputs, int age) {
		super(inputs, age);
	}

	public Doctor(String[] inputs, int age, String speciality) {
		super(inputs, age);
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Doctor.class.getSimpleName() + "{", "}")
						.add("speciality='" + speciality + "'")
						.add("super=" + super.toString())
						.toString();
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
}
