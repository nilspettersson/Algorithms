package main;

import java.time.Duration;
import java.time.Instant;

import sorting.Sorting;

public class test {

	public static void main(String[] args) {
		Timer t = new Timer();
		
		//int[] array = generateArray(2000);
		
		int arraySize = 2000;
		
		
		/*Instant startA = Instant.now();
		for(int i = 0; i < 100; i++) {
			int[] array = generateArray(arraySize);
		}
		
		Instant finishA = Instant.now();
		long timeElapsedA = Duration.between(startA, finishA).toMillis();
		System.out.println(timeElapsedA);*/
		
		
		
		int steps = 100;
		
		Instant start = null;
		for(int i = 0; i < steps + 2; i++) {
			if(i == 2) {
				start = Instant.now();
			}
			
			int[] array = generateArray(arraySize);
			Sorting.bubbleSort(array);
			
			
		}
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println(timeElapsed / (steps));
		
		
		//printArray(array);
		//System.out.println(t.getTime(steps) / 1);
	}
	
	public static int[] generateArray(int size) {
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
