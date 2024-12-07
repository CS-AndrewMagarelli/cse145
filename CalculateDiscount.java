package ball;
import java.util.Scanner;


public class CalculateDiscount {
	
	public static final int PACKAGE_PRICE = 99;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Please enter the total number of software packages you're ordering: ");
		
		int packageCount = key.nextInt();

		
		
		if (packageCount <= 0) {
			System.exit(0);
		}
		double totalCost = packageCount * PACKAGE_PRICE;
		if ((packageCount >= 1) && (packageCount <= 9)) {
			
			System.out.println("You don't qualify for a discount, your total is $" + totalCost);
		
		}else if ((packageCount >= 10) && (packageCount <= 19)) {
			double amountDiscount1 = totalCost * .20;
			System.out.println("Your cost before a discount is $" + totalCost);
			System.out.println("You qualify for a 20 percent discount your discount is $" + amountDiscount1);
			System.out.println("Your new total is $" + (totalCost - amountDiscount1));
		
		}else if ((packageCount >= 20) && (packageCount <= 49)) {
			double amountDiscount2 = totalCost * .30;
			System.out.println("Your cost before a discount is $" + totalCost);
			System.out.println("You qualify for a 30 percent discount your discount is $" + amountDiscount2);
			System.out.println("Your new total is $" + (totalCost - amountDiscount2));
		}else if ((packageCount >= 50) && (packageCount <= 99)) {
			double amountDiscount3 = totalCost * .40;
			System.out.println("Your cost before a discount is $" + totalCost);
			System.out.println("You qualify for a 40 percent discount your discount is $" + amountDiscount3);
			System.out.println("Your new total is $" + (totalCost - amountDiscount3));
		}else {
			double amountDiscount4 = totalCost * .50;
			System.out.println("Your cost before a discount is $" + totalCost);
			System.out.println("You qualify for a 50 percent discount your discount is $" + amountDiscount4);
			System.out.println("Your new total is $" + (totalCost - amountDiscount4));

		}
	}

}
