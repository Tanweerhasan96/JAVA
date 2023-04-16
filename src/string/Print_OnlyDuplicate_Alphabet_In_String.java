package string;

public class Print_OnlyDuplicate_Alphabet_In_String {

	public static void main(String[] args) 
	{
		String str="Tannweerr";
		System.out.println("Old String :"+str);
		System.out.println("New String :"+printDuplicate(str));
		
		
		

	}

	public static String printDuplicate(String str) 
	{
		String newStr="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				char chr = str.charAt(j);
				if(ch==chr)
				{
					newStr=newStr+ch;
				}
			}
		}
		return newStr;
	}

}
