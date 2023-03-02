/**I wrote a program that calculates the invoice of each flat in an apartment building according to rules. (30% of bill will be
shared equally among the flats, the rest 70% will be shared according to the consumption of each flat.) */

import java.util.Scanner;

public class HW4_Q1_150120049 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); //Take the numbers of flats from the user
		 
		double[] consumptionofFlats = new double[N];//compose a array that contain consumption of each flats
		for (int i= 0; i< consumptionofFlats.length; i++) {
			consumptionofFlats[i] = input.nextDouble();
		}
		double totalBill = input.nextDouble();//Take the total bill of apartment from the user
		double[] bills = calculateTheInvoice (consumptionofFlats, totalBill); //Compose a method that calculates invoice of each flat
		printBills(bills);//Compose a method that prints the result
	}
	public static double[] calculateTheInvoice(double[] flats, double totalBill) {
		double totalconsumption = 0;// Calculates total consumption of apartment
		for (int i= 0; i<flats.length; i++) { 
			totalconsumption += flats[i];
		}
		double[] bills= new double[flats.length]; //compose a array that calculates invoice of each apartment
		// 30% of bill will be shared equally among the flats, the rest 70% will be shared according to the consumption of each flat.
		for (int i= 0; i<flats.length; i++) {
			bills [i] = totalBill*30.0/(100*flats.length)+ (totalBill*70.0/100)*flats[i]/totalconsumption; 

		}
		return bills; // return the result, to main method
	}
	public static void printBills (double[] bills) { //print the result
		for (int i= 1; i<=bills.length; i++) {
			System.out.println("Flat #"+ i + ": "+ ((int)(bills[i-1]*100))/100.0); // to print the outputs with 2 digits after the decimal point, do operation((int)(x*100))/100.0 
		}	
	}		
}