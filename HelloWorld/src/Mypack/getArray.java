package Mypack;
import java.util.Arrays;
import java.util.Scanner;
public class getArray {
	//public static void main(String args[]) {
	
	
	public String[] getarr() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array : ");
	      int size = sc.nextInt();
	      String tab[] = new String[size];
	      
	      System.out.println("Enter the array elements (Strings): ");
	      for(int i=0; i < size; i++) {
	         tab[i] = sc.next();
	      }
	      System.out.println("The elements of the array" + Arrays.toString(tab));
	      
	      sc.close();
	     // return tab;
	}
public static void main(String args[]) {
	System.out.println("The elements of the array" + tab);
}
}