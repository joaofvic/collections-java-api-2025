package map.OrderingOnMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OnlineBookstore {

	private Map<String, Book> booksMap;

	public OnlineBookstore() {
		this.booksMap = new HashMap<>();
	}
	
	public void addBook(String link, String title, String author, double price) {
		booksMap.put(link, new Book(title, author, price));
	}
	
	public void removeBook(String title) {
		booksMap.remove(title);
	}
	
	public Map<String, Book> showBooksByPrice() {
		List<Map.Entry<String, Book>> booksByPrice = new ArrayList<>(booksMap.entrySet());
		Collections.sort(booksByPrice, new ComparatorByPrice());
		
		Map<String, Book> books = new LinkedHashMap<>();
		
		for (Map.Entry<String, Book> entry : booksByPrice) {
			books.put(entry.getKey(), entry.getValue());
		}
		return books;
	}
	
	public Map<String, Book> searchBooksByAuthor(String author) {
		Map<String, Book> booksByAuthor = new HashMap<>();
		
		for (Map.Entry<String, Book> entry : booksMap.entrySet()) {
			if (entry.getValue().getAuthor().equals(author)) {
				booksByAuthor.put(entry.getKey(), entry.getValue());
			}
		}
		return booksByAuthor;
	}
	
	public Book getMoreExpensiveBook() {
		Book bookMoreExpensive = null;
		double price = Double.MIN_VALUE;
		
		for (Map.Entry<String, Book> entry : booksMap.entrySet()) {
			if (entry.getValue().getPrice() > price) {
				price = entry.getValue().getPrice();
				bookMoreExpensive = entry.getValue();
			}
		}
		return bookMoreExpensive;
	}
	
	public Book showCheapestBook() {
		Book cheapestBook = null;
		double price = Double.MAX_VALUE;
		
		for (Map.Entry<String, Book> entry : booksMap.entrySet()) {
			if (entry.getValue().getPrice() < price) {
				price = entry.getValue().getPrice();
				cheapestBook = entry.getValue();
			}
		}
		return cheapestBook;
	}

	
	public static void main(String[] args) {
		OnlineBookstore bookStore = new OnlineBookstore();
		
		bookStore.addBook("www1", "Java", "Cof", 10.5);
		bookStore.addBook("www2", "Python", "Joh", 15.5);
		bookStore.addBook("www3", "JavaScript", "Cof", 5.5);
		
		System.out.println(bookStore.searchBooksByAuthor("Cof"));;
		
		bookStore.showBooksByPrice();
		
		System.out.println(bookStore.showBooksByPrice());
		
		System.out.println(bookStore.getMoreExpensiveBook());;
		
		System.out.println(bookStore.showCheapestBook());
	}
}
