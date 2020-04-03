package shapes;

import java.util.Scanner;

public class RectangleArea extends Rectangle {

	@Override
	public String display() {
		return String.valueOf(this.getHeight() * this.getWidth());
	}

	public void read_input() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Please input rectangle's width and height, separating by a space");
				String[] tmpInputs = scanner.nextLine().split(" ");
				double tmpHeight = Double.parseDouble(tmpInputs[0]);
				double tmpWidth = Double.parseDouble(tmpInputs[1]);

				if (checkInputConstraint(tmpHeight) && checkInputConstraint(tmpWidth)) {
					System.out.println("Successfully read input");
					this.setHeight(tmpHeight);
					this.setWidth(tmpWidth);
					break;
				} else {
					System.out.println("Inputs doesnt satisfy the constraints. Pleaes try again");

				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Fail to read input !!! Please try again\n");
			}
		}
	}

	public boolean checkInputConstraint(double input) {
		return (input >= 1.0 && input <= 1000.0);
	}

	@Override
	public String toString() {
		// specific format required
		return String.format("%s %s\n%s", this.getWidth(), this.getHeight(), this.display());
	}
}
