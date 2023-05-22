
public class SimulatorTasksSystem {

	public static void main(String[] args) {
		
		SimpleTask simpleTask1 =  new SimpleTask(155);
		SimpleTask simpleTask2 = new SimpleTask(5);
		SimpleTask simpleTask3 = new SimpleTask(4);

		BlockTask blockTask = new BlockTask();
		blockTask.insert(simpleTask2);
		blockTask.insert(simpleTask3);
		
		ConditionalTask conditionalTask = new ConditionalTask(simpleTask1, blockTask);
		System.out.println(conditionalTask);
		
		System.out.println(conditionalTask.execute());
	}

}
