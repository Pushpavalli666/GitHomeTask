import java.util.Scanner;

class TeaCandyParty
{
	public static int party(int teaAmount,int candyAmount)
	{
		if(teaAmount<5 || candyAmount<5)
			return 0;
		else if(teaAmount >= 2*candyAmount || candyAmount>=2*teaAmount)
			return 2;
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter amount of tea : ");
		int teaAmount=sc.nextInt();
		System.out.println("Enter amount of candy : ");
		int candyAmount=sc.nextInt();

		int result=party(teaAmount,candyAmount);

		System.out.println("Result of the party is : "+result);
	}
}