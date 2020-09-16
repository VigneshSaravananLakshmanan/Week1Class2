package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		int length = arr.length;
		
		/*for(int i=0; i< length-1; i++)
		{
			System.out.println(arr[i]);
		}*/
		
		/*Required clarification - Arrays.sort() will sort the array in ascending order. Is it possible to 
		 * save the result in another array ?
		 * for eg:
		 * int[] sorted = Arrays.sort(arr); */
		
//		
		
		/* Required Clarification: When I use the while statement, I am not getting the expected result. But on using the if loop in the below
		 * code, the result is acheived. I am unable to plot the exact issue as for me both these functionality almost looks similar.
		 */
//		for (int i=1; i<=length;i++)
//		{
//			while(i!=arr[i-1])
//			{
//				System.out.println(i);
//				
//			}
		
		/*Required assistance on how to set the break points and debug the flows*/
			
			for (int i=1; i<=length;i++)
			{
				if(i!=arr[i-1])
				{
					System.out.println(i);
					break;
					
				}
			
			
		}
		
		
	}


}
