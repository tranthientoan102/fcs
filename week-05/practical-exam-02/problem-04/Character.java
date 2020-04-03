public class Character {

	private String name; //this attribute storage the character name;
	private int age; // this attribute storage the character age;
	private String gender; // this attribute storage the character gender
	private String occupation; // this attribute storage the character occupation
	private String familyRole; // this attribute storage the family role
	private float rate;  // this attribute storage the character overall rate by fans;

	public Character() {
		this.name = "?";
		this.gender = "?";
		this.occupation = "?";
		this.familyRole = "?";
		this.age = 0;
		this.rate = 0;
	}

	public Character(String name, int age, String gender, String occupation,
			 String familyRole, float rate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		this.familyRole = familyRole;
		this.rate = rate;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getFamilyRole() {
		return familyRole;
	}

	public void setFamilyRole(String familyRole) {
		this.familyRole = familyRole;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
}
