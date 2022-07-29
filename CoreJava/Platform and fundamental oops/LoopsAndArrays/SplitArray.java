import java.util.Scanner;
class SplitArray
{
	public static boolean canBalance(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int firstSum=0;
			for(int j=0;j<i;j++)
				firstSum+=arr[j];
			int secondSum=0;
			for(int k=i;k<arr.length;k++)
				secondSum+=arr[k];
			if(firstSum==secondSum)
				return true;
		}
		return false;
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
		boolean result=canBalance(arr);
		System.out.println("can split array : "+result);
	}
}