import java.util.Scanner;

class Calculator
{
	public static void addition(double a,double b)
	{
		System.out.println("Addition of given two numbers is : "+(a+b));

	}

	public static void substraction(double a,double b)
	{
		System.out.println("The result of the substraction is : "+(a-b));
	}

	public static void multiplication(double a, double b)
	{
		System.out.println("multiplication of given two numbers is : "+(a*b));
	}

	public static void division(double a, double b)
	{
		if(b!=0)
			System.out.println("The result of the division is : "+(a/b));
		else 
			System.out.println("The result of the division is : undefined");
	}

	public static void reminder(double a, double b)
	{
		System.out.println("result of the reminder is : "+(a%b));
	}

	public static void percentage(double a, double b)
	{
		System.out.println(a+"% of "+b+" is : "+(a*b)/100);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.print("Enter first number : ");
			double a=sc.nextDouble();
			System.out.print("Enter second number : ");
			double b=sc.nextDouble();

			System.out.println("Enter 1 to perform addition");
			System.out.println("Enter 2 to perform substraction");
			System.out.println("Enter 3 to perform multiplication");
			System.out.println("Enter 4 to perform division");
			System.out.println("Enter 5 to perform reminder");
			System.out.println("Enter 6 to calculate percentage");

			int operation = sc.nextInt();

			switch(operation)
			{
			case 1 :
				addition(a,b);
				break;
			case 2 :
				substraction(a,b);
				break;
			case 3 :
				multiplication(a,b);
				break;
			case 4 :
				division(a,b);
				break;
			case 5 :
				reminder(a,b);
				break;
			case 6 :
				percentage(a,b);
				break;
			default :
				System.out.println("please choose a correct number");
				break;

			}

			System.out.print("Enter any character to continue, 0 to exit : ");
			String processStatus = sc.next();
			if(processStatus.equals("0"))
				break;

		}
	}
}