package string;

public class Convert_Lowercase 
{
	public static void main(String []arg)
    {
        String str="M.S Dhoni";
        char[] ch= str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
           if(ch[i]>='A'&& ch[i]<='Z')
           {
            ch[i]= (char)(ch[i]+32);
           }
        }
        String s=new String(ch);
        System.out.println(s);
    }

}
