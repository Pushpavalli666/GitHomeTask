import java.util.Scanner;
class InnerOuterArray
{
	public static boolean checkArray(int[] arr1,int[] arr2)
	{
		int i=0,j=0;
		while(j<arr2.length && i<arr1.length)
		{
			if(arr1[i]==arr2[j])
			{
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j])
			{
				return false;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
		}
		if(j==arr2.length)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size1;i++)
		{
			System.out.println("enter arr["+i+"] : ");
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter array size : ");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size2;i++)
		{
			System.out.println("enter arr["+i+"] : ");
			arr2[i]=sc.nextInt();
		}

		boolean result=checkArray(arr1,arr2);
		System.out.println("the result is : "+result);
	}
}