package map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private Map<String, String> dictionaryMap;

	public Dictionary() {
		this.dictionaryMap = new HashMap<>();
	}
	
	public void addWord(String word, String definition) {
		dictionaryMap.put(word, definition);
	}
	
	public void removeWord(String word) {
		if (!dictionaryMap.isEmpty()) {
			dictionaryMap.remove(word);
		}
	}
	
	public void showWords() {
		if (!dictionaryMap.isEmpty()) {
			System.out.println(dictionaryMap);
		}
	}
	
	public String searchByWord(String word) {
		String wordSearched = null;
		if (!dictionaryMap.isEmpty()) {
			wordSearched = dictionaryMap.get(word);
		}
		return wordSearched;
	}
	
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		
		d.addWord("Water", "Liquid and colorless substance.");
		d.addWord("Tree", "Woody vegetable of very variable size.");
		d.addWord("Glass", "Ger container cylindrical, without handle and without lid.");
		
		d.showWords();
		
		d.removeWord("Water");
		
		d.showWords();
		
		System.out.println(d.searchByWord("Tree"));
	}
}
