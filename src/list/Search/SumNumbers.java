package list.Search;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {

	private List<Integer> listNumbers;

	public SumNumbers() {
		super();
		this.listNumbers = new ArrayList<>();
	}

	public void addNumber(int number) {
		listNumbers.add(number);
	}

	public int calculateSum() {
		int sum = 0;
		for (Integer i : listNumbers) {
			sum += i;
		}

		return sum;
	}

	public int findBiggestNumber() {
		int n = 0;
		for (Integer i : listNumbers) {
			if (i >= n) {
				n = i;
			}
		}
		return n;
	}

	public int findSmallestNumber() {
		int n = 0;
		for (Integer i : listNumbers) {
			if (i <= n) {
				n += i;
			}
		}
		return n;
	}

	public void showNumbers() {
		System.out.println(listNumbers);
	}

	public static void main(String[] args) {
		SumNumbers su = new SumNumbers();
		su.addNumber(2);
		su.addNumber(1);
		su.addNumber(4);
		su.addNumber(3);
		
		su.showNumbers();
		
		System.out.println(su.findBiggestNumber());
		
		System.out.println(su.findSmallestNumber());
	}
}
