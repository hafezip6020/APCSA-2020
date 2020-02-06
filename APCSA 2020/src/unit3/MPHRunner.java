package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		System.out.println("MPH Calculations");
		test.calcMPH();
		test.toString();
		System.out.println(test);
		
		/*Distance D = new Distance(xValue1,xValue2, yValue1, yValue2);
	    System.out.println("Distance Calculations");
	    D.toString();
	    System.out.println("\n");
	    D.calcDistance();
	    System.out.println(D); */
		
		
	}
}