package week1.day2;

public class SwitchOperator {
	
	public static void main(String[] args) {
		
		int num1 = 2;
		int num2= 3;
		String operations = "add";
		int result;
		
		switch(operations) {
		case "add": 
			result = num1+num2;
			System.out.println("The sum of two numbers is: "+result);
		
			break;
			
		case "sub": 
			result = num1-num2;
			System.out.println("The difference between  two numbers is: "+result);
		
			break;
			
		case "mul":
			result = num1*num2;
			System.out.println("The outcome of multiplying the value is "+result);
			break;
			
		case "div":
			result = num1/num2;
			System.out.println("The divided result is "+result);
			break;

		default:
			System.out.println("Other Operations cannot be performed ");
			break;
		}
	}

}
