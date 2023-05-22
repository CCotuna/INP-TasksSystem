
public class SimpleTask extends Task{
	
	private int executionTime;

	public SimpleTask(int executionTime) {
		this.executionTime = executionTime;
	}
	
	public void changeTime(int newExecutionTime) {
		this.executionTime = newExecutionTime;
	}
	
	public String toString() {
		return "SimpleTask("+executionTime+")";
	}

	@Override
	public int execute() {
		return executionTime;
	}
	
	
}
