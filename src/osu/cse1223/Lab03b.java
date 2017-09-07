/*
 * Lab03b.java
 * compares two strings then places them in alphabetical order
 * 
 * @author Paul M. Onderisin
 * @version 1.0.0
 */

package osu.cse1223;

import java.util.Scanner;

public class Lab03b {

	public static void main(String[] args) {

		//Starts the scanner
		Scanner scan = new Scanner(System.in);
				
		//prompts the user for first string
		print("Enter the first String: ", false);
		
		//gets the first string
		String _one = scan.nextLine();
		
		//prompts the user for second string
		print("Enter the second String: ", false);
		
		//gets the second string
		String _two = scan.nextLine();
		
		//compares the strings to place them in alphabetically order
		if(_one.compareTo(_two) == -1) {
			
			//If the first string comes first then it is already in order
			print(_one + " comes before " + _two + " lexiographically", true);
		}
		else {
			
			//if first string places second then this si the correct order
			print( _two + " comes before " + _one + " lexiographically", true);
		}
		
		//This closes the scanner
		scan.close();
		
	}

	//This is so i dont have to type the really long version a bunch if times
	public static void print(String _s,boolean _line) {
		
		if(_line) {
			
			//if _line is true then prints a new line after display
			System.out.println(_s);
			
		}
		else {
			
			//if _line is false then no new line is printed
			System.out.print(_s);
		}
	}
}
