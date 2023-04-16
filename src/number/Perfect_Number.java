package number;

public class Perfect_Number 
{
	
	    public static void main(String[] args) 
	    {
	        int count=0;
	       for(int i=20;i<100;i++)
	       {
	           boolean res=isPerfect(i);
	          if(res==true){
	          count++;
	          System.out.println(i+" is a Perfect Number");
	          }
	          
	       }
	       System.out.println();
	       System.out.println("No of Perfect no"+count);
	        
	     }
	     public static boolean isPerfect( int n)
	     {
	         int temp=n;
	         int sum=0;
	         for(int i=1;i<=n/2;i++)
	         {
	             if(n%i==0)
	             sum=sum+i;
	         }
	         if(sum==temp)
	         return true;
	         else
	         return false;
	     }
	

}
