/** Dhanish Ashraf	
	1336289
	DXA390
	Exercise 2
	A program that converts masses given in the imperial system into kilograms
*/

public class Ex2
{	/** Defining a method for each mass where it will convert 1 unit mass in pounds to kilograms
		The 'a' variable in each method is so that we can convert any amount of unit mass into 
		kilograms. */
	public static double ton(double a) 
	{ 
		double ton = 2240; // pounds
		double pound = 0.45359237; // kilograms
		double ton_kg = (a * ton) * pound; //kilograms
		return ton_kg;
	}	
	
	public static double hundredWeight(double a)
	{	
		double hundred_weight = 112; // pounds
		double pound = 0.45359237; // kilograms
		double hundred_weight_kg = (a * hundred_weight) * pound; //kilograms
		return hundred_weight_kg;
	}	
	
	public static double quater(double a)
	{	
		double quater = 28; // pounds
		double pound = 0.45359237; // kilograms	
		double quater_kg = (a * quater) * pound; //kilograms
		return quater_kg;
	}	
	
	public static double stone(double a)
	{
		double stone = 14; // pounds
	    double pound = 0.45359237; // kilograms
	    double stone_kg = (a * stone) * pound; //kilograms
	    return stone_kg;
	}   
	
	public static double ounce(double a)
	{   
		double ounce = (0.0625); // pounds
	    double pound = 0.45359237; // kilograms	
		double ounce_kg = (a * ounce) * pound; //kilograms
		return ounce_kg;
	}
	
	public static double drachm(double a)		
	{		
		double drachm = (0.00390265); // pounds
	    double pound = 0.45359237; // kilograms
	    double drachm_kg = (a * drachm) * pound; //kilograms
	    return drachm_kg;
	}
	
	public static double grain(double a)
	{	
		double grain = (0.00014286); // pounds
		double pound = 0.45359237; // kilograms
		double grain_kg = (a * grain) * pound; //kilograms
		return grain_kg;
	}	
		
	public static double pound(double a)
	{
		double pound = 0.45359237; // kilograms
		double pound_kg = a * pound; //kilograms
		return pound_kg; 	
	}
	public static void main(String[] args)
	{ // Here we are just printing each unit mass in kilograms by calling each method and evaluating at 1.
		System.out.println(ton(1));
		System.out.println(hundredWeight(1));
		System.out.println(quater(1));
		System.out.println(stone(1));
		System.out.println(ounce(1));
		System.out.println(drachm(1));
		System.out.println(grain(1));
		System.out.println(pound(1));
	// Here we are evaluating 11 stone and 6 pounds in kilograms by calling the relevant methods	
		System.out.printf("%s%1f%s%n", "Your weight is ", (stone(11) + pound (6)), " kilograms.");
	}
}