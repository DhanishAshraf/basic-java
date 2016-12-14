/** Dhanish Ashraf
	1336289
	DXA390
	This Java program will compute the sum and product of any two fractions
*/

public class Ex4
{ 
	public static double sum(double e1, double d1, double e2, double d2)
	{ //This method computes the sum of the fractions
		double sum = (((e1 * d2) + (e2 * d1))/(d1 * d2));
		return sum;
	}
	
	public static double product(double e1, double d1, double e2, double d2)
	{ //This method computes the product of the fractions
		double product = ((e1 * e2)/(d1 * d2));
		return product;
	}
	public static void main(String[] args)
	{ //Calling each method twice for specific fractions
		System.out.printf("%s%1f%n", "The sum of the fractions is ", sum(1, 2, 1, 3));
		
		System.out.printf("%s%1f%n", "The sum of the fractions is ", sum(1, 3, 3, 4));		
		
		System.out.printf("%s%1f%n", "The product of the fractions is ", 
							product(1, 2, 1, 3));
						  
		System.out.printf("%s%1f%n", "The sum of the fractions is ", 
							product(1, 4, 2, 3));			
	}							  

}