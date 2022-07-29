import java.util.Scanner;

class GreatestNumber
{
	public static boolean greatestNumber(int a,int b,int c,boolean BOK)
	{
		if(BOK==false)
		{
			if(a<b && b<c)
				return true;
			else
				return false;
		}
		else
		{
			if(b<c)
				return true;
			else
				return false;
		}

		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a : ");
		int a=sc.nextInt();
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		System.out.println("Enter c : ");
		int c=sc.nextInt();
		System.out.println("Enter bOK value(true/false) : ");
		Boolean BOK=sc.nextBoolean();
		
		boolean result=greatestNumber(a,b,c,BOK);
		System.out.println("The result is : "+result);

	}
}