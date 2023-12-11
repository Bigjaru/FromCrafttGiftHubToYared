package Mypack;
import java.util.Arrays;
import java.util.Scanner;

public class SortandPrintArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//getintegers();
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter the size of an array");
		int arraySize = in.nextInt();

		int enteredArray[] = new int[arraySize];

		System.out.println("pls enter the element of an array");
		for (int i = 0; i < enteredArray.length; i++) {
			System.out.println("the element input at index : " + i + " is " + (enteredArray[i] = in.nextInt()));
		}

		System.out.println();

		printArray(enteredArray);
		System.out.println();
		sortArray(enteredArray);
		sortAdescending(enteredArray);

	}

	public static void printArray(int[] Array) {
		// TODO Auto-generated method stub
	System.out.println("The elements of the array in the order it was entered" + Arrays.toString(Array));	

	}
	public static void sortArray(int[] Array) {
		// TODO Auto-generated method stub
		
	// Sorting the array in ascending order
		Arrays.sort(Array);
		// Printing the elements
		System.out.println("The elements of the array sorted in ascending order" + Arrays.toString(Array));	
	}
		
	public static void sortAdescending(int[] array){

		// Length of the array
		int n = array.length;

		// Swapping the first half elements with last half
		// elements
		for (int i = 0; i < n / 2; i++) {

			// Storing the first half elements temporarily
			int temp = array[i];

			// Assigning the first half to the last half
			array[i] = array[n - i - 1];

			// Assigning the last half to the first half
			array[n - i - 1] = temp;
		}
		System.out.println("The elements of the array sorted in descending order" + Arrays.toString(array));
	}
	
}
