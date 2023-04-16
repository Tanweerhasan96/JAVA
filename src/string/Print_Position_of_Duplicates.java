package string;

import java.util.LinkedHashSet;

public class Print_Position_of_Duplicates {

	public static void main(String[] args) 
	{
		String s="Tanweerhasan";
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
					if(count>1)
					{
						System.out.println(obj+" is in "+(i+1)+" position");
					}
				}
			}
		}

	}

}
