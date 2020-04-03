public class Car {

	private String model;
	private int numGears;
	private float literTank;
	private int yearManufacture;

	public Car() {
		this.model = "?";
		this.numGears = 0;
		this.literTank = 0f;
		this.yearManufacture = 0;

	}

	public Car(String model, int numGears, float literTank, int yearManufacture) {
		this.model = model;
		this.numGears = numGears;
		this.literTank = literTank;
		this.yearManufacture = yearManufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumGears() {
		return numGears;
	}

	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}

	public float getLiterTank() {
		return literTank;
	}

	public void setLiterTank(float literTank) {
		this.literTank = literTank;
	}

	public int getYearManufacture() {
		return yearManufacture;
	}

	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}
}
