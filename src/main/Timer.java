package main;

public class Timer {
	private long startTime;
	private long endTime;
	
	public Timer() {
		startTime = 0;
		endTime = 0;
	}
	
	public void start() {
		startTime = System.nanoTime();
	}
	
	public void end() {
		endTime = System.nanoTime();
	}
	
	public long getTime(int steps) {
		return (endTime - startTime) / steps;
	}
	
	public void reset() {
		startTime = 0;
		endTime = 0;
	}

}
