package set.SearchInSet;

import java.util.HashSet;
import java.util.Set;

public class ListTask {

	private Set<Task> taskList;

	public ListTask() {
		this.taskList = new HashSet<>();
	}
	
	public void addTask(String description) {
		taskList.add(new Task(description, false));
	}
	
	public void removeTask(String description) {
		Task taskRemove = null;
		for (Task t : taskList) {
			if (t.getDescription().equals(description)) {
				taskRemove = t;
				break;
			}
		}
		taskList.remove(taskRemove);
	}
	
	public void showTasks() {
		System.out.println(taskList);
	}
	
	public int countTasks() {
		return taskList.size();
	}
	
	public Set<Task> getTasksCompleted() {
		Set<Task> tasksCompleted = new HashSet<>();
		for (Task t : taskList) {
			if (t.isStatus()) {
				tasksCompleted.add(t);
			}
		}
		return tasksCompleted;
	}
	
	public Set<Task> getTasksPending() {
		Set<Task> tasksPending = new HashSet<>();
		
		for (Task t : taskList) {
			if (t.isStatus() == false) {
				tasksPending.add(t);
			}
		}
		return tasksPending;
	}
	
	public void markTaskCompleted(String description) {
		for (Task t : taskList) {
			if (t.getDescription().equals(description)) {
				t.setStatus(true);
			}
		}
	}
	
	public void markTaskPending(String description) {
		for (Task t : taskList) {
			if (t.getDescription().equals(description)) {
				t.setStatus(false);
			}
		}
	}
	
	public void clearTaskList() {
		taskList.clear();
	}
	
	public static void main(String[] args) {
		ListTask l = new ListTask();
		
		l.addTask("Estudar Java");
		l.addTask("Fazer exercícios físicos");
		l.addTask("Organizar a mesa de trabalho");
		l.addTask("Ler livro");
		l.addTask("Preparar apresentação");
		
		l.showTasks();
		
		l.removeTask("Fazer exercícios físicos");
		l.showTasks();
		
		System.out.println(l.countTasks());
		
		System.out.println(l.getTasksPending());
		
		l.markTaskCompleted("Ler livro");
		l.markTaskCompleted("Estudar Java");
		
		System.out.println("====================");
		
		System.out.println(l.getTasksCompleted());
		
		l.markTaskPending("Estudar Java");
		l.showTasks();
		
		l.clearTaskList();
		l.showTasks();
		
	}
	
}
