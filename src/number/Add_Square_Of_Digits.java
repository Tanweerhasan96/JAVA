package number;

import java.util.Scanner;

public class Add_Square_Of_Digits {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scan.nextInt();
		int add=sqareDigit(n);
		System.out.println(add);

	}

	public static int sqareDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int a=n%10;
			int sqr=a*a;
			sum=sum+sqr;
			n=n/10;
		}
		return sum;
	}

}
