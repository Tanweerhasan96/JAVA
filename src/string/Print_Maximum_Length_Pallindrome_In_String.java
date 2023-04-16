package string;

public class Print_Maximum_Length_Pallindrome_In_String {

	public static void main(String[] args) 
	{
		String str="abaab";
		maximumLengthPallindrome(str);
		

	}

	public static void maximumLengthPallindrome(String str)
	{
		int n=str.length();
		int max=0;
		String st="";
		String s="";
		for(int i=0;i<n;i++)
		{
			st="";
			for(int j=i;j<n;j++)
			{
				st=st+str.charAt(j);
				if(isPallindrome(st)&& max<st.length())
				{
					max=st.length();
					s=st;
				}
			}
		}
		System.out.println("Maximum length Pallindrome is : "+s);
		System.out.println("Length of Pallindrome is :"+max);
		
	}

	public static boolean isPallindrome(String st)
	{
		int i=0,j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!=st.charAt(j))
			{
				return false;
				
			}
			i++;
			j--;
		}
		
		return true;
	}

}
