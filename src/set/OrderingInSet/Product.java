package set.OrderingInSet;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {

	private String name;
	private long code;
	private double price;
	private int quantity;
	
	public Product(String name, long code, double price, int quantity) {
		this.name = name;
		this.code = code;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Product p) {
		return name.compareToIgnoreCase(p.getName());
	}
	
	public String getName() {
		return name;
	}

	public long getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return code == other.code;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + ", quantity=" + quantity + "]";
	}

}

class ComparatorByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
	
}
