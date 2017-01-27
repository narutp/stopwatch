package stopwatch;

/**
 * Append StringBuilderTask is a class to count a letter by using StringBuilder.
 * @author Narut Poovorakit
 * @version 27.01.2017
 *
 */
public class AppendStringBuilderTask implements Runnable {
	/** count is a limit number to count*/
	private int count;

	/**
	 * A constructor of AppendStringBuilderTask
	 * @param count is a limit number to count
	 */
	public AppendStringBuilderTask(int count) {
		this.count = count;
	}

	/**
	 * A run method that implements from runnable that calculate the work of each task.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		String result = builder.toString();
	}

	/**
	 * is a method that print the word of each task.
	 */
	public String toString() {
		return "Task: Append " + count + " chars to StringBuilder";
	}
}
