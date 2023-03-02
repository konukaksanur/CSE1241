/** I wrote a program that numbers will determine whether or not it is valid per the Luhn formula */

import java.util.Scanner;

public class HW4_Q2_150120049 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String creditCardNumber = input.nextLine(); //Take the numbers from the user
		validateNumber(creditCardNumber); //compose a array that determine whether the numbers is valid or not
	}
	public static boolean validateNumber(String creditCardNumber) {
		boolean valid = false; //create a variable that indicates whether the numbers is compose with valid characters or not
		boolean result = false;//create a variable that determine whether the numbers is valid or not
		for(int i = 0; i <creditCardNumber.length(); i++) { //determine whether the numbers is compose with valid characters or not
			if ((creditCardNumber.charAt(i) == ' ' )|| (creditCardNumber.charAt(i)<='9' && '0' <= creditCardNumber.charAt(i)) && (1<creditCardNumber.length())) {
				valid = true;
			}
			else {
				valid = false; 
				System.out.println("Invalid Input !"); break;
			}
		}
		if (valid) { // if the numbers compose with valid characters, calculate Luhn Formula
			int count= 0;
			for(int a = 0; a <creditCardNumber.length(); a++) { // determine the amount of that are inputed numbers
				if(creditCardNumber.charAt(a) != ' ' ) {
				count ++;
				}
			}
			int[] number = new int[count]; //compose a array that contain only numbers that are inputed ,that is, removes the spaces of input
			int b=0;
			for(int a = 0; a <creditCardNumber.length(); a++) {
				if(creditCardNumber.charAt(a) != ' ' ) {
					number [b] = creditCardNumber.charAt(a)-48;
					b++;
				}
			}
			System.out.print("DNumber:"); // print every second digit, starting from the right,and print every first digit as a '_'
			for (int c = 0;c<count; c++) {	
				if (count%2!=0) {
					if (c%2!=0) {
						System.out.print(number [c]);
						//Change the every second digit of array (doubling and, if doubling the number results in a number greater than 9 then subtract 9 from the product
						if (number [c]*2>9) { 
							number [c]=number [c]*2-9;
						}
						else {
							number [c]=number[c]*2;
						}
					}
					else {
						System.out.print("_");
					}
				}
				else {
					if (c%2!=0) {
						System.out.print("_");
					}
					else {
						System.out.print(number [c]);
						//Change the every second digit of array (doubling and, if doubling the number results in a number greater than 9 then subtract 9 from the product
						if (number [c]*2>9) {
							number [c]=number[c]*2-9;
						}
						else {
							number [c]=number[c]*2;
						}
					}
				}
			}
			System.out.println();
			System.out.print("LNumber:");
			int sum =0;
			for (int d = 0;d<count; d++) {
				System.out.print(number [d]);// Print the changing array as a LNuber
				sum += number [d]; // sum the array
			}
			System.out.println();
			//if sum%10 is equal 0, result return true and prints "Number is Valid", else result is still false, prints "Number is Invalid"
			if (sum%10==0) {
				result=true;
			}
			if (result) {
				System.out.println("Number is Valid");
			}
			else {
				System.out.println("Number is Invalid");
			}
		}
		return result;
	}
}