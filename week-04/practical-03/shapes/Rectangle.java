package shapes;

import java.util.StringJoiner;

public class Rectangle extends Shape {
	public double area(){
		return this.getLength() * this.getHeight();
	}

	public String display(){
		return String.format("%s , %s", this.getWidth(), this.getHeight());
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Rectangle.class.getSimpleName() + "{", "}")
						.add("super=" + super.toString())
						.toString();
	}
}
