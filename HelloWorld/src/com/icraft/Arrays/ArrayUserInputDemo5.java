package com.icraft.Arrays;
import java.util.Scanner;
public class ArrayUserInputDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("pls enter the size of an array");
		int arraySize = in.nextInt();

		int nameOfStudent[] = new int[arraySize];

		System.out.println("pls enter the element of an array");
		for (int i = 0; i < nameOfStudent.length; i++) {
			System.out.println("the element input at index : " + i + " is " + (nameOfStudent[i] = in.nextInt()));
		}

		System.out.println();

		for (int j = 0; j < nameOfStudent.length; j++) {
			System.out.println("the element output at index : " + j + " is " + nameOfStudent[j]);
		}

	}
}
