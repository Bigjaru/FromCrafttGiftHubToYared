package Mypack;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
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
		// Reversing the array
				//reverse(array);
		reverseArray(enteredArray);
				// Printing the elements
				System.out.println("The elements of the array in reverse: " +Arrays.toString(enteredArray));
		

	}

	public static void printArray(int[] Array) {
		// TODO Auto-generated method stub
	System.out.println("The elements of the array: " + Arrays.toString(Array));	

	}
	public static void reverseArray(int[] Array) {
		// TODO Auto-generated method stub
		
	// The entered array in reverse order 
		// Length of the array
				int n = Array.length;

				// Swapping the first half elements with last half
				// elements
				for (int i = 0; i < n / 2; i++) {

					// Storing the first half elements temporarily
					int temp = Array[i];

					// Assigning the first half to the last half
					Array[i] = Array[n - i - 1];

					// Assigning the last half to the first half
					Array[n - i - 1] = temp;
				}
	}
}

