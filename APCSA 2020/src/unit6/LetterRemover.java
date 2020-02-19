package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "Hello";
		lookFor = 'o';
	}

	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int indexOfChar = 0;
		while(cleaned.indexOf(lookFor)!=-1) {
			indexOfChar=cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0,indexOfChar) + cleaned.substring(indexOfChar+1);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}