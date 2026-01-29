import java.util.Arrays;

public class InsertionSort {
public void insertionSort(int myArray[] ) {
	int array [] = {10 , 8 , 9001, 2, 58};
	
	for (int i = 1; i < array.length; i++) {
		int key = array[i];
		int j = i - 1;
		while (j>=0 && array[j] > key) {
			array[j + 1] = array[j];
			j = j -1;
		}
		array[j+1] = key;
	}
	System.out.println("Insertion Sort: " + Arrays.toString(array));
	}
}
