package Mypack;

import java.util.Scanner;                      //importing class

class Scannertest {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);       // Scanner object

    System.out.println("Enter your rollno");
    int rollno = sc.nextInt();
    System.out.println("Enter your name");
    String name = sc.next();
    System.out.println("Enter your fee");
    double fee = sc.nextDouble();
    System.out.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);
    sc.close();                              // closing object
  }
}