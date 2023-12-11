package Mypack;


//Java program to sort the elements in descending order
import java.util.*;

class GFG {
	public static void main(String[] args){

		// Initializing the array
		int array[] = { 10, 2, 3, 40, 5, 6 };

		// Sorting the array in ascending order
		Arrays.sort(array);

		// Printing the elements
		System.out.println(Arrays.toString(array));		
		// Reversing the array
		reverse(array);

		// Printing the elements
		System.out.println(Arrays.toString(array));
		
	}

	public static void reverse(int[] array){

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
	}
}
