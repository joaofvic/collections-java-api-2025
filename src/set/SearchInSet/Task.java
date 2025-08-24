package set.SearchInSet;

public class Task {

	private String description;
	private boolean status;
	
	public Task(String description, boolean status) {
		this.description = description;
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "\n" + description + " " + status ;
	}
	
	
}
