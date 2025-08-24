package set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class SetGuests {

	private Set<Guest> guestSet;

	public SetGuests() {
		this.guestSet = new HashSet<>();
	}
	
	public void addGuest(String name, int invitationCode) {
		guestSet.add(new Guest(name, invitationCode));
	}
	
	public void removeGuest(int invitationCode) {
		Guest guestToRemove = null;
		for (Guest e : guestSet) {
			if (e.getInvitationCode() == invitationCode) {
				guestToRemove = e;
				break;
			}
		}
		guestSet.remove(guestToRemove);
	}
	
	public int countGuest() {
		return guestSet.size();
	}
	
	public void showGuest() {
		System.out.println(guestSet);
	}
	
	public static void main(String[] args) {
		SetGuests s = new SetGuests();
		
		s.addGuest("J", 1);
		s.addGuest("J", 2);
		s.addGuest("V", 5);
		s.addGuest("f", 4);
		s.addGuest("f", 4);
		System.out.println(s.countGuest());
		
		s.showGuest();
		
		s.removeGuest(2);
		s.showGuest();
		
		System.out.println(s.countGuest());
		
		
	}
}
