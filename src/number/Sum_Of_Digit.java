package number;

import java.util.Scanner;

public class Sum_Of_Digit {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scan.nextInt();
		int number=numbersumOfDigit(n);
		System.out.println("Addition of Digit :"+number);

	}

	public static int  numbersumOfDigit(int n) 
	{
		int sum=0;
		while(n!=0)
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
		return sum;
		
	}

}
