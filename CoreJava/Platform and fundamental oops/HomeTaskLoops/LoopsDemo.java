import java.util.Scanner;

class LoopsDemo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number : ");
		int num=sc.nextInt();
		System.out.println("Enter X : ");
		int x=sc.nextInt();

		System.out.println("-----Using For Loop-----");
		int value=0;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(value+" ");
				value=value+x;
			}
			System.out.println();
		}

		System.out.println("-----Using while Loop-----");
		value=0;
		int i=0,j;
		while(i<num)
		{
			j=0;
			while(j<i+1)
			{
				System.out.print(value+" ");
				value=value+x;
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println("-----Using Do while Loop-----");
		value=0;
		i=0;
		do{
			j=0;
			
			do{
				System.out.print(value+" ");
				value=value+x;
				j++;
			}while(j<i+1);
			System.out.println();
			i++;
		}while(i<num);
	}
}