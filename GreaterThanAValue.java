package ball;

import java.util.Scanner;

public class GreaterThanAValue {
	
	public static final int VALUE = 1000;
	
	public static void main(String[] args) {
		
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int number = key.nextInt();
		
		if(number > VALUE)
		{
			System.out.println("The number you entered is greater than 1000!");
		
		}
		else
		{
			
			System.out.println("The number you entered is not greater than 1000!");
			
		}	
	}
}
