package Mypack;
//import java.util.Scanner; 

//public class InputArray {
//	public static void main(String args[]){

//	 Scanner keyboard = new Scanner (System.in); 
//	 System.out.println("enter an integer"); 
//	 int myint = keyboard.nextInt ();
//}
//}
import java.util.Scanner;

public class InputArray{
   public static void main(String args[]){

   //Scanner scan= new Scanner(System.in);

   //For string

  // String text= scan.nextLine();

 //  System.out.println(text);

   //for int
   Scanner input = new Scanner(System.in);
   System.out.print("Enter something > ");
   String inputString = input.nextLine();
   System.out.print("You entered : ");
   System.out.println(inputString);
   input.close();
   
   
   
   
  // System.out.println("Enter your rollno");
  // int num= scan.nextInt();

   //System.out.println(num);
   //scan.close();
   }
}