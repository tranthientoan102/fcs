package animals;

import java.util.StringJoiner;

public class Lion extends Animal {
	public String makeSound(){
		return "lion roars";
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Lion.class.getSimpleName() + "{", "}")
						.add("super=" + super.toString())
						.toString();
	}
}
