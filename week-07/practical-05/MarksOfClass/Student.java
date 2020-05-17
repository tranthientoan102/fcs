public class Student {
	String name;
	Integer physic, chemistry, math;
	Float average;


	public Student(String[] inputs) {
		int i = 0;
		this.name = inputs[i++];
		this.physic = Integer.valueOf(inputs[i++]);
		this.chemistry = Integer.valueOf(inputs[i++]);
		this.math = Integer.valueOf(inputs[i]);
		this.average = (float)(this.physic + this.chemistry + this.math) /3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhysic() {
		return physic;
	}

	public void setPhysic(Integer physic) {
		this.physic = physic;
	}

	public Integer getChemistry() {
		return chemistry;
	}

	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Float getAverage() {
		return average;
	}

	public void setAverage(Float average) {
		this.average = average;
	}





	public int hasHigherRank(Student pivot){
		int result = hasHigherMarks(pivot.getAverage(), this.getAverage());
		if (result == 0)
			result = hasHigherMarks(pivot.getPhysic(), this.getPhysic());
		if (result == 0)
			result = hasHigherMarks(pivot.getChemistry(), this.getChemistry());
		if (result == 0)
			result = hasHigherMarks(pivot.getMath(), this.getMath());
		if (result == 0)
			result = hasHigherOrderName(pivot.getName(), this.getName());
		return result;
	}

	private int hasHigherMarks(Integer pivotValue, Integer checkingValue) {
		return checkingValue - pivotValue;
	}

	private static int hasHigherMarks(Float pivotValue, Float checkingValue) {
		if (pivotValue.equals(checkingValue)) return 0;
		else return (checkingValue - pivotValue)>0?1:-1;
	}

	private static int hasHigherOrderName(String pivotValue, String checkingValue) {
		return pivotValue.compareTo(checkingValue);
	}

}
