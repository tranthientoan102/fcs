import animals.Lion;
import people.Student;
import shapes.RectangleArea;
import vehicles.MountainBike;

public class Main {

	public static void main(String[] args) {
		String[] personInfo = {"Aaaaa", "Bbbbb", "male", "aus"};
		int personAge = 10;
		double[] marks = {50.5, 68.86, -1, -1};
		String[] disciplines = {"good", "good", "????", "????"};
		Student newStudent = new Student(personInfo, personAge, marks, disciplines);
		System.out.println("newStudent = " + newStudent);

		RectangleArea rectangleArea = new RectangleArea();
		rectangleArea.read_input();
		System.out.println("rectangleArea.display() = " + rectangleArea.display());
		System.out.println(rectangleArea.toString());

		Lion a = new Lion();
		a.setName("random lion");
		a.setFavouriteFood("fresh meat");
		a.setWeight(300);
		a.setAge(3);
		System.out.println("a = " + a);
		System.out.println("a.makeSound() = " + a.makeSound());

		MountainBike b = new MountainBike();
		b.setSuspension("good suspension");
		b.setForks("good forks");
		System.out.println("b = " + b);
	}

}
