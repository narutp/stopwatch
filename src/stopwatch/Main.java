package stopwatch;

/**
 * A main class for run the program 
 * @author Net
 * @version 27.01.2017
 */
public class Main {
	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		System.out.println("Starting task");
		timer.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(i * 2);
		}
		timer.stop();
		System.out.printf("elapsed time = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())
			System.out.println("Timer is still running!");
		else
			System.out.println("Timer is stopped");

		System.out.println("*************************");
		TaskTimer taskTimer = new TaskTimer();
		taskTimer.measureAndPrint(new AppendStringTask(10000));
		taskTimer.measureAndPrint(new AppendStringBuilderTask(1000000));
		taskTimer.measureAndPrint(new SumDoublePrimitive(1000000000));
		taskTimer.measureAndPrint(new SumDouble(1000000000));
		taskTimer.measureAndPrint(new SumBigDecimal(1000000000));

	}

}
