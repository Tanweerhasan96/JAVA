package number;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scan.nextInt();
		int fact = factNumber(n);
		System.out.println("Factorial of "+n+" is "+fact);

	}

	public static int factNumber(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		
		return fact;
	}

}
