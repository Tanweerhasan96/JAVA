package string;

import java.util.LinkedHashSet;

public class Occurance_Of_EachAlphabet {

	public static void main(String[] args) 
	{
		//String s="aaabababbcccrhhhsggeeeeesr";
		String s="abcabcan";
		char[] ch = s.toCharArray();
	    LinkedHashSet<Character> set = new LinkedHashSet<>();
	    for(int i=0;i<ch.length;i++)
	    {
	    	set.add(ch[i]);
	    }
	    System.out.println(set);
	   
	    for(Character obj:set)
	    {
	    	int count=0;
	    	for(int i=0;i<ch.length;i++)
	    	{
	    		if(obj.equals(ch[i]))
	    		{
	    			count++;
	    		}
	    	}
	    	System.out.print(obj+""+count);
	    }
		

	}

}
