/**The purpose of this program is to calculate the compound monthly interest according to the information received from user*/

import java.util.Scanner; // Scanner is in the java.util.Scanner package

public class HW_150120049_P3 {

	public static void main(String[] args) {
		
		//  Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt to user to entire the initial principal amount
		System.out.print("Enter initial principal amount in TL/USD, etc: ");
		double initialPrincipal = input.nextDouble();

		// Prompt to user to entire the annual interest rate
		System.out.print("Enter annual interest rate (e.g. 9.45): ");
		double annualInterestRate = input.nextDouble();
		
		// Prompt to user to entire the number of time periods in months
		System.out.print("Enter number of time periods in months: ");
		double numberOfTimePeriods = input.nextDouble();
		
		// Compute the monthly interest rate percentage 
		double monthlyInterestRatePercentage = (annualInterestRate / 12);
		
		// Compute the final balance amount in TL/USD, etc.
		double finalBalanceAmount = (initialPrincipal * Math.pow(1 + annualInterestRate / 1200,numberOfTimePeriods));
		
		//Compute the total compound interest amount in TL/USD, etc.
		double totalCompoundinterestAmount =(finalBalanceAmount - initialPrincipal);
		
		// Stay blank between input part received from users and output displayed
		System.out.println();
		
		//Display results
		// To display 2 digits after the decimal point, multiply by 100 and return the double value to the integer value, divide by 100.0 
		System.out.println("Initial principal amount: "+ initialPrincipal);
		System.out.println("Monthly interest rate: "+ ((int)(monthlyInterestRatePercentage*100)/100.0));
		System.out.println("Total compound interest amount: "+ ((int)(totalCompoundinterestAmount*100)/100.0));
		System.out.println("Final balance amount: "+ ((int)(finalBalanceAmount*100)/100.0));
								
	}

}
