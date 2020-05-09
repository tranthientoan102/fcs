package question;

public class Main {

	public static void main(String[] args) {
		B b = new B(2323);
		System.out.println(b.getA());
	}

	public static class A {

		int a = 10;

		public A(int a) {
			this.a = a;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		public void randomFuction(int a){
		}
	}

	public static class B extends A {
		public B(int a) {
			super(a);
		}

		@Override
		public void randomFuction(int b) {
		}
	}
}

