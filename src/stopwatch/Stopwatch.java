package stopwatch;

import org.omg.Messaging.SyncScopeHelper;

/**
 * A Stopwatch that measures time by using startTime and endTime to calculate
 * the time, or until the present time.
 * 
 * @author Narut Poovorakit
 * @version 27.01.2017
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

	/**
	 * Constructor of Stopwatch
	 */
	public Stopwatch() {
		this.isRunning = false;
	}

	/**
	 * is a method to calculate an elapsed time.
	 * @return a result of elapsed time 
	 */
	public double getElapsed() {
		// return elapsed time since start to current in seconds.
		if (isRunning())
			return (double) ((System.nanoTime() - startTime) * NANOSECONDS);
		else
			return (double) ((stopTime - startTime) * NANOSECONDS);

	}

	/**
	 * is a method that check whether it is running or not.
	 * @return true if it is still running.
	 * false if it is not running.
	 */
	public boolean isRunning() {
		if (isRunning)
			return true;
		return false;
	}

	/**
	 * is a method to start the time by set the startTime.
	 */
	public void start() {
		if (isRunning == false)
			startTime = System.nanoTime();
		isRunning = true;
	}

	/**
	 * is a method to stop the time by set the stopTime.
	 */
	public void stop() {
		if (isRunning == true)
			stopTime = System.nanoTime();
		isRunning = false;
	}

}
