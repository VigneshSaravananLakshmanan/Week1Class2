package week1.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int number = 13;
		boolean flag = false;
		
		for ( int i = 2; i<number;i++)
		{
			 while((number%i)==0)
			 {
				 flag = true;
			     break;
		      } 
		
	     }
		
		if(flag == true)
		{ 
			System.out.println("Its not a prime number");
		}
		else
		{
			System.out.println("Its a prime number");

		}
		
}
}
