package string;

public class Occurance_Of_EachAlphabet_without_Collection 
{

	public static void main(String[] args)
	{
		String s="tannwwwweeeeeerrer";
		print_Occurance_Of_Each_Character(s);
		print_Maximum_Occurance_Character(s);
	}
			
	public static void print_Occurance_Of_Each_Character(String s ) 
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0')
			{
				System.out.print(ch[i]+""+count);
	
		    }
			
		}
	}
	public static void print_Maximum_Occurance_Character(String s)
	{
	  char[] ch=s.toCharArray();
	  int[] con=new int[26];
	  for(int i=0;i<ch.length;i++)
	  {
		  int count=1;
		  for(int j=i+1;j<ch.length;j++)
		  {
			  if(ch[i]==ch[j])
			  {
				  count++;
				  ch[j]='0';
			  }
		  }
		  if(ch[i]!='0')
		  {
			  con[ch[i]-97]=count;
		  }
	  }
	  System.out.println();
		  int max=0;
		  char c=' ';
		 for(int i=0;i<con.length;i++)
		 {
			 if(max<con[i])
			  {
				  max=con[i];
				  c=(char)(i+97);
			  }
			 
	  }
	  System.out.println(c+""+max);
	
	}

	

}