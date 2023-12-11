package icraft.loop;

public class forloopdemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	//It will Display odd numbers from 1 ... 49	
		
		for(int i=0; i<=50; i++) {
			
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
		

////		1 2 3 4 5
////		1 2 3 4 5
////		1 2 3 4 5
////		1 2 3 4 5
////		1 2 3 4 5
		
		
		for(int i=1; i<=5; i++) {
			
			
			for(int j=1; j<=5; j++) {
				
				System.out.print(j + " ");
			}
			
			
			System.out.println();
		}
		
		System.out.println();
//		
//		
////		1
////		1 2
////		1 2 3
////		1 2 3 4
////		1 2 3 4 5
//		
//		
//            for(int i=1; i<=5; i++) 
//            {
//			
//			
//			for(int j=1; j<=i; j++) {
//				
//				System.out.print(j + " ");
//			}
//			
//			
//			System.out.println();
//		}
//		
//            System.out.println();
//		
//		
//		
//		
//		
////		*
////		* * 
////		* * *
////		* * * *
////		* * * * *
////        * * * * * *
//         
//		
		for(int i=1; i<=5; i++) 
            {
			
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			
			
			System.out.println();
		}   
		
		System.out.println(); 
//            
//            
//            
//            
//            
//            
//            
////		* * * *
////		* * * *
////		* * * *
////		* * * *
//		       
//            
            for(int i=1; i<=4; i++) {
    			
    			
    			for(int j=1; j<=4; j++) {
    				
    				
    				System.out.print("* ");
   				
    			}
    			
    			
    			System.out.println();
    		}    
            
            
            System.out.println();
//               
//		
////		* * * *
////		*     *
////		*     *
////		* * * *
//		
		
             for(int i=1; i<=4; i++) {
    			
    		
    			for(int j=1; j<=4; j++) {
    				
    				
    				if(i==1 || i==4 || j==1 || j==4)
    				System.out.print("*");
    				
    				else
    				System.out.print(" ");
   				
    			}
    			
    			
    			System.out.println();
    		}    

		
	}

	
}
