package map.SearchInMap;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {

	private Map<Long, Product> stockPrductsMap;

	public StockProducts() {
		this.stockPrductsMap = new HashMap<>();
	}
	
	public void addProduct(long code, String name, int quantity, double price) {
		stockPrductsMap.put(code, new Product(name, price, quantity));
	}
	
	public void showProducts() {
		System.out.println(stockPrductsMap);
	}
	
	public double calculateTotalValueStock() {
		double totalValue = 0;
		if (!stockPrductsMap.isEmpty()) {
			for (Product p : stockPrductsMap.values()) {
				totalValue += p.getPrice() * p.getQuantity();
			}
		}
		return totalValue;
	}
	
	public Product getProductMoreExpensive() {
		Product productMoreExpensive = null;
		double highestPrice = Double.MIN_VALUE;
		
		if (!stockPrductsMap.isEmpty()) {
			for (Product p : stockPrductsMap.values()) {
				if (p.getPrice() > highestPrice) {
					productMoreExpensive = p;
					highestPrice = p.getPrice();
				}
			}
		}
		return productMoreExpensive;
	}
	
	public Product getCheaperProduct() {
		Product cheaperProduct = null;
		double lowestPrice = Double.MAX_VALUE;
		
		if (!stockPrductsMap.isEmpty()) {
			for (Product p : stockPrductsMap.values()) {
				if (p.getPrice() < lowestPrice) {
					cheaperProduct = p;
					lowestPrice = p.getPrice();
				}
			}
		}
		return cheaperProduct;
	}
	
	public Map.Entry<Long, Product> getProductLargestQuantityTotalValueInStock() {
		Map.Entry<Long, Product> productHighestValueStock = null;
		double highestValueStock = 0;
		
		if (!stockPrductsMap.isEmpty()) {
			for (Map.Entry<Long, Product> entry : stockPrductsMap.entrySet()) {
				double value = entry.getValue().getPrice() * entry.getValue().getQuantity();
				if (value > highestValueStock) {
					highestValueStock = value;
					productHighestValueStock = entry;
				}
			}
			
		}
		return productHighestValueStock;
	}

	
	
	public static void main(String[] args) {
		StockProducts stockProducts = new StockProducts();
		
		stockProducts.addProduct(404, "Product 0", 2, 5);
		stockProducts.addProduct(406, "Product 1", 1, 00);
		stockProducts.addProduct(405, "Product 2", 4, 10);
		
		stockProducts.showProducts();
		
		System.out.println(stockProducts.calculateTotalValueStock());
		
		System.out.println(stockProducts.getProductMoreExpensive());
		
		System.out.println(stockProducts.getProductLargestQuantityTotalValueInStock());
	}
}
