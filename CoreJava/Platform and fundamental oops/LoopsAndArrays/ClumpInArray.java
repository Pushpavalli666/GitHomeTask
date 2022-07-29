import java.util.Scanner;
class ClumpInArray
{
	public static int count(int arr[])
	{
		int totalCount=0,elementCount=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
				elementCount++;
			else
			{
				if(elementCount>=2)
				{
					totalCount++;
					elementCount=1;
				}
			}
			if(i==arr.length-1)
			{
				if(elementCount>=2)
					totalCount++;
			}
		}
		return totalCount;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.println("enter arr["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		int c=count(arr);
		System.out.println("Total count : "+c);
	}
}