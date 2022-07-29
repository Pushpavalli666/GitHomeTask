import java.util.Scanner;
class DuplicateCharactersInString
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string : ");
		String s=sc.nextLine();

		String duplicates="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				int c=0;
				if(i!=j)
				{
					if(s.charAt(i)==s.charAt(j))
						c++;
				}
				if(c>0 && !duplicates.contains(""+s.charAt(i)))
					duplicates=duplicates+s.charAt(i);
			}
		}
		System.out.println("Duplicate characters in the given string are : ");
		for(int i=0;i<duplicates.length();i++)
			System.out.println(duplicates.charAt(i));
	}
}