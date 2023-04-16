package string;

public class Count_Words {

	public static void main(String[] args)
	{
		String s="My Name is Tanweer Hasan";
		String[] st = s.split(" ");
		
		//how many word in the string
		int count=0;
		for(int i=0;i<st.length;i++)
		{
			count++;
		}
		System.out.println("No of Words :"+count);
		
		//Print First alphabet of each words
		for(int i=0;i<st.length;i++)
		{
			char[] ch = st[i].toCharArray();
			System.out.print(ch[0]+" ");
		}
		System.out.println();
		
		
		//how many alphabet in each words
		for(int i=0;i<st.length;i++)
		{
			 char[] ch = st[i].toCharArray();
			 int l= ch.length;
			 System.out.println(st[i]+"-->"+l+" ");
		}
		
		
		
		

	}

}
