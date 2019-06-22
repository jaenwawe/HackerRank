package operatorsDay2;

import java.util.Scanner;

public class MealCost {

	public static void main(String[] args) {
		/*
		 * There are lines of numeric input: The first line has a double, (the cost of
		 * the meal before tax and tip). The second line has an integer, (the percentage
		 * of being added as tip). The third line has an integer, (the percentage of
		 * being added as tax). 12.00 20 8
		 * 
		 * Output Format 15 Print the total meal cost, where is the rounded integer
		 * result of the entire bill ( with added tax and tip).
		 */

		System.out.println("Enter cost of meal");
		Scanner inputScanner = new Scanner(System.in);
		String inputString = inputScanner.nextLine();
		Double mealCost = Double.parseDouble(inputString);
		System.out.println(mealCost);
		
		System.out.println("Enter cost of tip");
		inputScanner = new Scanner(System.in);
		inputString = inputScanner.nextLine();
		int mealTip = Integer.parseInt(inputString);
		System.out.println(mealTip);
		
		System.out.println("Enter cost of tax");
		inputScanner = new Scanner(System.in);
		inputString = inputScanner.nextLine();
		int mealTax = Integer.parseInt(inputString);
		System.out.println(mealTax);
		System.out.println("The meal cost is " + mealTotal(mealCost, mealTip, mealTax));
	}
	
	static int mealTotal(Double mealCost, int mealTip, int mealTax) {		
		double tip = mealTip;
		double tax = mealTax;
		double total= mealCost + (mealCost *tip + mealCost* tax)/100;
		int rounded= (int) total;
		return rounded;
	}

}
