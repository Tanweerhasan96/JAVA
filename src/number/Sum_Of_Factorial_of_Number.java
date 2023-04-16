package number;

import java.util.Scanner;

public class Sum_Of_Factorial_of_Number {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scan.nextInt();//123
		int getFact = sumOfFactorial(n);
		System.out.println("Sum of Factorial :"+getFact);

	}

	public static int sumOfFactorial(int n)
	{
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			int fact=getFact(a);
			sum=sum+fact;
			n=n/10;
		}
		return sum;
		
	}

	public static int getFact(int a) 
	{
		int fact=1;
		while(a>1)
		{
			fact=fact*a;
			a--;
		}
		return fact;
		
		
	}

}
