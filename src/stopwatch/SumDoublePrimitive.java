package stopwatch;

/**
 * SumDoublePrimitive is a class to count a letter by using String.
 * @author Narut Poovorakit
 * @version 27.01.2017
 *
 */
public class SumDoublePrimitive implements Runnable {

	static final int ARRAY_SIZE = 500000;
	/** counter is a limit number to count*/
	private int counter;

	public SumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * A run method that implements from runnable that calculate the work of each task.
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		double sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	/**
	 * is a method that print the word of each task.
	 */
	@Override
	public String toString() {
		return "Task: Sum array of double primitives with count = " + counter;
	}

}
