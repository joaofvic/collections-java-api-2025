package set.BasicOperations;

import java.util.Objects;

public class Guest {

	private String name;
	private int invitationCode;
	
	public Guest(String name, int invitationCode) {
		this.name = name;
		this.invitationCode = invitationCode;
	}

	public String getName() {
		return name;
	}

	public int getInvitationCode() {
		return invitationCode;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(invitationCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return invitationCode == other.invitationCode;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", invitationCode=" + invitationCode + "]";
	}
	
}
