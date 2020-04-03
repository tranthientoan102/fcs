package books;

import java.util.StringJoiner;

public class PhysicalBook extends Book {
	private int shelf, aisle, floor;

	public PhysicalBook() {
		super();
	}

	public PhysicalBook(String title, String publish, int year, int pages) {
		super(title, publish, year, pages);
	}

	public PhysicalBook(String title, String publish, int year, int pages, int shelf, int aisle,
			 int floor) {
		super(title, publish, year, pages);
		this.shelf = shelf;
		this.aisle = aisle;
		this.floor = floor;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", PhysicalBook.class.getSimpleName() + "{", "}")
						.add("shelf=" + shelf)
						.add("aisle=" + aisle)
						.add("floor=" + floor)
						.add("super=" + super.toString())
						.toString();
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public int getAisle() {
		return aisle;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String displayBookLocation(){
		return String.format("floor %s, aisle %s, shelf %s", floor, aisle, shelf);
	}
}
