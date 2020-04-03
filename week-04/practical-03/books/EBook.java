package books;

import java.util.StringJoiner;

public class EBook extends Book {

	@Override
	public String toString() {
		return new StringJoiner(", ", EBook.class.getSimpleName() + "{", "}")
						.add("url='" + url + "'")
						.add("super=" + super.toString())
						.toString();
	}

	private String url="";

	public EBook() {
		super();
	}

	public EBook(String title, String publish, int year, int pages) {
		super(title, publish, year, pages);
	}

	public EBook(String title, String publish, int year, int pages, String url) {
		super(title, publish, year, pages);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
