import java.util.Scanner;
class CheckSpeed
{
	public static int caughtSpeeding(int speed,boolean isBirthday)
	{
		int sampleSpeed;
		if(isBirthday==true)
			sampleSpeed=65;
		else
			sampleSpeed=60;

		if(speed<=sampleSpeed )
			return 0;
		else if (speed>sampleSpeed && speed<=(sampleSpeed+20)) {
			return 1;
		}
		else
			return 2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter speed : ");
		int speed=sc.nextInt();
		System.out.println("Is your birthday ?(yes/no) : ");
		String s=sc.next();
		boolean isBirthday;
		if(s.equals("yes"))
			isBirthday=true;
		else
			isBirthday=false;

		int result=caughtSpeeding(speed,isBirthday);

		System.out.println("The speed value is : "+result);
	}
}