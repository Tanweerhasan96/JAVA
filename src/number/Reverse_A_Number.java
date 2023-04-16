package number;

import java.util.Scanner;

public class Reverse_A_Number {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scan.nextInt();
		int rev = reverseNumber(n);
		System.out.println(rev);

	}

	public static int reverseNumber(int n)
	{
		int rev=0;
		while(n>0)
		{
			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		return rev;
		
	}

}
