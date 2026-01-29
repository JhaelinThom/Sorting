import java.util.Arrays;

public class mainRunFile {

public static void main(String[] args) {
	
//1. Public means it can be accessed by anyone 
//2. Static means the entire class has access to it and the instances within it 
//3. Void means it shouldn't return anything 
//4. Main method means its where our file will run 
	
int myArray [] = {1, 23,3000,12,8,5,13,22,18,35,21,17,15,2};


BubbleSort myBubble = new BubbleSort(); //Instance variable 
myBubble.bubbleSort(myArray);

SelectionSort myMin = new SelectionSort(); // Instance variable 
myMin.selectionSort(myArray);

InsertionSort myInsert = new InsertionSort(); //Instance variable 
myInsert.insertionSort(myArray);
		
	}

/* I could likely add a for each loop in here and call each one for easier printing
 * First lesson for DSA so far, will need to upload Linked Lists next 
 */


	}
