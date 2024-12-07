package ball;
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		
		String sentence = key.nextLine();
		
		int letterCount = sentence.length();
		
		System.out.println("Length of the sentence entered by the user is: + letterCount");
		
		int ind = sentence.indexOf("c");
		
		System.out.println("Index of the letter \"c\" is: " + ind);
		
		String sub1 = sentence.substring(0,6);
		
		System.out.println("Substring1: "+ sub1);
		
		String sub2 = sentence.substring(9,13);
		
		System.out.println("Substring2: "+ sub2);
		
		String sub3 = sentence.substring(16);
		
		System.out.println("Substring3: "+ sub3);
		
		char ch = sentence.charAt(14);
		
		System.out.println("Character at index 14 is:" + ch);

		System.out.println("Enter the number of days in a week: ");

		int daysCount = key.nextInt();
		
		System.out.println("There are" + daysCount+"days in a week");

		System.out.println("Do you like icecream? Enter \"true\" or \"false\": );"
		
		boolean response = key.nextBoolean();
		
		System.out.println(response);


		

	}

}
