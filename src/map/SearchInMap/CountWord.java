package map.SearchInMap;

import java.util.HashMap;
import java.util.Map;

public class CountWord {

	private Map<String, Integer> wordsMap;
	
	public CountWord() {
		this.wordsMap = new HashMap<>();
	}
	
	public void addWord(String name, int count) {
		wordsMap.put(name, count);
	}
	
	public void removeWord(String word) {
		wordsMap.remove(word);
	}
	
	public void showWords() {
		for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	public Map.Entry<String, Integer> findWordMostFrequent() {
		Map.Entry<String, Integer> word = null;
		int count = Integer.MIN_VALUE;
		
		for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
			if (entry.getValue() > count) {
				word = entry;
				count = entry.getValue();
			}
		}
		
		return word;
	}
	
	
	public static void main(String[] args) {
		CountWord c = new CountWord();
		
		c.addWord("Water", 3);
		c.addWord("Tree", 2);
		
		c.showWords();
		
		System.out.println(c.findWordMostFrequent());
		
	}
	
}
