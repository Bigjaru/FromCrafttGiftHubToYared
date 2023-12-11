package icraft.decision;
import java.util.Scanner;
public class SwitchDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("pls enter any letter: ");
		
		char letter = input.next().charAt(0);
		
		switch(letter) {
		
		case 'A':
			System.out.println("you entered vowel letter");
			break;
		case 'E':
			System.out.println("you entered vowel letter");
			break;
		case 'I':
			System.out.println("you entered vowel letter");
			break;
		
		case 'O':
			System.out.println("you entered vowel letter");
			break;	
		case 'U':
			System.out.println("you entered vowel letter");
			break;	
		case 'a':
			System.out.println("you entered vowel letter");
			break;
		case 'e':
			System.out.println("you entered vowel letter");
			break;
		case 'i':
			System.out.println("you entered vowel letter");
			break;	
		case 'o':
			System.out.println("you entered vowel letter");
			break;	
		case 'u':
			System.out.println("you entered vowel letter");
			break;		
			
		default:
			System.out.println("you entered consonant letter");
			
			
		}
		
		
	}
}
