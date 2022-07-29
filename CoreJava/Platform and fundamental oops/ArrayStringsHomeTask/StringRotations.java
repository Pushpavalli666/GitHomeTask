public class StringRotations {
	public static boolean isRotationOfAnotherString(String s1,String s2)
	{	
		if(s1.length()!=s2.length())
			return false;
		if(!s2.contains(""+s1.charAt(0)))
			return false;
		
		int fromIndex=0;
		while(s2.indexOf(s1.charAt(0), fromIndex)!=-1)
		{
			boolean rotations=false;
			int index=s2.indexOf(s1.charAt(0), fromIndex);
			for(int i=0,j=index;i<s1.length();i++,j=(j+1)%s1.length())
			{
				if(s1.charAt(i)!=s2.charAt(j))
					break;
				if(i==s1.length()-1)
					rotations=true;
			}
			
			if(rotations)
				return true;
			fromIndex=s2.indexOf(s1.charAt(0), fromIndex)+1;
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="pushpa";
		String s2="shpapu";
		System.out.println(isRotationOfAnotherString(s1,s2));

	}
}