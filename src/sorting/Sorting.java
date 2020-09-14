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

}
