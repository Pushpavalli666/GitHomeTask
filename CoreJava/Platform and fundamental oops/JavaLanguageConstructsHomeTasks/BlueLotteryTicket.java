import java.util.Scanner;
class BlueLotteryTicket
{
	public static int calculateResult(int a,int b,int c)
	{
		if(a+b==10 || b+c==10 || a+c==10)
			return 10;
		else if((a+b)-10==(b+c) || (a+b)-10==(a+c))
			return 5;
		else return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a : ");
		int a=sc.nextInt();
		System.out.println("Enter b : ");
		int b=sc.nextInt();
		System.out.println("Enter c : ");
		int c=sc.nextInt();

		int result=calculateResult(a,b,c);
		System.out.println("The result is : "+result);

	}
}