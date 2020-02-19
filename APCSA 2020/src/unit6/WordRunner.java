package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word W = new Word();
		W.setString("Hello");
		System.out.println(W.toString());
		
		W.setString("World");
		System.out.println(W.toString());
		
		W.setString("JukeBox");
		System.out.println(W.toString());
		
		W.setString("TCEA");
		System.out.println(W.toString());
		
		W.setString("UIL");
		System.out.println(W.toString());
		
	}
}