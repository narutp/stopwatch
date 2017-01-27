package stopwatch;

/**
 * SumDouble is a class to count by using Double.
 * @author Narut Poovorakit
 * @version 27.01.2017
 */
public class SumDouble implements Runnable {

	static final int ARRAY_SIZE = 500000;
	/** counter is a limit number to count*/
	private int counter;

	public SumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * A run method that implements from runnable that calculate the work of each task.
	 */
	@Override
	public void run() {
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
	}

	/**
	 * is a method that print the word of each task.
	 */
	public String toString() {
		return "Task: Sum array of Double objects with count = " + counter;
	}
}
