package books;

import java.util.StringJoiner;

public class Book {

	private String title, publish;
	private int year, pages;

	public Book() {
		this.title = "???";
		this.publish = "???";
	}

	public Book(String title, String publish, int year, int pages) {
		this.title = title;
		this.publish = publish;
		this.year = year;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Book.class.getSimpleName() + "{", "}")
						.add("title='" + title + "'")
						.add("publish='" + publish + "'")
						.add("year=" + year)
						.add("pages=" + pages)
						.toString();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
