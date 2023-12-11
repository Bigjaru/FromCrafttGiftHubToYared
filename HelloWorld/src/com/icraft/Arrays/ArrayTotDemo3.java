package com.icraft.Arrays;

public class ArrayTotDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] studentMarks = { 67, 78, 80, 95, 55, 77 };

		totalCalc(studentMarks);

	}

	private static void totalCalc(double[] marks) {
		// TODO Auto-generated method stub
		double total = 0;
//		for(double i:marks) 
//		{
//			total = total+i;
//		}

		for (int i = 0; i < marks.length; i++) {

			total = total + marks[i];
		}

		System.out.println("The total of student mark is : " + total);

	}

}
