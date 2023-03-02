/**The purpose of this program is to calculate the day of the week using Zeller's congruence.*/

import java.util.Scanner;  // Scanner is in the java.util.Scanner package

public class HW2_150120049_P2 {
		
	public static void main (String[]args){
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt to user to enter year
		System.out.print("Enter year (e.g. 2012): ");
		int year = input.nextInt();
		
		//Prompt to user to enter month
		System.out.print("Enter month (e.g. 1-12): ");
		int month = input.nextInt();
		
		// Convert 1 (month) to 13 because of January counted as 13 in the formula, and change the year to the previous year
		if (month==1) {
		month= 13;
		year -= 1;
		}
		
		// Convert 2 (month) to 14 because of February counted as 13 in the formula, and change the year to the previous year
		if (month==2) {
		month= 14;
		year -= 1;
		}
	
		// Prompt to user to enter the day of the month
		System.out.print("Enter the day of the month (e.g. 1-31): ");
		int dayOfMonth = input.nextInt();
		
		// Calculate the century
		int century = year / 100;
		
		// Calculate the year of century
		int yearOfCentury = year % 100;
		
		// Calculate the following formulas (the division in the formula performs an integer division), and find the corresponding day name
		int dayName = (dayOfMonth + 26*(month + 1)/10 + yearOfCentury + yearOfCentury/4 + century/4 + 5*century)%7;
		
		//Display the corresponding day name
		if (dayName == 0)
		System.out.println("Day of the week is Saturday");
		else if (dayName == 1)
		System.out.println("Day of the week is Sunday");
		else if (dayName == 2)
		System.out.println("Day of the week is Monday");
		else if (dayName == 3)
		System.out.println("Day of the week is Tuesday");
		else if (dayName == 4)
		System.out.println("Day of the week is Wednesday");
		else if (dayName == 5)
		System.out.println("Day of the week is Thursday");
		else if (dayName == 6)
		System.out.println("Day of the week is Friday");
	}
}