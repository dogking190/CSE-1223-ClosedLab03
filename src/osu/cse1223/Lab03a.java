/*
 * Lab03a.java
 * take two input numbers and compares which one is bigger
 * 
 * @author Paul M Onderisin
 * @version 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Lab03a {

	public static void main(String[] args) {
		
		//Starts the scanner
		Scanner scan = new Scanner(System.in);
		
		//prompts the user for
		print("Enter the first number: ", false);
		
		//Gets a number inputed by the user
		int _firstNum = scan.nextInt();
		
		//prompts for a second number
		print("Enter a second number: ", false);
		
		//gets the second number
		int _secondNum = scan.nextInt();
		
		//Compares the two numbers if first one is bigger then goto 1 if not goto 2
		if(_firstNum > _secondNum)
		{
			print(_firstNum + " is larger than " + _secondNum, true);
		}
		
		//If the above is false then this executes
		else
		{
			print(_secondNum + " is larger than " + _firstNum, true);
		}
		
		//Closes the scanner
		scan.close();

	}
	
	
	//So i dont need to type "System.out.print()" a bunch of times
	public static void print(String _s,boolean _line) {
		
		if(_line) {
			
			//if _line is true then new line is printed
			System.out.println(_s);
			
		}
		else {
			
			//if _line is false then no new line is printed
			System.out.print(_s);
		}
	}

}
