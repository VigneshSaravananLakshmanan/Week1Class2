package week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] set1 = {3,2,11,4,6,7};
		int[] set2 = {1,2,8,4,9,7};
		int length =set1.length;
		String result = "";
		
		for (int i=0; i< length; i++)
		{
			for (int j=0; j< length; j++)
				
				if (set1[i]==set2[j])
				{
					
					System.out.println("The intersected value is "+set1[i]);  
					
					/* the integer array value is converted into string using concatenation +"". this is to print the results
					 * in a single line eg: 1, 4, 7 */
					result = result+set1[i] +""+",";
				}
		}
		
		System.out.println("The missing numbers are "+result);
		
		
	}
	
	

}
