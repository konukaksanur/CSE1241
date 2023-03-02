/**The purpose of this program is to convert a date given in days to �Year: <years>, Month: <months>, Day: <days>� format*/

import java.util.Scanner; // Scanner is in the java.util.Scanner package

public class HW_150120049_P2 {
	public static void main (String[] args) {
		
		// Create a scanner object
		Scanner number = new Scanner (System.in);
		
		// Prompt to user to enter number of days
		System.out.print("Number of days: ");
		int value = number.nextInt();
		
		// Compute the number of year
		int currentyear = value / 365;
		
		// Compute the number of month
		int month = value % 365;
		int currentmonth = month / 31;
		
		// Compute the number of day
		int day = value % 365;
		int currentday = day % 31;
		
		//Display results
		System.out.println("Year: "+ currentyear + ", Month: "+ currentmonth+ ", Day: "+ currentday + ".");
		
	}
}
