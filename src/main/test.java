package main;

import java.time.Duration;
import java.time.Instant;

import sorting.Sorting;

public class test {

	public static void main(String[] args) {
		
		int[] array = generateArray(100000);
		printArray(array);
		System.out.println("");
		//int[] array = new int[] {2,3,5,1,4,9};
		Instant start = Instant.now();
		//Sorting.bubbleSort(array, true);
		Sorting.quickSort(array);
		
		Instant finish = Instant.now();
		long timeSmall = Duration.between(start, finish).toMillis();
		printArray(array);
		
		System.out.println("");
		System.out.println(timeSmall);
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
			System.out.print(array[i] + " ");
		}
	}

}
