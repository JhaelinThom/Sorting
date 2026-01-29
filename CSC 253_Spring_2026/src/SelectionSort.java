import java.util.Arrays;

public class SelectionSort {
public void selectionSort(int [] array) {
int myArray [] = { 20, 77, 180, 29, 10, 4, 7902, 19, 0};
int n = myArray.length;
	for (int i = 0; i < n - 1; i++) {
		int min = i;
		
		for (int j = i + 1; j < n; j++) {
			if (myArray[i] > myArray[j]) {
				min = j;
			int	temp = myArray[i];
				myArray[i] = myArray[min];
				myArray[min] = temp;
				
			}
		}
	}
	System.out.println("Selection Method Called: " + Arrays.toString(myArray));

	
}
}
