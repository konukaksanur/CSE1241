/** I wrote a program that takes an input letter and outputs it in a diamond shape. Given a letter, it
prints a diamond starting with 'A', with the supplied letter at the widest point.*/

import java.util.Scanner;
public class HW4_Q3_150120049 {
	public static void main (String[] args) {
		System.out.print("Enter a Letter: ");
		Scanner input = new Scanner (System.in);
		String string = input.nextLine(); //Take the char as a string from the user
		if(string.length()==1 && (('A'<=string.charAt(0)&& string.charAt(0)<='Z')|| ('a'<=string.charAt(0)&& string.charAt(0)<='z'))) { //determine whether the string is letter or not 
			char letter =  (string.toUpperCase()).charAt(0); // return the string to char
			char[][] print= constructDiamond (letter); //compose a method that contain appropriate array with letter or space to compose diamond shape
			printDiamond(print); //compose a method that print the diamond
		}
		else {
			System.out.println("Invalid Input !");
		}
		
	}
	public static char[][] constructDiamond (char letter){
		char[][] constructDiamond = new char[(letter-'A')*2+1][(letter-'A')*2+1]; // create a array that contain appropriate array with letter or space to compose diamond shape
		for(int row = 0; row <= (letter-'A'); row++) { // this loop for the part that contain increase of letter
			for(int column = 0; column <= (letter-'A')*2; column++) {
				if (column==letter-'A'-row || column==constructDiamond[0].length-letter+'A'-1+row) {
					constructDiamond[row][column]= (char)('A'+row);
				}
				else {
					constructDiamond[row][column]= (' ');
				}
			}
		}
		for(int row = (letter-'A'+1); row <= (letter-'A')*2; row++) { //this loop for the part that contain decrease of letter
				for(int column = 0; column <= (letter-'A')*2; column++) {
					if (column=='A'+row-letter  || column==constructDiamond[0].length+ letter-row-'A'-1) {
						constructDiamond[row][column]= (char)((letter)*2-row-'A');
					}
					else {
						constructDiamond[row][column]= (' ');
					}
				}
		}
		return constructDiamond; // retur array. to the main method
	}
	public static void printDiamond (char[][] diamond) { //print the diamond
		for(int row= 0; row<diamond[0].length; row++) {
			for(int column= 0; column<diamond[0].length; column++) {
					System.out.print(diamond[row][column]);
			}
			System.out.println();
		}
	}
}