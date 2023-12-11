package Mypack;

//Java Program to find maximum in arr[] 
	class FindMin 
	{ 
		static int arr[] = {10, 324, 45, 90, 9808}; 
		
		// Method to find minimum in arr[] 
		static int smallest() 
		{ 
			int i; 
			
			// Initialize minimum element 
			int min = arr[0]; 
			
			// Traverse array elements from second and 
			// compare every element with current max 
			for (i = 1; i < arr.length; i++) 
				if (arr[i] < min) 
					min = arr[i]; 
			
			return min; 
		} 
		
		// Driver method 
		public static void main(String[] args) 
		{ 
			System.out.println("Smallest in given array is " + smallest()); 
			} 
	} 
