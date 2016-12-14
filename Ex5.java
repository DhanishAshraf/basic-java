/** Dhanish Ashraf
	1336289
	DXA390
	A java program that computes the angle between the hour hand and the minute hand
*/

public class Ex5
{
	public static int minute(int m) //This method will compute the angle of the minute hand from 12
	{	
		int minute = 360 - (6 * m); /** Since one minute is approximately 6 degrees.
		360 - (6 * m) to ensure it works out the angle anticlockwise */
		return minute;
	}
	
	public static int hour(int h) //This method will compute the angle of the hour hand from 12
	{	
		if (h >=12)
		h = 12 - h; //This way we only need to consider numbers from 1 to 12
		if (h < 0)
		h = h * (-1); //incase we have a time greater than 12; ensures positive number
		int hour = 30 * h; // Since one hour is approximately 30 degrees.
		return hour;
	}
	
	public static double change(double m)
	{ // How much the hour hand should have moved where m is the minute.
		double change = 60/m; /**The minute hand has to move 60 minutes so we work out the
		fraction it has moved to work out the fraction the hour hand should move
		*/
		return change; 
	}
	
	public static void main(String[] args)
	{
		double ang = hour(11) + minute(59) + (30/change(59)); /** adding the angle of hour
		hand and the minute hand.  */
		
		if (ang < 360)
		System.out.printf("%1f%n", ang);
		
		if (ang >= 360) //To ensure we are always working anticlockwise from hour hand to minute hand
		System.out.printf("%1f%n", (ang - 360));
	}	
}	
	