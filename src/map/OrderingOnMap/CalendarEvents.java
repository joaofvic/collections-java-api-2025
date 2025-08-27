package map.OrderingOnMap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CalendarEvents {

	private Map<LocalDate, Event> eventsMap;

	public CalendarEvents() {
		this.eventsMap = new HashMap<>();
	}
	
	public void addEvent(LocalDate date, String name, String attraction) {
		eventsMap.put(date, new Event(name, attraction));
	}
	
	public void showCalendar() {
		Map<LocalDate, Event> calendar = new TreeMap<>(eventsMap);
		System.out.println(eventsMap);
	}
	
	public void getNextEvent() {
		Map<LocalDate, Event> calendar = new TreeMap<>(eventsMap);
		Event nextEvent = null;
		for (Map.Entry<LocalDate, Event> entry : calendar.entrySet()) {
			if (entry.getKey().isAfter(LocalDate.now()) || entry.getKey().isEqual(LocalDate.now())) {
				nextEvent = entry.getValue();
				break;
			}
		}
		System.out.println(nextEvent);
	}
	
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		CalendarEvents cal = new CalendarEvents();
		
		cal.addEvent(LocalDate.parse("28/10/2025", fmt), "GreyDay", "$crim");
		cal.addEvent(LocalDate.parse("07/09/2025", fmt), "RockInRio", "Slipknot");
		cal.addEvent(LocalDate.parse("08/09/2025", fmt), "RDay", "Pantera");
		
		cal.showCalendar();
		
		cal.getNextEvent();
	}
	
}
