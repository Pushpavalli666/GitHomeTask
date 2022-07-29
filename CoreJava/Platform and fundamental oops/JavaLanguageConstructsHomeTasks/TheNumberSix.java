import java.util.Scanner;
import java.lang.Math;

class TheNumberSix
{
	public static boolean checkNumber(int a,int b)
	{
		if(a==6 || b==6)
			return true;
		else if((a+b)==6)
			return true;
		else if(Math.abs(a-b)==6)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();

		boolean result=checkNumber(a,b);

		System.out.println("The result is : "+result);
	}
}