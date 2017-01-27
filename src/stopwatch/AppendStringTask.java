package stopwatch;

/**
 * Append StringTask is a class to count a letter by using String.
 * @author Narut Poovorakit
 * @version 27.01.2017
 */
public class AppendStringTask implements Runnable {

	/** count is a limit number to count*/
	private int count;

	public AppendStringTask(int count) {
		this.count = count;
	}

	/**
	 * A run method that implements from runnable that calculate the work of each task.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
	}

	/**
	 * is a method that print the word of each task.
	 */
	public String toString() {
		return "Task: Append " + count + " chars to String";
	}
}
