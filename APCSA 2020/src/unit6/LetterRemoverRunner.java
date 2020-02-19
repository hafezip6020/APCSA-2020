package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import unit5.StringEquality;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover L = new LetterRemover();
		
		L.setRemover("I am Sam I am",'a');
		System.out.println(L.toString());
		System.out.println(L.removeLetters());
		
		/*L.setRemover("ssssssssxssssesssssesss",'s');
		System.out.println(L.toString());
		System.out.println(L.removeLetters());
		
		L.setRemover("qwertyqwertyqwerty",'a');
		System.out.println(L.toString());
		System.out.println(L.removeLetters());
		
		L.setRemover("abababababa",'b');
		System.out.println(L.toString());
		System.out.println(L.removeLetters());
		
		L.setRemover("abaababababa",'x');
		System.out.println(L.toString());
		System.out.println(L.removeLetters());
		*/
		//add test cases
		/*StringEquality A = new StringEquality("WordOne", "WordTwo");
		A.setWords( "hello", "goodbye");
		A.checkEquality();
		System.out.println(A.toString());	
		
		A.setWords( "one", "two");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "three", "four");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "TCEA", "UIL");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "State", "Championship");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "ABC", "ABC");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "ABC", "CBA");
		A.checkEquality();
		System.out.println(A.toString());
		
		A.setWords( "Same", "Same");
		A.checkEquality();
		System.out.println(A.toString());
		*/
		
											
	}
}