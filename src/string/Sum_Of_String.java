package string;

public class Sum_Of_String {

	public static void main(String[] args) 
	{
		String str="Tanweer";
		
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			sum=sum+str.charAt(i);
		}
		System.out.println(sum);
		
		
	}

}
