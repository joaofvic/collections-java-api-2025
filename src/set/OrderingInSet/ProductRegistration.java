package set.OrderingInSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {

	private Set<Product> productsSet;

	public ProductRegistration() {
		this.productsSet = new HashSet<>();
	}
	
	public void addProduct(String name, long code, double price, int quantity) {
		productsSet.add(new Product(name, code, price, quantity));
	}
	
	public Set<Product> showProductsByName() {
		Set<Product> productsByName = new TreeSet<>(productsSet);
		return productsByName;
	}
	
	public Set<Product> showProductsByPrice() {
		Set<Product> productsByPrice= new TreeSet<>(new ComparatorByPrice());
		productsByPrice.addAll(productsSet);
		return productsByPrice;
	}
	
	public static void main(String[] args) {
		ProductRegistration pR = new ProductRegistration();
		pR.addProduct("TV", 100, 500.00, 1);
		pR.addProduct("Phone", 110, 1500.00, 3);
		pR.addProduct("Tablet", 115, 100.00, 4);
		
		System.out.println(pR.showProductsByName());
		System.out.println(pR.showProductsByPrice());
	}
}
