package people;

import java.util.StringJoiner;

public class Person {

	private String givenName, lastName, gender, citizenship;
	private int age;

	Person() {
		this.givenName = "???";
		this.lastName = "???";
		this.gender = "???";
		this.citizenship = "???";

	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Person.class.getSimpleName() + "{", "}")
						.add("givenName='" + givenName + "'")
						.add("lastName='" + lastName + "'")
						.add("gender='" + gender + "'")
						.add("citizenship='" + citizenship + "'")
						.add("age=" + age)
						.toString();
	}

	Person(String[] inputs, int age) {
		int i = 0;
		this.givenName = inputs[i++];
		this.lastName = inputs[i++];
		this.gender = inputs[i++];
		this.citizenship = inputs[i];
		this.age = age;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
