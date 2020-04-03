package vehicles;

import java.util.StringJoiner;

public class Hibrid extends Bicycle {
	private String suspension ;

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Hibrid.class.getSimpleName() + "{", "}")
						.add("suspension='" + suspension + "'")
						.add("super=" + super.toString())
						.toString();
	}
}
