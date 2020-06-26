package main;

import sorting.Sorting;

public class test {

	public static void main(String[] args) {
		Timer t = new Timer();
		int[] array = generateArray(100);
		t.start();
		array = Sorting.bubbleSort(array);
		t.end();
		printArray(array);
		System.out.println(t.getTime()/1000000);
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
