package vehicles;

import java.util.StringJoiner;

public class ElectricBike extends Bicycle {

	private String battery = "0%";

	public void chargeBike() {
		battery = "100%";
		System.out.printf("[vehicles.Bicycle %s] charged. Battery level: %s", this.getId(),
				 this.getBattery());
	}

	public String getBattery() {
		return battery;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ElectricBike.class.getSimpleName() + "{", "}")
						.add("battery='" + battery + "'")
						.add("super=" + super.toString())
						.toString();
	}
}
