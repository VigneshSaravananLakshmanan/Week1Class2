package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2) {
		
		return num1+num2;
		// TODO Auto-generated method stub

	}
	
public int subtract(int num1, int num2) {
		
		return num1-num2;
		// TODO Auto-generated method stub

	}

public double mult(int num1, int num2) {
	
	return num1*num2;
	// TODO Auto-generated method stub

}

public static void main(String[] args) {
	
	Calculator calc = new Calculator();
	System.out.println("The sum is "+(calc.add(5, 10)));
	System.out.println("The result of subtraction is "+calc.subtract(10, 5));
	System.out.println("The multiplied value is "+calc.mult(5, 5));
}
	
	

}
