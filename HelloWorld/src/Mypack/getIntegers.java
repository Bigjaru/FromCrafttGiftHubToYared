package Mypack;
import java.util.Arrays;
import java.util.Scanner;

public class getIntegers {
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array : ");
	      int size = sc.nextInt();
	      int tab[] = new int[size];
	      
	      System.out.println("Enter the array elements (integer num): ");
	      for(int i=0; i < size; i++) {
	         tab[i] = sc.nextInt();
	      }
	      System.out.println("The elements of the array" + Arrays.toString(tab));
	      
	   //   int tabl [] = new Arrays.toString(tab);
	    //   int intArr [] = new int(tabl);
	  sc.close();
	  
	}
}
