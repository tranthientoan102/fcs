package vehicles;

import java.util.StringJoiner;

public class MountainBike extends Hibrid {
	private String forks ;

	public String getForks() {
		return forks;
	}

	public void setForks(String forks) {
		this.forks = forks;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", MountainBike.class.getSimpleName() + "{", "}")
						.add("forks='" + forks + "'")
						.add("super=" + super.toString())
						.toString();
	}
}
