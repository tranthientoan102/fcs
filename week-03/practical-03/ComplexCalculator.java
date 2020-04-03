import java.util.Scanner;

public class ComplexCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ComplexCalculator cc = new ComplexCalculator();

		MyComplexNumber a = manualCreateComplexNumber(scanner, cc, "1st");
		MyComplexNumber b = manualCreateComplexNumber(scanner, cc, "2st");
//		MyComplexNumber a = cc.createComplexNumber(15.12345,7.77777);
//		MyComplexNumber b = cc.createComplexNumber(5.1,-2.66666);

		System.out.printf("(%s) + (%s) = %s\n", a, b, cc.add(a, b));
		System.out.printf("(%s) - (%s) = %s\n", a, b, cc.sub(a, b));
		System.out.printf("(%s) * (%s) = %s\n", a, b, cc.multiplication(a, b));
		System.out.printf("(%s) / (%s) = %s\n", a, b, cc.division(a, b));
		System.out.printf("(%s) / (%s) = %s\n", b, a, cc.division(b, a));

	}

	public static MyComplexNumber manualCreateComplexNumber(Scanner scanner, ComplexCalculator cc,
			String ordinal) {
		System.out.printf("Please input %s complex number's real part: ", ordinal);
		double tmpReal = scanner.nextDouble();
		System.out.printf("Please input %s complex number's imaginary part: ", ordinal);
		double tmpImaginary = scanner.nextDouble();
		return cc.createComplexNumber(tmpReal, tmpImaginary);
	}

	public MyComplexNumber add(MyComplexNumber a, MyComplexNumber b) {
		MyComplexNumber result = new MyComplexNumber();
		result.real = a.real + b.real;
		result.imaginary = a.imaginary + b.imaginary;
//		result.calcProcess = String.format("(%s) + ()", )

//			a.real + b.real , a.imaginary+ b.imaginary
		return result;
	}

	public MyComplexNumber sub(MyComplexNumber a, MyComplexNumber b) {
		return new MyComplexNumber(a.real - b.real, a.imaginary - b.imaginary);
	}

	public MyComplexNumber multiplication(MyComplexNumber a, MyComplexNumber b) {
		// (a1 + i*a2) * (b1 + i*b2) = a1*b1 - a2*b2 + i*( a1*b2 + a2*b1)
		double real = a.real * b.real - a.imaginary * b.imaginary;
		double imaginary = a.real * b.imaginary + a.imaginary * b.real;
		return new MyComplexNumber(real, imaginary);
	}

	public MyComplexNumber division(MyComplexNumber a, MyComplexNumber b) {
		// (a1 + i*a2) / (b1 + i*b2) = (a1 + i*a2) * (b1 - i*b2) / (b1^2 + b2^2)
		//                                          =  [ (a1*b1 + a2*b2) + i*(a2*b1 - a1*b2) ] / (b1^2 + b2^2)
		double real = a.real * b.real + a.imaginary * b.imaginary;
		double imaginary = -a.real * b.imaginary + a.imaginary * b.real;
		double dividend = b.real * b.real + b.imaginary * b.imaginary;
		return new MyComplexNumber(real / dividend, imaginary / dividend);
	}

	public MyComplexNumber createComplexNumber(double real, double imaginary) {
		return new MyComplexNumber(real, imaginary);
	}

	public static class MyComplexNumber {

		double real;
		double imaginary;

		public MyComplexNumber() {
		}

		public MyComplexNumber(double real, double imaginary) {
			this.real = real;
			this.imaginary = imaginary;
		}

		public String toString() {
			String result = "";
			if (this.imaginary == 0) {
				result = "" + this.real;
			} else if (this.imaginary < 0) {
				result = this.real + " - i*" + (-this.imaginary);
			} else {
				result = this.real + " + i*" + imaginary;
			}
			return result;
		}
	}
}
