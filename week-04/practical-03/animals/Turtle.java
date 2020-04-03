package animals;

import java.util.StringJoiner;

public class Turtle extends Animal {
	public String makeSound(){
		return "turle doesn't make sound";
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Turtle.class.getSimpleName() + "{", "}")
						.add("super=" + super.toString())
						.toString();
	}
}
