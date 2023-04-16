package array;

public class Print_Only_Duplicates {

	public static void main(String[] args)
	{
		int[] arr= {3,6,4,3,6,9,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int length=arr.length;
		length=printDuplicate(arr,length);
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

	public static int printDuplicate(int[] arr, int length) 
	{
		int j=0;
		int[] temp=new int[length];
		for(int i=0;i<length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[length-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		return j;
	}

}
