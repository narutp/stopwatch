package stopwatch;

public class TaskTimer {

	public TaskTimer() {}

	public static void measureAndPrint(Runnable runnable) {
		Stopwatch timer = new Stopwatch();
		timer.start();
		runnable.run();
		System.out.println(runnable.toString());
		timer.stop();
		System.out.println("Elapsed time: " + timer.getElapsed() + "\n");
	}
}
