import java.util.Arrays;

public class BubbleSort {
	
	public void bubbleSort(int array[]) {
	int myArray1 [] = {23,30,12,8,5,13,22,18,35,21,17,15,2};
	int n = myArray1.length;
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (myArray1[i] > myArray1[j]) {
				int temp = myArray1[i];
				myArray1[i] = myArray1[j];
				myArray1[j] = temp;
			}
		}
	}
	System.out.println("Bubble Method Called: " + Arrays.toString(myArray1));
}
}

