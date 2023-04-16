package string;

public class Count_Vowels_Constant_spc {

	public static void main(String[] args) 
	{
		String s="Java JDK1.8";
		int v=0,c=0,uc=0,lc=0,spc=0,dc=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
					v++;
				}
				else{
					c++;
				}
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
			else if(ch>='0'&&ch<='9')
			{
				dc++;
			}
			else
			{
				spc++;
			}
		}
		System.out.println("No of Capital letter "+uc);
		System.out.println("No of small letter "+lc);
		System.out.println("No of vowels "+v);
		System.out.println("No of consonant "+c);
		System.out.println("No of digits "+dc);
		System.out.println("No of special "+spc);
	

	}

}
