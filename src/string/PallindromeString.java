package string;

import java.util.Scanner;

public class PallindromeString 
{
	public static void main(String[]args)
    {
       // String str="DAD";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = scan.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
       if(str.equals(rev)==true)
       {
           System.out.println(str+" is a Pallindrome String");
       }
       else{
            System.out.println(str+" is not a Pallindrome String");
       }
    }

}
