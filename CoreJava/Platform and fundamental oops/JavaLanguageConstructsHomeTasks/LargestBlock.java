import java.util.Scanner;

class LargestBlock
{
	public static int largeBlock(String str)
	{
		int c=1,max=0;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				c++;
			}
			else
			{
				if(max<c)
					max=c;
				c=1;
			}
		}
		if(max<c)
			max=c;
		return max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		int length=largeBlock(str);
		System.out.println("Largest block is : "+length);
	}
}