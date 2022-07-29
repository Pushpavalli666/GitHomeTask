import java.util.Scanner;

class MaxSpan
{
	public static int calculateSpan(int arr[])
	{
		int span=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					int length=j-i+1;
					if(length>span)
						span=length;
				}
			}
		}
		return span;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.println("enter arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		int maxspan=calculateSpan(arr);
		System.out.println("The maximum span is : "+maxspan);

	}
}