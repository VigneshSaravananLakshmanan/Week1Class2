package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		/*Sorting the array in ascending order where Array is a class and sort is a method of the class */
		Arrays.sort(arr);
		
		/* To find the length of the array the property arrayname.length is used which returns an integer value*/
		int length = arr.length;
		
		int firstnum = arr[0];
		int lastnum = arr[length-1];
		
		/* Inorder to find the missing number, the current number is compared with a next number ie, current number+1)*/
		
		int nextnum = firstnum+1;
		
		while(nextnum<=lastnum)
		{
			/*Binary search method of the class is used to search for  the vaues within the array and compare it with the value to be identified. If
			 * the condition matches, then it will return the index value of the array. if it doesnt match, then the value -1 will be returned.(/
			 */
			if (Arrays.binarySearch(arr, nextnum)<0)
			{
				System.out.println("The missing number is "+nextnum);
			}
			nextnum++;
		}
			
			
		}
		
		
	}

