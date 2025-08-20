package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private List<Task> listTask;

	public TaskList() {
		this.listTask = new ArrayList<>();
	}

	public void addTask(String description) {
		listTask.add(new Task(description));
	}

	public void removeTask(String description) {
		List<Task> tasksToRemove = new ArrayList<Task>();
		for (Task t : listTask) {
			if (t.getDescription().equalsIgnoreCase(description)) {
				tasksToRemove.add(t);
			}
		}
		listTask.removeAll(tasksToRemove);
	}

	public int getNumberTotalTasks() {
		return listTask.size();
	}
	
	public void getDescriptionsTasks() {
		System.out.println(listTask);
	}
	
}
