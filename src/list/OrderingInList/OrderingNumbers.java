package list.OrderingInList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingNumbers {

	private List<Integer> listNumbers;

	public OrderingNumbers() {
		super();
		this.listNumbers = new ArrayList<>();
	}
	
	public void addNumber(int number) {
		listNumbers.add(number);
	}
	
	public List<Integer> sortAscending() {
		List<Integer> sortedAscending = new ArrayList<Integer>(listNumbers);
		Collections.sort(sortedAscending);
		return sortedAscending;
	}
	
	public List<Integer> sortDescending() {
		List<Integer> sortedDescending = new ArrayList<Integer>(listNumbers);
		sortedDescending.sort(Collections.reverseOrder());
		return sortedDescending;
	}
	
	
	public static void main(String[] args) {
		OrderingNumbers o = new OrderingNumbers();
		
		o.addNumber(8);
		o.addNumber(4);
		o.addNumber(9);
		o.addNumber(3);
		
		System.out.println(o.sortAscending());
		System.out.println(o.sortDescending());
	}
}
