package number;

import java.util.Scanner;

public class Pallindrome_Number {

	public static void main(String[] args)
	{
		
		int n=121;
		boolean res = isPallindrome(n);
		if(res==true)
		{
			System.out.println(n+" is a Pallindrome Number");
		}
		else
		{
			System.out.println(n+" is not a Pallindrome Number");
		}

	}

	public static boolean isPallindrome(int n) 
	{
		int rev=0,temp=n;
		while(n>0)
		{
			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		if(temp==rev)
		{
			return true;
		}
		else {
			return false;	
		}
		
		
	}

}
