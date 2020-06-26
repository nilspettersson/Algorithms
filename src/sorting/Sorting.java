package sorting;

public class Sorting {
	
	public static int[] bubbleSort(int[] array) {
		
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i + 1]) {
					int swap = array[i];
					array[i] = array[i + 1];
					array[i + 1] = swap;
					sorted = false;
				}
			}
		}
		
		return array;
	}

}
