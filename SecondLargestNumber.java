package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		int length = data.length;
		System.out.println(length);
		
		/*This is to sort the given numbers of an Array*/
		Arrays.sort(data);
		
		System.out.println("The second largest number is "+data[length-2]);
	}

}
