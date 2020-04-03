package people;

import java.util.StringJoiner;

public class Patient extends Person {

	@Override
	public String toString() {
		return new StringJoiner(", ", Patient.class.getSimpleName() + "{", "}")
						.add("diagnostic='" + diagnostic + "'")
						.add("inTime='" + inTime + "'")
						.add("prevTime='" + prevTime + "'")
						.add("super=" + super.toString())
						.toString();
	}

	private String diagnostic = "", inTime = "", prevTime = "";

	public Patient() {
	}

	public Patient(String[] inputs, int age) {
		super(inputs, age);
	}

	public Patient(String[] inputs, int age, String diagnostic, String inTime,
			 String prevTime) {
		super(inputs, age);
		this.diagnostic = diagnostic;
		this.inTime = inTime;
		this.prevTime = prevTime;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getPrevTime() {
		return prevTime;
	}

	public void setPrevTime(String prevTime) {
		this.prevTime = prevTime;
	}
}
