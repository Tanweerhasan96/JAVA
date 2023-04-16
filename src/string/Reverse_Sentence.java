package string;

public class Reverse_Sentence {

	public static void main(String[] args) 
	{
		String str="My name is Tanweer Hasan";
		String[] s = str.split(" ");
		String st="";
		for(int i=0;i<s.length;i++)
		{
			st=s[i]+" "+st;
		}
		String sp=new String(st);
		System.out.println(sp);
				
	}

}
