import java.util.Scanner;
class RemoveCharacters
{
	public static String withoutString(String str,String remove)
	{
		String copyOfString=str.toLowerCase();
		String newString=copyOfString.replace(remove.toLowerCase(),"");
		return newString;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String remove=sc.nextLine();
		String result=withoutString(str);
		System.out.println(result);

	}
}