package map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class CalendarContacts {

	private Map<String, Integer> calendarContactMap;

	public CalendarContacts() {
		super();
		calendarContactMap = new HashMap<>();
	}
	
	public void addContact(String name, Integer telephone) {
		calendarContactMap.put(name, telephone);
	}
	
	public void removeContact(String name) {
		if (!calendarContactMap.isEmpty()) {
			calendarContactMap.remove(name);
		}
	}
	
	public void showContacts() {
		System.out.println(calendarContactMap);
	}
	
	public Integer searchByName(String name) {
		Integer numberByName = null;
		if (!calendarContactMap.isEmpty()) {
			numberByName = calendarContactMap.get(name);
		}
		return numberByName;
	}
	
	public static void main(String[] args) {
		CalendarContacts c = new CalendarContacts();
		c.addContact("Jo�o Victor", 85);
		c.addContact("Jo�o Victor", 35);
		c.addContact("Jo�o Pedro", 75);
		c.addContact("Jo�o Yuri", 95);
		
		c.showContacts();
		
		c.removeContact("Jo�o Yuri");
		c.showContacts();
		
		System.out.println(c.searchByName("Jo�o Victor"));
		
	}
}
