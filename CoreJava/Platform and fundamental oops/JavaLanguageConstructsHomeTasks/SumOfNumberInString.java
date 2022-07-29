import java.util.Scanner;
class SumOfNumberInString
{
	public static int sum(String str)
	{
		String numbers="1234567890";
		int sum=0,i=0;
		String tempNum="";
		while(true)
		{
			if(i<str.length() && numbers.contains(""+str.charAt(i)))
			{
				tempNum=tempNum+str.charAt(i);
			}
			else
			{
				if(!tempNum.equals(""))
				{
					sum=sum+Integer.parseInt(tempNum);
					tempNum="";
				}
			}
			if(i==str.length())
				break;
			i++;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		int result=sum(str);
		System.out.println("The result is : "+result);
	}
}