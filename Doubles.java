package dataTypes;

import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class Doubles {

	public static void main(String[] args) {
		// declare one variable of type int, one of type double, and one of type String.

		int intNumber = 0;
		double doubleNumber = 0.0;
		String sentence = " ";

		/* Declare second integer, double, and String variables. */
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		/* Read and save an integer, double, and String to your variables. */

		System.out.println("Enter 12");
		Scanner inputScanner = new Scanner(System.in); // Create a Scanner object
		String inputString = inputScanner.nextLine();
		intNumber = Integer.parseInt(inputString);
		int total = intNumber + i;
		// System.out.println(intNumber);
		// System.out.println(i);
		System.out.println(total);

		System.out.println("Enter 4.0");
		inputScanner = new Scanner(System.in); // Create a Scanner object
		inputString = inputScanner.nextLine();
		doubleNumber = Double.parseDouble(inputString);
		doubleNumber += d;
		/* Print the sum of the double variables on a new line. */
		System.out.println(doubleNumber);

		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		System.out.println("Enter is the best place to learn and practice coding!");
		inputScanner = new Scanner(System.in);
		inputString = inputScanner.nextLine();
		s += inputString;
		System.out.println(s);
		
		inputScanner.close();

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

	}

}
