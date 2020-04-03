package shapes;

public class Triangle extends Shape {
	public double area(){
		return 0.5 * getBaseLength();
	}
	public double getBaseLength(){
		if (this.getWidth() != 0.0) return this.getWidth();
		else return this.getHeight();
	}
}
