package number;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=scan.nextInt();
		boolean res = isArmstrong(n);
		if(res==true)
		{
			System.out.println(n+" is an Armstrong Number..");
		}
		else
		{
			System.out.println(n+" is not an Armstrong Number..");
		}

	}

	public static boolean isArmstrong(int n) 
	{
		int temp=n;
		int dc=countDigit(n);
		int sum=0;
		do
		{
			int a=n%10;
			sum=sum+getPow(a,dc);
			n=n/10;
		}while(n!=0);
		if(temp==sum)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public static int getPow(int a, int dc)
	{
		int pw=1;
		while(dc>0)
		{
			pw=pw*a;
			dc--;
		}
		return pw;
	}

	public static int countDigit(int n)
	{
		int count=0;
		do
		{
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}

}
