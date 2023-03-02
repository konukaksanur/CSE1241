/**The purpose of this program is to calculate the cost of trip*/

import java.util.Scanner; // Scanner is in the java.util.Scanner package

	public class HW_150120049_P1 {	
		public static void main (String[] args) {
			
			// Create a scanner object
			Scanner value = new Scanner(System.in);
			
			// Prompt to user to
			System.out.print("Enter the driving distance: ");
			double distance = value.nextDouble();
			
			// Prompt to user to
			System.out.print("Enter miles per gallon: ");
			double miles = value.nextDouble();
			
			// Prompt to user to
			System.out.print("Enter price per gallon: ");
			double price = value.nextDouble();
			
			// Compute the 
			double cost = (distance / miles) * price;
			
			//Display results
			System.out.print("The cost of driving is $" + (int)(cost * 100)/100.0);
		}
}