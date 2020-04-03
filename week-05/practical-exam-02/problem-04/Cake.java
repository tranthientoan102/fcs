public class Cake {

	private String name;
	private float qtSugar;
	private float qtFlour;
	private float qtYeast;
	private double timePrepare;

	public Cake() {
		this.name = "?";
		this.qtSugar = 0f;
		this.qtFlour = 0f;
		this.qtYeast = 0f;
		this.timePrepare = 0d;
	}

	public Cake(String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare) {
		this.name = name;
		this.qtSugar = qtSugar;
		this.qtFlour = qtFlour;
		this.qtYeast = qtYeast;
		this.timePrepare = timePrepare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQtSugar() {
		return qtSugar;
	}

	public void setQtSugar(float qtSugar) {
		this.qtSugar = qtSugar;
	}

	public float getQtFlour() {
		return qtFlour;
	}

	public void setQtFlour(float qtFlour) {
		this.qtFlour = qtFlour;
	}

	public float getQtYeast() {
		return qtYeast;
	}

	public void setQtYeast(float qtYeast) {
		this.qtYeast = qtYeast;
	}

	public double getTimePrepare() {
		return timePrepare;
	}

	public void setTimePrepare(double timePrepare) {
		this.timePrepare = timePrepare;
	}
}
