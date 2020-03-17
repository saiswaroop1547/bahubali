package Threetimesfirstthreecharacters;

public class UserMainCode 
{
	public static String repeatFirstThreeCharacters(String s,int n)
	{
	String s1="";
	String s2="";
	int m=s.length();
		if(m>3) 
		{
			for(int i=0;i<3;i++)
			{
			s1=s1+s.charAt(i);
			}
		}
			else 
			{
				s1=s1+s;
			}
				for(int j=0;j<n;j++)
				{
					if(j==0)
					{
						s2=s1+s2;
					}
					else
					{
						s1=s1+s2;
					}
				}
				return s1;
	}
}
