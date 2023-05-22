import java.util.ArrayList;

public class BlockTask extends Task{

	private ArrayList<Task> tasks;
	
	public BlockTask() {
		this.tasks = new ArrayList<Task>();
	}
	
	public void insert(Task t) {
		tasks.add(t);
	}
	
	public void removeTask(Task t) {
		tasks.remove(t);
	}
	
	@Override
	public int execute() {
		int executionTime = 0;
		for(Task t : tasks) {
			executionTime += t.execute();
		}
		return executionTime;
	}

	@Override
	public String toString() {
		String blockString = "Block(";
		for(Task t : tasks) {
			blockString += t.toString();
		}
		return blockString+")";
	}

}
