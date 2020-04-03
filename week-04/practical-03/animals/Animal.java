package animals;

import java.util.StringJoiner;

public class Animal {

	//	++ attributes: name (String), weight (double), favouriteFood (String), age (int)
	private String name, favouriteFood;
	private double weight, age;

	public Animal() {
		this.name = "???";
		this.favouriteFood = "???";
		// weight, age are initialized with default value 0
	}

	public Animal(String name, String favouriteFood, double weight, double age) {
		this.name = name;
		this.favouriteFood = favouriteFood;
		this.weight = weight;
		this.age = age;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Animal.class.getSimpleName() + "{", "}")
						.add("name='" + name + "'")
						.add("favouriteFood='" + favouriteFood + "'")
						.add("weight=" + weight)
						.add("age=" + age)
						.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public void setFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
}
