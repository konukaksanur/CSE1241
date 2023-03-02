/**The purpose of this program is to checks ISBN-10, and to calculate the last digit, tenth digit,
 using the other nine digits.*/
import java.util.Scanner; // Scanner is in the java.util.Scanner package

	public class HW2_150120049_P1 {
		public static void main (String[]args) {
			
			// Create a scanner object
			Scanner input = new Scanner(System.in);
			
			//Prompt to user to enter the number
			System.out.print("Enter the first 9 digits of an ISBN as integer: ");
			int  number = input.nextInt();
			
			//Find each digit of the number entered from the user using remainder and division operator
			int digit9 = number % 10;
			int digit8 = number % 100 / 10;
			int digit7 = number % 1000 / 100;		
			int digit6 = number % 10000 / 1000;
			int digit5 = number % 100000 / 10000;
			int digit4 = number % 1000000 / 100000;
			int digit3 = number % 10000000 / 1000000;
			int digit2 = number % 100000000 / 10000000;
			int digit1 = number % 100000000 / 100000000;
			
			// Calculate the last digit by using following formula 
			int digit10 = (digit1*1 + digit2*2+ digit3*3+ digit4*4+ digit5*5+ digit6*6+ digit7*7+ digit8*8+ digit9*9)%11;
			
			//Display the ISBN-10 with tenth digit, Write "X" to tenth digit  if the calculation of tenth digit is equal to 10
			if (digit10==10)
				System.out.println ("The ISBN-10 number is: " + digit1 + digit2+ digit3+ digit4+ digit5+ digit6+ digit7+ digit8+ digit9 + "X");
			// Display the ISBN-10 with tenth digit, Write the result of calculation to the tenth digit "X" if the calculation of tenth digit is not equal to 10
			else
				System.out.println ("The ISBN-10 number is: " + digit1 + digit2+ digit3+ digit4+ digit5+ digit6+ digit7+ digit8+ digit9 + digit10);
		}
  }