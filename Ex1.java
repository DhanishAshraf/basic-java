/** Dhanish Ashraf
	1336289
	DXA390
	Worksheet 1, Exercise 1.
	A program that computes the Area of a circle.
*/

import java.lang.Math; // This library is required to use pi so that we can calculate the area

public class Ex1
{ 
	public static double area(double r) //defining an area method to compute the area
	{
		double area = Math.PI * (r * r); // computing the area
		return area;	
	} 
	
	public static void main(String[] args)
	{
		System.out.printf("%s%2f%n", "The area of the circle is ", area(5)); /**This tells 
		the program to print a string and then call the area method using the variable r as 5 */
	}
}