import java.util.Scanner;
class MirrorSection
{
	public static int sizeOfLargestMirrorSection(int[] arr)
	{
		int largeSpan=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				int size=0;
				int a=i;
				int b=j;
				while(a<arr.length && b>=0 && arr[a]==arr[b])
				{
					size++;
					a++;
					b--;
				}
				if(largeSpan<size)
					largeSpan=size;
			}
		}
		return largeSpan;
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
		int largeSpan=sizeOfLargestMirrorSection(arr);
		System.out.println("Largest size is : "+largeSpan);
	}
}