package animals;

import java.util.StringJoiner;

public class Chameleon extends Animal {
	public String makeSound(){
		return "chameleon sounds";
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Chameleon.class.getSimpleName() + "{", "}")
						.add("super=" + super.toString())
						.toString();
	}
}
