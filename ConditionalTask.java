import java.util.Random;

public class ConditionalTask extends Task{
	
	private Task task1, task2;
	
	public ConditionalTask(Task task1, Task task2) {
		this.task1 = task1;
		this.task2 = task2;
	}
	
	@Override
	public int execute() {
		int executionTime;
		
		Random random = new Random();
		int randomOption = random.nextInt(2);
		
		if(randomOption == 0) {
			executionTime = task1.execute();
		}
		else {
			executionTime = task2.execute();
		}
		return executionTime + 5;
	}
	
	public String toString() {
		return "ConditionalTask("+task1+","+task2+")";
	}
}
