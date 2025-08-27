package list.SearchInList;

import java.util.ArrayList;
import java.util.List;

public class CatalogBooks {

	private List<Book> booksList;

	public CatalogBooks() {
		super();
		this.booksList = new ArrayList<>();
	}
	
	public void addBook(String title, String author, int year) {
		booksList.add(new Book(title, author, year));
	}
	
	public List<Book> searchByAuthor(String author) {
		List<Book> booksByAuthor = new ArrayList<>();
		
		if (!booksList.isEmpty()) {
			for (Book b : booksList) {
				if (b.getAuthor().equalsIgnoreCase(author)) {
					booksByAuthor.add(b);
				}
			}
		}
		return booksByAuthor;
	}
	
	public List<Book> searchByIntervalYears(int initialYear, int finalYear) {
		List<Book> booksByYear = new ArrayList<>();
		
		if (!booksList.isEmpty()) {
			for (Book b : booksList) {
				if (b.getYear() >= initialYear && b.getYear() <= finalYear) {
					booksByYear.add(b);
				}
			}
		}
		return booksByYear;
	}
	
	public Book searchByTitle(String title) {
		Book book = null;
		
		for (Book b : booksList) {
			if (b.getTitle().equalsIgnoreCase(title)) {
				book = b;
				break;
			}
		}
		
		return book;
	}
	
	
}
