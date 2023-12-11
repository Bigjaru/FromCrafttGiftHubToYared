package Mypack;

import java.util.Arrays;
import java.util.Scanner;

public class SortwMethods {
	int [] enteredArray;
	
	SortwMethods () {
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter the size of an array");
		int arraySize = in.nextInt();

		int enteredArray[] = new int[arraySize];

		System.out.println("pls enter the element of an array");
		for (int i = 0; i < enteredArray.length; i++) {
			System.out.println("the element input at index : " + i + " is " + (enteredArray[i] = in.nextInt()));
		
			System.out.println("The elements of the array is: " + Arrays.toString(enteredArray));
				}
		
	}
	
//public void main(String[] args) {
	// TODO Auto-generated method stub
	
    //System.out.println();
	//getintegers();
   // System.out.println("The elements of the array in the order it was entered" + Arrays.toString(enteredArray));
	//printArray(enteredArray);
	//System.out.println();
	//sortArray(enteredArray);
//}	
}