package set.BasicOperations;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetUniqueWords {

	private Set<String> wordsSet;

	public SetUniqueWords() {
		this.wordsSet = new HashSet<>();
	}
	
	public void addWord(String word) {
		wordsSet.add(word);
	}
	
	public void removeWord(String word) {
		wordsSet.remove(word);
	}
	
	public void checkWord(String word) {
		if (wordsSet.contains(word)) {
			System.out.println("This word is contained in the set.");
		} else {
			System.out.println("This word is not contained in the set.");
		}
	}
	
	public void showWords() {
		System.out.println(wordsSet);
	}

	@Override
	public String toString() {
		return "SetUniqueWords [wordsSet=" + wordsSet + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(wordsSet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetUniqueWords other = (SetUniqueWords) obj;
		return Objects.equals(wordsSet, other.wordsSet);
	}

	public static void main(String[] args) {
		SetUniqueWords s = new SetUniqueWords();
		
		s.addWord("K");
		s.addWord("K");
		s.addWord("L");
		s.addWord("M");
		
		s.showWords();
		
		s.checkWord("M");
		
		s.removeWord("M");
		
		s.showWords();
	}
}
