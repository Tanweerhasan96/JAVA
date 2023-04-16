package string;

public class How_many_Pallindrome_In_String {

	public static void main(String[] args) 
	{
		String str="abaab";
		printPallindrome(str);

	}

	public static void printPallindrome(String str) 
	{
		int n = str.length();
		String s="";
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			s="";
			
			for(int j=i;j<n;j++)
			{
				s=s+str.charAt(j);
				if(isPallindrome(s) && s.length()>1)
				{
					System.out.println(s);
					count++;
				}
			}
			
			
		}
		System.out.println("Number of Pallindrome :"+count);
		
		
	}

	public static boolean isPallindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
