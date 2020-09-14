package main;

import java.time.Duration;
import java.time.Instant;

import sorting.Sorting;

public class test {

	public static void main(String[] args) {
		
		int[] array = generateArray(10000);
		Instant start = Instant.now();
		Sorting.bubbleSort(array, false);
		
		Instant finish = Instant.now();
		long timeSmall = Duration.between(start, finish).toMillis();
		System.out.println(timeSmall);
		
		//printArray(array);
	}
	
	public static int[] generateArray(int size) {
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		return array;
	}
	
	public static int[] generateArrayAsc(int size) {
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = (int)(Math.random() * 100);
			if(i > 0) {
				array[i] += array[i - 1];
			}
		}
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
