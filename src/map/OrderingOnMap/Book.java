package map.OrderingOnMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Book {

	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}

class ComparatorByAuthor implements Comparator<Map.Entry<String, Book>>{

	@Override
	public int compare(Entry<String, Book> b1, Entry<String, Book> b2) {
		return b1.getValue().getAuthor().compareTo(b2.getValue().getAuthor());
	}
}

class ComparatorByPrice implements Comparator<Map.Entry<String, Book>> {

	@Override
	public int compare(Entry<String, Book> b1, Entry<String, Book> b2) {
		return Double.compare(b1.getValue().getPrice(), b2.getValue().getPrice());
	}
}