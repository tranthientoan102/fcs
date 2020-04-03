package vehicles;

public abstract class VehicleAbstract implements Vehicle {

	private String id = "", color = "";
	private int year, numberGear;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberGear() {
		return numberGear;
	}

	public void setNumberGear(int numberGear) {
		this.numberGear = numberGear;
	}

	@Override
	public String toString() {
		return "VehicleAbstract{" +
						"id='" + id + '\'' +
						", color='" + color + '\'' +
						", year=" + year +
						", numberGear=" + numberGear +
						'}';
	}
}
