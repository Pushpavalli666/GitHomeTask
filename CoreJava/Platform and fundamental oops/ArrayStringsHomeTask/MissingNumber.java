import java.util.Scanner;
class MissingNumber
{
	public static void main(String[] args) {
		int[] arr=new int[100];
		for(int i=0;i<100;i++)
		{
			arr[i]=i+1;
		}
		arr[50]=0;

		int[] testArray=new int[100];
		for(int i=0;i<100;i++)
		{
			int val=arr[i];
			if(val>0 && val<=100)
				testArray[val-1]=1;
		}
		for(int i=0;i<100;i++)
		{
			if(testArray[i]==0)
			{
				System.out.println("The missing number is : "+(i+1));
			}
		}

	}
}