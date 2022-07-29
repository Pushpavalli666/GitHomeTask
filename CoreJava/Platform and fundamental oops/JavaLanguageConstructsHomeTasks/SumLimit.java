import java.util.Scanner;
class SumLimit
{
	public static int sumLimit(int a,int b)
	{
		int sum=a+b;
		String s=String.valueOf(sum);
		int sumLength=s.length();
		String val=String.valueOf(a);
		int aLength=val.length();

		if(sumLength==aLength)
			return sum;
		else
			return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a : ");
		int a=sc.nextInt();
		System.out.println("Enter b : ");
		int b=sc.nextInt();

		int sum=sumLimit(a,b);
		System.out.println("Sum is : "+sum);
	}
}