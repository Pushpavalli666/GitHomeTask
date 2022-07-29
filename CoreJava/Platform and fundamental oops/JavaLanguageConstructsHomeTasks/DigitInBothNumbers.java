import java.util.Scanner;
class DigitInBothNumbers
{
	public static boolean checkDigit(int a,int b)
	{
		if((a%10)==(b%10) || (a%10)==(b/10))
			return true;
		else if((a/10)==(b%10) || (a/10)==(b/10))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a : ");
		int a=sc.nextInt();
		System.out.println("Enter b : ");
		int b=sc.nextInt();

		boolean result=checkDigit(a,b);
		System.out.println("Two numbers have common digit : "+result);
	}
}