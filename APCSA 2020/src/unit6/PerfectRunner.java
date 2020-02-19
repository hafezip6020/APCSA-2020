package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect P = new Perfect();
		
		P.setPerfect(496);
		System.out.println(P.toString());
		
		P.setPerfect(45);
		System.out.println(P.toString());
		
		P.setPerfect(6);
		System.out.println(P.toString());
		
		P.setPerfect(14);
		System.out.println(P.toString());
		
		P.setPerfect(8128);
		System.out.println(P.toString());
		
		P.setPerfect(1245);
		System.out.println(P.toString());
						
		P.setPerfect(33);
		System.out.println(P.toString());
		
		P.setPerfect(28);
		System.out.println(P.toString());
		
		P.setPerfect(27);
		System.out.println(P.toString());
		
		P.setPerfect(33550336);
		System.out.println(P.toString());
	}
}