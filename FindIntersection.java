package week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] set1 = {3,2,11,4,6,7};
		int[] set2 = {1,2,8,4,9,7};
		int length =set1.length;
		
		for (int i=0; i< length; i++)
		{
			for (int j=0; j< length; j++)
				
				if (set1[i]==set2[j])
				{
					/* Clarification: how to print the result in one single line? for example -The intersected value is 1,4, 7 */
					System.out.println("The intersected value is "+set1[i]);
				}
		}
		
		
		
	}
	
	

}
