package number;

import java.util.Scanner;

public class Average_Of_Digits {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scan.nextInt();
		int avg = averageOfDigit(n);
		System.out.println("Average of Digit :"+avg);

	}

	public  static int averageOfDigit(int n) 
	{
		int sum=0;
		int count=0;
		while(n!=0)
		{
			int a=n%10;
			count++;
			sum=sum+a;
			n=n/10;
		}
		
		
		return sum/count;	
	}

}
