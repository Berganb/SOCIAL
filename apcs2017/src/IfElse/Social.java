package IfElse;

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
	}

	public Social(String soc)
	{ soc = socialNum;
	} 


	public void setWord(String w)
	{ socialNum= w;
	}

	public void chopAndAdd(int x, int y, String z, int a, int b, int c)
	{
		socialNum = z;
		
		a = Integer.parseInt(z.substring(0, z.indexOf("-")-1));
		b = Integer.parseInt(z.substring(z.indexOf("-")+1,z.lastIndexOf("-")-1));
		c = Integer.parseInt(z.substring(z.lastIndexOf("-")+1, z.lastIndexOf("-"+3)));
		;
		
		
		sum = (a+b+c);
		String sub = socialNum;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}