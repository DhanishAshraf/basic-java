/** Dhanish Ashraf
	1336289
	DXA390
	This Java program will compute the balance of an investment after 
	x number of years
*/


import java.lang.Math; //Importing the Java math language so we can raise to the power later on.

public class Ex3
{
	public static double years(double a) //defining a method for the formula
	{
		double capital = 100;
		double interest_rate = 2.3;
		double first = (1 + (0.01 * interest_rate));
		double first_a = java.lang.Math.pow(first, a); //Raising first to the power a
		double total_ayears = capital * first_a; //splitting up the formula
		return total_ayears;
	}
	
	public static void main(String[] args)
	{	//printing out the balance after x years by calling the years method at the xth year
		System.out.printf("%s%1f%n", "The balance after 1 year is ", (years(1)));
		System.out.printf("%s%1f%n", "The balance after 2 years is ", (years(2)));
		System.out.printf("%s%1f%n", "The balance after 3 years is ", (years(3)));
		System.out.printf("%s%1f%n", "The balance after 4 years is ", (years(4)));
		System.out.printf("%s%1f%n", "The balance after 5 years is ", (years(5)));
		System.out.printf("%s%1f%n", "The balance after 500 years is ", (years(500)));
	}
}