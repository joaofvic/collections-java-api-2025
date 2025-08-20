package list.OrderingInList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingPeoples {
	
	private List<People> listPeoples;

	public OrderingPeoples() {
		this.listPeoples = new ArrayList<People>();
	}
	
	public void addPeoples(String name, int age, double height) {
		listPeoples.add(new People(name, age, height));
	}
	
	public List<People> sortByAge(){
		List<People> sortAge = new ArrayList<>(listPeoples);
		Collections.sort(sortAge);
		return sortAge;
	}
	
	public List<People> sortByHeight() {
		List<People> sortHeight = new ArrayList<>(listPeoples);
		Collections.sort(sortHeight, new CompareByHeight());
		return sortHeight;
	}
	
	public static void main(String[] args) {
		OrderingPeoples o = new OrderingPeoples();
		
		o.addPeoples("J", 38, 1.70);
		o.addPeoples("V", 28, 1.45);
		o.addPeoples("F", 15, 1.50);
		
		System.out.println(o.sortByAge());
		System.out.println(o.sortByHeight());
	}
}
