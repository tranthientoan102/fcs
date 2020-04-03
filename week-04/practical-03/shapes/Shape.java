package shapes;

public class Shape {

	private double width, height, radius, length;

	Shape() {
		// do nothing
		// attributes are initialized with default value 0.0
	}

	Shape(double[] inputs) {
		int i = 0;
		this.width = inputs[i++];
		this.height = inputs[i++];
		this.radius = inputs[i++];
		this.length = inputs[i];
		System.out.println("");
	}

	public String toString() {
		String result = String.format("\t%s = %s\n", "width", width);
		result += String.format("\t%s = %s\n", "height", height);
		result += String.format("\t%s = %s\n", "radius", radius);
		result += String.format("\t%s = %s\n", "length", length);
		return result;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
}
