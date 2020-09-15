package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
	int initial = 153;
	int temp = initial;
	int finall = 0;
	int result;
	
	while (temp>0) {
		result = temp%10;
		 finall = finall+ (result*result*result);
		  temp = temp/10;
		
	}
	if(finall==initial)
	{
		System.out.println("The given number is an Armstrong number");
	}
	
	else {
		System.out.println("The given number is not a valid number");
	}
	
		
		

}

	
}