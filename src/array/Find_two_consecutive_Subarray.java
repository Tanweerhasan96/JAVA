package array;

import java.util.Scanner;

public class Find_two_consecutive_Subarray {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = scan.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter value :");
		for(int i=0; i<n; i++)
		{
			ar[i]=scan.nextInt();
		}
		System.out.println("Length of Subarray:");
		int l=scan.nextInt();
		
		for(int i=0; i<=ar.length-l; i++)
		{
			for(int j=i; j<i+l; j++)
			{
				System.out.print(ar[j]+"");
			}
			System.out.println();
		}

	}

}
