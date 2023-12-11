package Mypack;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
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
		System.out.println("The Minimum element in the given array is: " + findMinArray(enteredArray));
		
	}

	public static void printArray(int[] Array) {
		// TODO Auto-generated method stub
	System.out.println("The elements of the array are: " + Arrays.toString(Array));	

	}
	public static int findMinArray(int[] Array) {
		// TODO Auto-generated method stub
		
	// The minimum value in the array 
		int i; 
		
		// Initialize minimum element 
		int min = Array[0]; 
		
		// Traverse array elements from second and 
		// compare every element with current min 
		for (i = 1; i < Array.length; i++) 
			if (Array[i] < min) 
				min = Array[i]; 
		
		return min;
		
	}
}

