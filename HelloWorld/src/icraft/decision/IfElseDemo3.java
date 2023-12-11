package icraft.decision;

public class IfElseDemo3 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int mark=95;
			
			if(mark>=90 && mark<=100) {
				System.out.println("grade A+");
			}
			else if(mark>=80 && mark<90) {
				System.out.println("grade A");
			}
			else if(mark>=70 && mark<80 ) {
				System.out.println("grade B");
			}
			else if(mark>=60 && mark<70) {
				System.out.println("grade C");
			}
			else if (mark>=50 && mark<60) {
				System.out.println("grade D");
			}
			else if (mark>=40 && mark<50) {
				System.out.println("grade Fx");
			}
			else if (mark<40) {
				System.out.println("Fail");
			}
			else{
				System.out.println("INVALID INPUT");
			}
			
			
		}

}
