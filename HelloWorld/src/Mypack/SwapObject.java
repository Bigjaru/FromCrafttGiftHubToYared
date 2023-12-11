package Mypack;

/**
 * Impossible Swap function in Java
 * @author www.codejava.net
 */
public class SwapObject {
    public static void swap(String s1, String s2) {
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("s1(1) = " + s1);
        System.out.println("s2(1) = " + s2);
    }
    public static void main(String[] args) {
        String s1 = "You";
        String s2 = "Rock";
        swap(s1, s2);
        System.out.println("s1(2) = " + s1);
        System.out.println("s2(2) = " + s2);
    }
}
