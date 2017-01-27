package stopwatch;

public class AppendStringBuilderTask implements Runnable {

	private int count;

	public AppendStringBuilderTask(int count) {
		this.count = count;
	}

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

	public String toString() {
		return "Task: Append " + count + " chars to StringBuilder";
	}
}
