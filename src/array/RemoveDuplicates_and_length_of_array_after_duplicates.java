package array;

public class RemoveDuplicates_and_length_of_array_after_duplicates{

	public static void main(String[] args) 
	{
		int[] a= {3,5,6,4,3,5};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int length=a.length;
		length=removeDuplicate(a,length);
		System.out.println("length of array after removing duplicates : "+length);
		for(int i=0;i<length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

	public static int removeDuplicate(int[] a, int length) 
	{
		int j=0;
		int[] temp=new int[length];
		for(int i=0;i<length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[length-1];
		for(int i=0;i<length;i++)
		{
			a[i]=temp[i];
		}
		return j;
	}

}
