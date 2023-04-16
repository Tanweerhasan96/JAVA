package string;

public class Pallindrome_Substring
{
	public static void main(String[] args) {
        String str = "abaab";
        printPallindrome(str);
	}
	 public static void printPallindrome(String str)
	    {
	    	 int n = str.length();
	         int count = 0;
	         String s ="";
	         int max=0;
	         int min=Integer.MAX_VALUE;
	         String st="";
	         String stri="";
	    	for (int i = 0; i < n; i++) {
	    		s ="";
	            for (int j = i; j < n; j++) {
	            	s=s+str.charAt(j);
	                if (isPalindrome(s) && s.length()>1) 
	                {
	                	System.out.println(s);
	                    count++;
	                    
	                }
	                if(max<s.length()&&isPalindrome(s))
	                {
	                	max=s.length();
	                	st=s;
	                }
	                if(min>s.length()&& isPalindrome(s))
	                {
	                	min=s.length();
	                	stri=s;
	                }
	                
	            }
	        }

	        System.out.println("Total Number of Pallindrome :"+count);
	        System.out.println("Maximum length pallindrome :"+max+"-->"+st);
	        System.out.println("Manimum length pallindrome :"+min+"-->"+stri);
	        
	    }

	    
	
    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) 
    {
    	int i=0,j=str.length()-1;
    	while(i<j)
    	{
    		if(str.charAt(i)!=str.charAt(j))
    		{
    			return false;
    		}
    		i++;
    		j--;
    	}
		return true;
    	
       
    }
   
}



