package number;

import java.util.Scanner;

public class Powerof_Number {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=scan.nextInt();
		System.out.println("Enter power : ");
		int p=scan.nextInt();
		int result=pow(n,p);
		System.out.println(result);

	}

	public static int pow(int n, int p) 
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

}
