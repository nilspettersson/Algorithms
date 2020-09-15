package sorting;

public class Sorting {
	
	
	public static int[] bubbleSort(int[] array, boolean asc) {
		boolean sorted = false;
		int remove = 0;
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < array.length - 1 - remove; i++) {
				if(!asc) {
					if(array[i] < array[i + 1]) {
						int swap = array[i];
						array[i] = array[i + 1];
						array[i + 1] = swap;
						sorted = false;
					}
				}
				else {
					if(array[i] > array[i + 1]) {
						int swap = array[i];
						array[i] = array[i + 1];
						array[i + 1] = swap;
						sorted = false;
					}
				}
			}
			remove++;
		}
		
		return array;
	}
	
	public static int[] quickSort(int[] array) {
		int pivotIndex = array.length - 1;
		int startIndex = 0;
		int endIndex = array.length - 2;
		boolean found = false;
		
		while(startIndex < endIndex) {
			int pivot = array[pivotIndex];
			int start;
			
			if(array[startIndex] > array[pivotIndex]) {
				start = array[startIndex];
				found = true;
				while(startIndex < endIndex) {
					if(array[endIndex] < array[pivotIndex]) {
						array[startIndex] = array[endIndex];
						array[endIndex] = start;
						
						break;
					}
					else {
						endIndex--;
					}
				}
			}
			else {
				startIndex++;
			}
		}
		if(found) {
			int start = array[startIndex];
			array[startIndex] = array[pivotIndex];
			array[pivotIndex] = start;
			pivotIndex = startIndex;
		}
		
		if(pivotIndex >= 2) {
			quickSort(array, 0, pivotIndex - 2);
		}
		if((array.length - 1) - (pivotIndex + 1) >= 2) {
			quickSort(array, pivotIndex + 1, array.length - 2);
		}
		return array;
	}
	
	private static void quickSort(int[] array, int startIndex, int endIndex) {
		int s = startIndex;
		int e = endIndex;
		int pivotIndex = endIndex + 1;
		boolean found = false;
		
		while(startIndex <= endIndex) {
			int pivot = array[pivotIndex];
			int start;
			
			if(array[startIndex] > array[pivotIndex]) {
				start = array[startIndex];
				found = true;
				while(startIndex <= endIndex) {
					if(array[endIndex] < array[pivotIndex]) {
						array[startIndex] = array[endIndex];
						array[endIndex] = start;
						
						break;
					}
					else {
						endIndex--;
					}
				}
			}
			else {
				startIndex++;
			}
		}
		if(found) {
			int start = array[startIndex];
			array[startIndex] = array[pivotIndex];
			array[pivotIndex] = start;
			pivotIndex = startIndex;
		}
		
		if((pivotIndex) - s >= 2) {
			quickSort(array, s, pivotIndex - 2);
		}
		if((e + 1) - (pivotIndex) >= 2) {
			quickSort(array, pivotIndex + 1, e);
		}
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	

}
