package number;

import java.util.Scanner;

public class Range_Prime_Number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Range :");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
		{
		boolean res=isPrime(i);
		if(res==true)
		{
			System.out.println(i+" is a Prime Number");
		}
		
	}

	}

	public static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				
				return false;
		
		}
		return true;
		
		
		
	}

}
