import java.util.Arrays;

public class InsertionSort {
public void insertionSort(int myArray[] ) {
	int array [] = {10 , 8 , 9001, 2, 58};
	
	for (int i = 1; i < array.length; i++) {
		int key = array[i]; //The position we're looking at to compare values 
		int sorted = i - 1; //Storing the one already sorted 
		while (sorted >=0 && array[sorted] > key) {
			array[sorted + 1] = array[sorted];
			sorted = sorted - 1;
		}
		array[sorted+1] = key;
	}
	System.out.println("Insertion Sort: " + Arrays.toString(array));
	}
}
