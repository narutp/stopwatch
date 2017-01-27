package stopwatch;

import java.math.BigDecimal;

/**
 * SumBigDecimal is a class to count by using BigDecimal.
 * @author Narut Poovorakit
 * @version 27.01.2017
 */
public class SumBigDecimal implements Runnable {

	static final int ARRAY_SIZE = 500000;
	/** counter is a limit number to count*/
	private int counter;

	public SumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * A run method that implements from runnable that calculate the work of each task.
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
	}

	/**
	 * is a method that print the word of each task.
	 */
	public String toString() {
		return "Task: Sum array of BigDecimal with count = " + counter;
	}

}
