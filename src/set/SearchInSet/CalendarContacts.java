package set.SearchInSet;

import java.util.HashSet;
import java.util.Set;

public class CalendarContacts {

	private Set<Contact> contacts;

	public CalendarContacts() {
		this.contacts = new HashSet<>();
	}
	
	public void addContact(String name, int number) {
		contacts.add(new Contact(name, number));
	}
	
	public void showContacts() {
		System.out.println(contacts);
	}
	
	public Set<Contact> searchByName(String name) {
		Set<Contact> foundByName = new HashSet<>();
		for (Contact c : contacts) {
			if (c.getName().startsWith(name)) {
				foundByName.add(c);
			}
		}
		return foundByName;
	}
	
	public Contact updateNumberContact(String name, int number) {
		Contact contactUpdated = null;
		for (Contact c : contacts) {
			if (c.getName().equals(name)) {
				c.setNumber(number);
				contactUpdated = c;
				break;
			}
		}
		return contactUpdated;
	}
	
	public static void main(String[] args) {
		CalendarContacts c = new CalendarContacts();
		
		c.addContact("JV", 55);
		c.addContact("JF", 85);
		c.addContact("JS", 45);
		
		c.showContacts();
		
		System.out.println(c.searchByName("JF"));
		
		c.updateNumberContact("JV", 56);
		
		c.showContacts();
	}
}
