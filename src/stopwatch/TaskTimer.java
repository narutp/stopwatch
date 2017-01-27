package stopwatch;

/**
 * TaskTimer is a class for control the stopwatch and print the time of each task.
 * @author Narut Poovorakit
 * @version 27.01.2017
 */
public class TaskTimer {

	/**
	 * A constructor of TaskTimer.
	 */
	public TaskTimer() {}

	/**
	 * is a method for control the time and print the time.
	 * @param runnable
	 */
	public static void measureAndPrint(Runnable runnable) {
		Stopwatch timer = new Stopwatch();
		timer.start();
		runnable.run();
		System.out.println(runnable.toString());
		timer.stop();
		System.out.println("Elapsed time: " + timer.getElapsed() + "\n");
	}
}
