/**The purpose of this program is to calculate personal income tax based on the given tax rates reported
 * by the Turkish Revenue Administration*/

import java.util.Scanner; // Scanner is in the java.util.Scanner package

public class HW2_150120049_P3 {
	public static void main (String[]args){
		
		// Create a scanner object
		Scanner input = new Scanner (System.in);
		
		int year = input.nextInt(); //Get year information from the user
		double income = input.nextDouble(); //Get an income level from the user
	
		// Give a warning If user enter "income <= 0 "
		if (income <= 0)
		System.out.println("Income must be > 0");
	
		// Give a warning If user enter a year except the 2017,2018,2019,2020
		if (year != 2017 && year != 2018 && year != 2019 && year != 2020)
		System.out.println("Undefined year value");
		
		//If year is 2017, Calculate the personal income tax according to following steps
		// Display 2 digits after the decimal point using the "(int)(double*100)/100",
		if (year == 2017) {
			if (0 <income && income<  13000) {
				double taxAmount = income * 15/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0);  // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%");//Display the real tax rate
			}

			else if (0 <income && income < 30000) {
				double taxAmount = 1950 + (income-13.000)*20/ 100;//Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+(int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 110000) {
				double taxAmount = 5350 + (income-30000)*27/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income >= 110000 ) {
				double taxAmount = 26950 + (income-110000)*35/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}
		}
	
		//If year is 2018, Calculate the personal income tax according to following steps
		// Display 2 digits after the decimal point using the "(int)(double*100)/100",
		if (year == 2018) {
			if (0 <income && income < 14800) {
				double taxAmount = income *15/ 100 ; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 34000 ) {
				double taxAmount = 2220 + (income-14800)*20/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income <  120000) {
				double taxAmount = 6060 + (income-34000)*27/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income >=  120000 ) {
				double taxAmount = 29280 + (income-120000)*35/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}	
		}
	
		//If year is 2019, Calculate the personal income tax according to following steps
		// Display 2 digits after the decimal point using the "(int)(double*100)/100",
		if (year == 2019) {
			if (0 <income && income < 18000) {
				double taxAmount = income *15/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 40000) {
				double taxAmount = 2.700 + (income- 18000)*20/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 148000) {
				double taxAmount = 7100 + (income- 40000)*27/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 500000) {
				double taxAmount = 36260 + (income-148000)*35/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income >= 500000) {
				double taxAmount = 159460 + (income-500000)*40/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}
		}
	
		//If year is 2020, Calculate the personal income tax according to following steps
		// Display 2 digits after the decimal point using the "(int)(double*100)/100",
		if (year == 2020) {
			if (0 <income && income < 22000) {
			double taxAmount = income *15/ 100; //Calculate the tax amount according to formula
			double realTaxRate = (int)(taxAmount / income* 10000)/100.0;//Calculate the real tax rate according to formula
			System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
			System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
			System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
			System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 49000) {
				double taxAmount = 3300 + (income-22000)*20/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 18000) {
				double taxAmount = 8700 + (income-49000)*27/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income < 600000) {
				double taxAmount = 44070 + (income-180000)*35/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}

			else if (0 <income && income >= 600000) {
				double taxAmount = 191070 + (income-600.000)* 40/ 100; //Calculate the tax amount according to formula
				double realTaxRate = (int)(taxAmount / income* 10000)/100.0; //Calculate the real tax rate according to formula
				System.out.println("Income: " + (int)(income*100)/100.0); //Display the income
				System.out.println("Tax amount: "+ (int)(taxAmount*100)/100.0); // Display the tax amount
				System.out.println("Income after tax: "+ (int)((income-taxAmount)*100)/100.0); // Display the income amount after tax
				System.out.println("Real tax rate: "+ realTaxRate + "%"); //Display the real tax rate
			}
		}
	}
}