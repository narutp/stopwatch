package stopwatch;

import org.omg.Messaging.SyncScopeHelper;

/**
 * A Stopwatch that measures time by using startTime and endTime to calculate
 * the time, or until the present time.
 * 
 * @author Narut Poovorakit
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stoped, in nanoseconds. */
	private long stopTime;
	/** to check whether it is running or not. */
	private boolean isRunning;

	public Stopwatch() {
		this.isRunning = false;
	}

	public double getElapsed() {
		// return elapsed time since start to current in seconds.
		if (isRunning())
			return (double) ((System.nanoTime() - startTime) * NANOSECONDS);
		else
			return (double) ((stopTime - startTime) * NANOSECONDS);

	}

	public boolean isRunning() {
		if (isRunning)
			return true;
		return false;
	}

	public void start() {
		if (isRunning == false)
			startTime = System.nanoTime();
		isRunning = true;
	}

	public void stop() {
		if (isRunning == true)
			stopTime = System.nanoTime();
		isRunning = false;
	}

}
