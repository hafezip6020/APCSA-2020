package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect()
	{
		number = 10;
	}

	public Perfect(int num)
	{
		number = num;
	}
	
	public void setPerfect(int num)
	{
		number = num;
	}
	
	//add a set method

	public boolean isPerfect()
	{ int sum = 0;
		for (int i = 1; i<number; i++) {
			if(number%i == 0) {
				sum = sum + i;
			}
		}
		if(sum == number) {
			return true;
		}else {
			return false;
		}
	}

	public String toString()
	{   
		if (this.isPerfect()==true) {
			return number + " is perfect";
		}else {
			return number + " is not perfect";
		}
	}	
	
}