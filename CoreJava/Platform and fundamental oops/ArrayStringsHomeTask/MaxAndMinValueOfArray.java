import java.util.Scanner;
class MaxAndMinValueOfArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		System.out.print("Enter size of the array : ");
		int size = sc.nextInt();
		arr = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("enter arr["+i+"] value : ");
			arr[i]=sc.nextInt();
		}

		int min=arr[0],max=arr[0];

		for(int i=0;i<size;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Smallest value of the array is : "+min+"\nLargest value of the array is : "+max);
	}
}