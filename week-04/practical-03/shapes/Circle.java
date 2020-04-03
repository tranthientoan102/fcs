package shapes;

import java.util.StringJoiner;

public class Circle extends Shape {
	public double area(){
		return Math.pow(this.getRadius(), 2) * Math.PI;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Circle.class.getSimpleName() + "{", "}")
						.add("super=" + super.toString())
						.toString();
	}
}
