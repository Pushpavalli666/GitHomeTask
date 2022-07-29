import java.util.Scanner;

class DisplayName
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter your name : ");
		String name=sc.nextLine();

		System.out.println("Hello, "+name);
	}
}