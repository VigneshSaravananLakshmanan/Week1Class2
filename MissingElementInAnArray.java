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
		
		/*Required clarification
		 * int[] sorted = Arrays.sort(arr); */
		
//		
//		for (int i=1; i<=length;i++)
//		{
//			while(i!=arr[i-1])
//			{
//				System.out.println(i);
//				
//			}
			
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
